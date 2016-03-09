package rafaelgoncalves.javaeearchitecture.domain;

import java.util.List;

public interface SkillRepository {

	List<Skill> findAll();
	
	void add(Skill skill);
	
}
