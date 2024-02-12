package com.ashcollege.responses.models;

import com.ashcollege.entities.Note;

import java.text.SimpleDateFormat;

public class NoteModel {
    private int id;
    private String content;
    private String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public NoteModel(Note note) {
        this.id = note.getId();
        this.content = note.getContent();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        this.date = simpleDateFormat.format(note.getDate());


    }
}
