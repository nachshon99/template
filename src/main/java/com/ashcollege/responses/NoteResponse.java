package com.ashcollege.responses;

import com.ashcollege.entities.Note;
import com.ashcollege.responses.models.NoteModel;

import java.util.LinkedList;
import java.util.List;

public class NoteResponse extends BasicResponse{
    private List<NoteModel> noteList;

    public NoteResponse(boolean success, Integer errorCode, List<Note> noteList) {
        super(success, errorCode);
        this.noteList = new LinkedList<>();
        for (Note note : noteList){
            this.noteList.add(new NoteModel(note));
        }
    }
}
