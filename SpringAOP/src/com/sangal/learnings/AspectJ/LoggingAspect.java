package com.sangal.learnings.AspectJ;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	/*
	 * @Before("execution(public String getName())") public void
	 * LoggingAspectAdvice(){ System.out.println(
	 * "This is an Aspect Advice called"); }
	 * 
	 * @Before(
	 * "execution(public String com.sangal.learnings.Model.Circle.getName())")
	 * public void LoggingAspectAdvice2(){ System.out.println(
	 * "This is an Aspect Advice called only if Circle Class getName method is called"
	 * ); }
	 */

	@Before("allGetters()")
	public void LoggingAspectAdvice3() {
		System.out.println("Advice 3::This is an Aspect Advice called whenever a getter method is called for Circle Class");
	}

	@Before("allGetters()")
	public void LoggingAspectAdvice4() {
		System.out.println("Advice 4::This is an Aspect Advice called whenever a getter method is called for Circle Class");
	}

	@Pointcut("execution(public * com.sangal.learnings.Model.Circle.get*(..))")
	public void allGetters() {
	}

	@After("ClassSpecificAdvice()")
	public void CircleClassSpecificAdvice() {
		System.out.println("This method is called Only for Triangle specific methods");
	}

	@Pointcut("within(com.sangal.learnings.Model.Triangle)")
	public void ClassSpecificAdvice() {
	}

	//Some Pointcut expression are mentioned below for reference and testing in future.
	
	@Pointcut("execution(* com.sangal.learnings.Model.*.*(..))")
	public void Tutorial1() {
		System.out.println("This will print wheneven any method is called within Model package");
	}//This will execute when will i mention @After and @Before annotations.
	
	@AfterReturning("Tutorial2()")
	public void ArgumentMethod(){
		System.out.println("This is an argument method call. For Instance: Using Setter");
	}
	
	@Pointcut("args(String)")
	public void Tutorial2() {
	//	System.out.println("Execute for the methods having String as an argument for example set functions.");
	}
	
	
	
/*	@Before("allGetters() && ClassSpecificAdvice()")
	public void JoinPointTest(JoinPoint joinPoint){
		System.out.println(joinPoint.getTarget());// gets the target object to get control over the Running object.
	}
	
	@Before("args(name)")// tags all the methods who have argument named "name"
	public void JoinPointTest(JoinPoint joinPoint){
		System.out.println(joinPoint.getTarget());// gets the target object to get control over the Running object.
	}
	*
	*/
}