package rafaelgoncalves.javaeearchitecture.application;

public interface Transaction {
	void begining();
	void commit();
	void rollback();
}
