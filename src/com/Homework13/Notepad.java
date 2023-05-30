package com.Homework13;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Notepad {
    private Map<String, Note> notes;

    public Notepad() {
        this.notes = new TreeMap<>();
    }

    public void addNote(String date, String lastName) throws NotepadException {
        if (notes.containsKey(date)) {
            throw new NotepadException("A note for this date already exists.");
        }
        Note note = new Note(lastName);
        notes.put(date, note);
    }

    public Note getNote(String date) {
        return notes.get(date);
    }

    public List<Note> getAllNotes() {
        List<Note> noteList = new ArrayList<>(notes.values());
        Collections.sort(noteList);
        return noteList;
    }

    public static class Note implements Comparable<Note> {
        private String lastName;

        public Note(String lastName) {
            this.lastName = lastName;
        }

        public String getLastName() {
            return lastName;
        }

        @Override
        public int compareTo(Note o) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate date1 = LocalDate.parse(this.toString(), formatter);
            LocalDate date2 = LocalDate.parse(o.toString(), formatter);
            return date1.compareTo(date2);
        }

        @Override
        public String toString() {
            return lastName;
        }
    }
}
