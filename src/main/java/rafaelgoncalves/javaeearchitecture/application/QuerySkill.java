package rafaelgoncalves.javaeearchitecture.application;

import java.util.List;

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

	public List<Skill> findAll() {
		return skillRepository.findAll();
	}
}
