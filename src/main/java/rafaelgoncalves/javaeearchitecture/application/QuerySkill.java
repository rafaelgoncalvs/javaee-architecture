package rafaelgoncalves.javaeearchitecture.application;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import rafaelgoncalves.javaeearchitecture.domain.Skill;
import rafaelgoncalves.javaeearchitecture.domain.SkillRepository;

@ApplicationService
public class QuerySkill {

	private SkillRepository skillRepository;

	@Inject
	public QuerySkill(SkillRepository skillRepository) {
		this.skillRepository = skillRepository;
	}

	public List<SkillDTO> findAll() {
		List<Skill> skills = skillRepository.findAll();
		return skills.stream()
				.map(skill -> createSkillDTO(skill))
				.collect(Collectors.toList());
	}

	private SkillDTO createSkillDTO(Skill skill) {
		return new SkillDTO(
				skill.getId(), 
				skill.getName());
	}
}
