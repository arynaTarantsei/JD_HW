package com.Homework14;
import java.io.*;
public class Task3 {
    public static void main(String[] args) {
        String path =System.getProperty("user.dir")+"/src/com/Homework14/";
        String inputFileName = "input.txt";
        String outputFileName = "occurrences.txt";
        String fullPath1 = path+inputFileName;
        String fullPath2 = path+outputFileName;

        try {
            generateInputFile(fullPath1);

            int count = countOccurrences(fullPath1, 'a');
            writeOccurrencesToFile(fullPath2, count);

            System.out.println("Вхождения 'a' были записаны в " + fullPath2);
        } catch (IOException e) {
            System.out.println("Произошла ошибка при обработке файла.");
            e.printStackTrace();
        }
    }

    private static void generateInputFile(String fileName) throws IOException {
        String text = "Sed nisi dui id malesuada pellentesque cras eleifend in sed lectus velit sed ex. Adipiscing imperdiet dictum sit et. Nec augue mollis est. Tortor, tempus sit ut. Imperdiet in et mollis ultricies. Et imperdiet non tortor, et. Efficitur risus hac sed sit sapien vulputate platea vestibulum amet, non dolor pulvinar molestie ultricies. Vestibulum in amet, et platea imperdiet adipiscing sit luctus sit aenean ut. Non in est. Ultricies. Mauris nunc leo, libero, vulputate non ornare lectus vulputate mauris sed nisi non orci, nisi sed quis, dictumst. Non morbi est. Eleifend sit tempus arcu sodales id leo, faucibus. Sit quis, ut. Amet, ex. Non dictumst. Urna ornare platea faucibus. Est. Cursus est. Dui venenatis ornare ipsum elit. Cras orci, nec pulvinar ut. Et. Pellentesque dictum lectus imperdiet et. Et. Libero, luctus ut. Ipsum in luctus platea malesuada augue consectetur id quam, sit amet id cursus ornare amet, ipsum sit arcu vestibulum molestie ornare dictum. Non platea ut. In et mattis dolor consectetur luctus mattis dictumst. Sit elit. Pulvinar ornare molestie in dui vestibulum luctus est. Accumsan cras quis, vitae non urna platea ornare sit nec augue eleifend platea ultricies. Amet, sed elit. Velit leo, risus justo luctus sit dolor sit ex. Et quis, sed vel lorem in sodales sed vitae tempus pulvinar mattis vel est. Libero, quis, dictumst. Imperdiet quam, mauris ultricies. Imperdiet sit adipiscing accumsan lacinia vel nec lectus est. Arcu lacinia libero, dolor non sit ornare dolor nisi quam, arcu in sodales risus velit arcu non nulla dolor ornare sodales vestibulum velit amet, est. Nec quam, leo, in non vestibulum augue velit quis, dictum sit odio. Sapien in nunc hac amet augue pellentesque quam, justo libero, non tempus imperdiet vulputate sit integer id non vel faucibus. Mollis integer vulputate nulla mattis sapien sit sed sapien eget odio. Nec sit sed morbi sed dictumst. Nulla faucibus. Quis, sit eget dictum. Malesuada non in tortor, ut. Vel dui platea amet id dictum ";

        try (OutputStream outputStream = new FileOutputStream(fileName)) {
            PrintWriter writer = new PrintWriter(outputStream);
            writer.println(text);
            writer.flush();
        }
    }

    private static int countOccurrences(String fileName, char targetChar) throws IOException {
        try (InputStream inputStream = new FileInputStream(fileName);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            int count = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    if (c == targetChar) {
                        count++;
                    }
                }
            }

            return count;
        }
    }

    private static void writeOccurrencesToFile(String fileName, int count) throws IOException {
        try (OutputStream outputStream = new FileOutputStream(fileName)) {
            PrintWriter writer = new PrintWriter(outputStream);
            writer.println("Количество вхождений символа 'a': " + count);
            writer.flush();
        }
    }
}
