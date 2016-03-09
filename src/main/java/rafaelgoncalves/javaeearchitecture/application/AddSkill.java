package rafaelgoncalves.javaeearchitecture.application;

import javax.inject.Inject;

import rafaelgoncalves.javaeearchitecture.domain.Skill;
import rafaelgoncalves.javaeearchitecture.domain.SkillRepository;

@ApplicationService
public class AddSkill {

	private SkillRepository skillRepository;
	
	@Inject
	public AddSkill(SkillRepository skillRepository) {
		this.skillRepository = skillRepository;
	}

	public void add(SkillDTO skillDTO) {
		Skill skill = Skill.of(skillDTO.getName());
		skillRepository.add(skill);
	}
}
