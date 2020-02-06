package com.noteProject.note.dao;

import org.springframework.stereotype.Repository;

import com.noteProject.note.model.NoteModel;
import com.noteProject.note.model.NoteRegistrationModel;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface NoteDao extends JpaRepository <NoteModel,Integer> {

	NoteRegistrationModel findByEmailId(String emailId);
	
	NoteRegistrationModel findByPassword(String password);

}
