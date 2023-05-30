package com.Homework13;
import java.util.List;
public class Task2 {
    public static void main(String[] args) {
        Notepad notepad = new Notepad();

        try {
            notepad.addNote("05-07-2021", "Иванов");
            notepad.addNote("01-08-2021", "Петров");
            notepad.addNote("10-06-2021", "Сидоров");
            notepad.addNote("19-05-2021", "Смирнов");
            notepad.addNote("05-07-2021", "Кузнецов");
        } catch (NotepadException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(notepad.getNote("01-08-2021").getLastName());

        List<Notepad.Note> noteList = notepad.getAllNotes();
        for (Notepad.Note note : noteList) {
            System.out.println(note.toString());
        }
    }
}
