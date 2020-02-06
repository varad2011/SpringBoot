package com.noteProject.note.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.noteProject.note.dao.NoteDao;
import com.noteProject.note.model.NoteModel;
import com.noteProject.note.model.NoteRegistrationModel;

@Service
public class NoteService {
	
	@Autowired
	private NoteDao  noteDao;
	
	public NoteRegistrationModel checkUserAvailability(NoteRegistrationModel noteRegistrationModel) {
		
		String emailId = noteRegistrationModel.getEmailId();
		String password = noteRegistrationModel.getPassword();
		
		try {
			NoteRegistrationModel noteRegistrationModel1 = noteDao.findByEmailId(emailId);
			
			if((noteRegistrationModel1.getEmailId().equalsIgnoreCase(emailId)) && (noteRegistrationModel1.getPassword().equalsIgnoreCase(password))){	
				
				System.out.println("user login successfully");
				
			}else {
				
				System.out.println("invalid username and password");
			}
		}catch(Exception e) {
			
		}
		return null;
	}
	
	//find loginUser Name method
	public String getLoginUserName(NoteRegistrationModel noteRegistrationModel) {
		String name = noteRegistrationModel.getName();
		return  noteRegistrationModel.getName();
	}
	
	//find LoginUser id method
	public int getLoginUserId(NoteRegistrationModel noteRegistrationModel) {
		
		return noteRegistrationModel.getId(); 
	}
	
	//new note create method
	public void createNewNote(NoteModel noteModel) {
		noteModel.setAtModified();
		noteModel.setAtCreated();
		noteDao.save(noteModel);
		System.out.println("save successfully" +noteModel);
	}
	
	//delete notes method
	public void deleteNote(NoteModel noteModel) {
		noteDao.delete(noteModel);
	}
}
