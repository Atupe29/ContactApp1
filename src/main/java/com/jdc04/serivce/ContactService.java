package com.jdc04.serivce;

import java.util.List;

import com.jdc04.Entity.Contact;

public interface ContactService {

	public boolean saveContact(Contact contact);

	public List<Contact> getAllcontact();

	public Contact getContactById(Integer contact);

	public boolean deleteContactById(Integer contactId);

}
