package com.example.notesapiapp.service;

import com.example.notesapiapp.model.Note;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class NoteService {
    private List<Note> notes = new ArrayList<>();
    private AtomicLong idCounter = new AtomicLong();

    public List<Note> getAllNotes() {
        return notes;
    }

    public Optional<Note> getNoteById(Long id) {
        return notes.stream().filter(note -> note.getId().equals(id)).findFirst();
    }

    public Note createNote(Note note) {
        note.setId(idCounter.incrementAndGet());
        notes.add(note);
        return note;
    }

    public Optional<Note> updateNote(Long id, Note note) {
        return getNoteById(id).map(existingNote -> {
            existingNote.setTitle(note.getTitle());
            existingNote.setBody(note.getBody());
            return existingNote;
        });
    }

    public boolean deleteNoteById(Long id) {
        return notes.removeIf(note -> note.getId().equals(id));
    }
}