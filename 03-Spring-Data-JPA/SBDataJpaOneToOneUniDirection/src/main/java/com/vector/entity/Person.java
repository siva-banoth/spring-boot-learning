package com.vector.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
	
	@Id
	Long id;
	
	String name;
	
	String gender;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "passport_number")
	Passport passport;

}
