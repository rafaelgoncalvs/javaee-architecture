package rafaelgoncalves.javaeearchitecture.infra;

import rafaelgoncalves.javaeearchitecture.application.Transaction;

public class TransactionImpl implements Transaction {

	@Override
	public void begining() {
		System.out.println("Start transaction");
	}

	@Override
	public void commit() {
		System.out.println("Commit transaction");
	}

	@Override
	public void rollback() {
		System.out.println("Rollback transaction");
	}
	
}
