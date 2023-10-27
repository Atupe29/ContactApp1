package com.jdc04.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdc04.Entity.Contact;

public interface ContactRepositry extends JpaRepository<Contact, Serializable> {

}
