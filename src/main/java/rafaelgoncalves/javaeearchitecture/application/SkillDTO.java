package rafaelgoncalves.javaeearchitecture.application;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SkillDTO {

	private Long id;
	
	private String name;

	public SkillDTO(String name) {
		this.name = name;
	}
	
	public SkillDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
