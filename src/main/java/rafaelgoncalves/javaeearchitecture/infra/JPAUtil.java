package rafaelgoncalves.javaeearchitecture.infra;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	@Produces
	@ApplicationScoped
	public EntityManagerFactory createEntityManagerFactory() {
		return Persistence.createEntityManagerFactory("prod");
	}
	
	@Produces
	@RequestScoped
	public EntityManager createEntityManager(EntityManagerFactory entityManagerFactory) {
		return entityManagerFactory.createEntityManager();
	}

	public void finaliza(@Disposes EntityManager entityManager) {
		entityManager.close();
	}
}
