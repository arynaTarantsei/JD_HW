package com.Homework13;
import java.util.List;
public class Task2 {
    public static void main(String[] args) {
        Notepad notepad = new Notepad();

        try {
            notepad.addNote("01-06-2023", "Смит");
            notepad.addNote("03-06-2023", "Джон");
            notepad.addNote("02-06-2023", "Браун");
            notepad.addNote("01-06-2023", "Уилсон");
        } catch (DuplicateNoteException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("Записи в порядке дат:");
        List<Notepad.Note> allNotes = notepad.getAllNotes();
        for (Notepad.Note note : allNotes) {
            System.out.println(note.getLastName());
        }

        String dateToGet = "03-06-2023";
        Notepad.Note note = notepad.getNote(dateToGet);
        if (note != null) {
            System.out.println("Запись на " + dateToGet + ": " + note.getLastName());
        } else {
            System.out.println("Запись на " + dateToGet + " не найдена");
        }
    }
}
