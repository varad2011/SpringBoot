package com.noteProject.note.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.noteProject.note.model.NoteModel;
import com.noteProject.note.model.NoteRegistrationModel;
import com.noteProject.note.service.NoteService;

@RestController
public class NoteController {
	
	@Autowired
	private NoteService noteService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/saveNote")
	public void NewEntryaAdd(@RequestBody NoteModel noteModel ) {
		
		System.out.println("save successfully" + noteModel);
		noteService.createNewNote(noteModel);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/login")
	public void UserLogin(@RequestBody NoteRegistrationModel noteRegistrationModel) {
		noteService.checkUserAvailability(noteRegistrationModel);
	}
}
