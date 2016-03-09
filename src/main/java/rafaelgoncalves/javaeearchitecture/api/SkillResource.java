package rafaelgoncalves.javaeearchitecture.api;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import rafaelgoncalves.javaeearchitecture.application.AddSkill;
import rafaelgoncalves.javaeearchitecture.application.QuerySkill;
import rafaelgoncalves.javaeearchitecture.application.SkillDTO;

@Path("skills")
public class SkillResource {

    private QuerySkill querySkill;
    
	private AddSkill addSkill;

	@Inject
    public SkillResource(QuerySkill querySkill, AddSkill addSkill) {
		this.querySkill = querySkill;
		this.addSkill = addSkill;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
    public List<SkillDTO> get() {
		List<SkillDTO> skillDTOs = querySkill.findAll();
    	return skillDTOs;
    }
	
	//@POST
	@GET
	@Path("/{name}")
	public void add(@PathParam("name") String name) {
		SkillDTO skillDTO = new SkillDTO(name);
		addSkill.add(skillDTO);
	}

}
