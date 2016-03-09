package rafaelgoncalves.javaeearchitecture.api;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import rafaelgoncalves.javaeearchitecture.application.QuerySkill;
import rafaelgoncalves.javaeearchitecture.domain.Skill;

@Path("skills")
public class SkillResource {

    private QuerySkill querySkill;

	@Inject
    public SkillResource(QuerySkill querySkill) {
		this.querySkill = querySkill;
	}

	@GET
    public String get() {
		List<Skill> skills = querySkill.findAll();
    	return skills.toString();
    }

}
