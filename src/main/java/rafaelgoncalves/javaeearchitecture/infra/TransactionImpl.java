package rafaelgoncalves.javaeearchitecture.infra;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import rafaelgoncalves.javaeearchitecture.application.Transaction;

public class TransactionImpl implements Transaction {
	
	private EntityManager entityManager;
	
    @Inject
	public TransactionImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public void begining() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commit() {
		entityManager.getTransaction().commit();;
	}

	@Override
	public void rollback() {
		entityManager.getTransaction().rollback();
	}
	
}
