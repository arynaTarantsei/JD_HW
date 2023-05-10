package com.Homework8;


public class Task3 {
    public static void main(String[] args) {
        String text = Constants.TEXT_BLOCK;
        String processedText = TextProcessor.replaceCharsInWords(text);
        System.out.println(processedText);
        System.out.println("Слова начинающиеся на согласную, а заканчивающиеся на гласную: ");
        TextProcessor.printWordsStartingWithConsonantAndEndingWithVowel(text);
    }

    public static class TextProcessor {

        public static String replaceCharsInWords(String input) {
            StringBuilder builder = new StringBuilder();
            String[] words = input.split("\\s+");
            for (String word : words) {
                if (word.length() >= 4) {
                    if (word.length() >= 7) {
                        builder.append(word, 0, 3);
                        builder.append("#");
                        builder.append(word, 4, 6);
                        builder.append("#");
                        builder.append(word.substring(7));
                    } else {
                        builder.append(word, 0, 3);
                        builder.append("#");
                        builder.append(word.substring(4));
                    }
                } else {
                    builder.append(word);
                }
                builder.append(" ");
            }
            return builder.toString();
        }

        public static void printWordsStartingWithConsonantAndEndingWithVowel(String input) {
            StringBuilder builder = new StringBuilder();
            String[] words = input.split("\\s+");
            for (String word : words) {
                if (word.matches("^[a-zA-Z]+") && (word.length() >= 2)) {
                    char firstChar = Character.toLowerCase(word.charAt(0));
                    char lastChar = Character.toLowerCase(word.charAt(word.length() - 1));
                    if (isConsonant(firstChar) && isVowel(lastChar)) {
                        builder.append(word).append(" ");
                    }
                }
            }
            System.out.println(builder);
        }




        private static boolean isConsonant(char c) {
            return "bcdfghjklmnpqrstvwxyz".indexOf(c) != -1;
        }

        private static boolean isVowel(char c) {
            return "aeiou".indexOf(c) != -1;
        }
    }
}
