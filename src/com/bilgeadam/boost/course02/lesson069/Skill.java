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
@NoArgsConstructor
@RequiredArgsConstructor
@Getter @Setter
@Entity @Table (name = "skills")
public class Skill {
	@Id
	@GeneratedValue (strategy =  GenerationType.AUTO)
	@Getter
	private long oid;
	@Getter
	@NonNull
	@Column (name = "name", unique = true, nullable = false)
	private String name;
}
