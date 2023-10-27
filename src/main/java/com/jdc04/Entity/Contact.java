package com.jdc04.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "CONTACT_DLTS")
@Data
public class Contact {
	@Id
	@GeneratedValue
	@Column(name = "CONTACT_ID")
	private Integer contactId;

	@Column(name = "CONTACT_NAME")
	private String contactName;

	@Column(name = "CONTACT_EMAIL")
	private String contactEmail;

	@Column(name = "CONTACT_NUMBER")
	private Long contactNumber;

	@Column(name = "ACTIVESWITCH")
	private Character activeSwitch;

	@Column(name = "CONTACT_CREATE")
	private LocalDate createDate;

	@Column(name = "CONTACT_UPDATED")
	private LocalDate updatedDate;

}
