package rafaelgoncalves.javaeearchitecture.api;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@ApplicationService
public class ApplicationServiceInterceptor {

	@AroundInvoke
	private Object intercept(InvocationContext invocationContext) throws Throwable {
		Optional<Object> object = Optional.empty(); 
		try {
			object = Optional.of(invocationContext.proceed());
			System.out.println("Method called: " + invocationContext.getMethod());
		} catch (InvocationTargetException e) {
			throw e.getTargetException();
		}
		return object.get();
	}
	
}
