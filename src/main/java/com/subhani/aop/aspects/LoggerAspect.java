package com.subhani.aop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
	
	@Before("execution (* *Employee(..) )")
	public void logBefore() {
		System.out.println("@Before ASPECT RUNNING ....");
	}

	@After("execution (* *Employee(..) )")
	public void logAfter() {
		System.out.println("@After ASPECT RUNNING ....");
	}
}
