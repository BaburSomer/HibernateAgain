package com.bilgeadam.boost.course02.lesson069;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ratings")
public class Rating {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long   oid;
	@ManyToOne
	private Person rater;
	@ManyToOne
	private Person rated;
	@ManyToOne
	private Skill  skill;
	@Column(name = "rating", nullable = false)
	private int    rating;

	public Rating(Person rater, Person rated, Skill skill, int rating) {
		this.rater  = rater;
		this.rated  = rated;
		this.skill  = skill;
		this.rating = rating;
	}
}