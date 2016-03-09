package rafaelgoncalves.javaeearchitecture.infra;

import java.util.Collections;
import java.util.List;

import rafaelgoncalves.javaeearchitecture.domain.Skill;
import rafaelgoncalves.javaeearchitecture.domain.SkillRepository;

public class SkillDAO implements SkillRepository {

	//@PersistenceContext
    //private EntityManager em;

	@Override
	public List<Skill> findAll() {
		return Collections.emptyList();
	}
	
}
