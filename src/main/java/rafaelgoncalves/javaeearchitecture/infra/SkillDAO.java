package rafaelgoncalves.javaeearchitecture.infra;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import rafaelgoncalves.javaeearchitecture.domain.Skill;
import rafaelgoncalves.javaeearchitecture.domain.SkillRepository;

public class SkillDAO implements SkillRepository {

    private EntityManager entityManager;
	
    @Inject
	public SkillDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

    @Override
	public void add(Skill skill) {
		entityManager.persist(skill);
	}
    
    @Override
	public List<Skill> findAll() {
		System.out.println("method findAll Skills called");
		Query query = entityManager.createQuery("SELECT skill FROM Skill skill");
		List<Skill> skills = query.getResultList();
		return skills != null ? skills : Collections.emptyList();
	}
	
}
