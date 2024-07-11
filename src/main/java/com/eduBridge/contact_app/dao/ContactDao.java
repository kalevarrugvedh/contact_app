package com.eduBridge.contact_app.dao;

 import java.util.List;

import com.eduBridge.contact_app.model.Contact;
 
	public interface ContactDao{
		List<Contact> getAllContacts();
		Contact getContact(String name);
		int addContact(Contact c);
		int updateContact(Contact c);
		int deleteContact(String name);
		void deleteAllContacts();

		
	}

