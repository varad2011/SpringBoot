package com.noteProject.note.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class NoteModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@GeneratedValue()
	private int userId;
	private String username;
	private String title;
	private String content;
	private LocalDateTime atCreated;
	private LocalDateTime atModified;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public LocalDateTime getAtCreated() {
		return atCreated;
	}
	
	public void setAtCreated() {
		this.atCreated = atCreated.now();
	}
	
	public LocalDateTime getAtModified() {
		return atModified;
	}
	
	public void setAtModified() {
		this.atModified = atModified.now();
	}

	@Override
	public String toString() {
		return "NoteModel [id=" + id + ", userId=" + userId + ", username=" + username + ", title=" + title
				+ ", content=" + content + ", atCreated=" + atCreated + ", atModified=" + atModified + "]";
	}
	
	
}
