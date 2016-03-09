package rafaelgoncalves.javaeearchitecture.application;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@ApplicationService
public class ApplicationServiceInterceptor {

	@Inject
	private Transaction transaction;
	
	@AroundInvoke
	private Object intercept(InvocationContext invocationContext) throws Throwable {
		Optional<Object> object = Optional.empty(); 
		try {
			transaction.begining();
			Object objectReturned = invocationContext.proceed();
			if(objectReturned != null) {
				object = Optional.of(objectReturned);
			}
			System.out.println("Method called: " + invocationContext.getMethod());
			transaction.commit();
		} catch (InvocationTargetException e) {
			transaction.rollback();
			throw e.getTargetException();
		}
		return object.orElse(null);
	}
	
}
