package com.bilgeadam.boost.course02.lesson069;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString 
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Entity @Table (name = "persons")
public class Person {   // klasik bir POJO (Plain Old Java Object)
	@Id
	@GeneratedValue (strategy =  GenerationType.AUTO)
	private long oid;
	@Getter
	@Column (name = "first_name", unique = true, nullable = false) @NonNull
	private String firstName;
	@Getter @Setter
	@NonNull
	@Column (name = "last_name", nullable = false)
	private String lastName;
	
	@Getter @Setter
	@Column (name = "middle_name")
	private String middleName;
	
}
