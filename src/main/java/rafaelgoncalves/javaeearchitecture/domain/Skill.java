package rafaelgoncalves.javaeearchitecture.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private Skill() {
	}

	private Skill(String name) {
		this.name = name;
	}
	
	public static Skill of(String name) {
		return new Skill(name);
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
