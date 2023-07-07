package com.Homework13;

import java.util.*;

public class Notepad {
    private Map<String, Note> notes;

    public Notepad() {
        notes = new TreeMap<>();
    }

    public void addNote(String date, String lastName) throws DuplicateNoteException {
        if (notes.containsKey(date)) {
            throw new DuplicateNoteException("Запись на эту дату уже существует: " + date);
        }

        Note note = new Note(lastName);
        notes.put(date, note);
    }

    public Note getNote(String date) {
        return notes.get(date);
    }

    public List<Note> getAllNotes() {
        return new ArrayList<>(notes.values());
    }

    public class Note {
        private String lastName;

        public Note(String lastName) {
            this.lastName = lastName;
        }

        public String getLastName() {
            return lastName;
        }
    }
}
