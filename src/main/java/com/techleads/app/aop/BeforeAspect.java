package com.techleads.app.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class BeforeAspect {

	private static Logger logger = LoggerFactory.getLogger(BeforeAspect.class);

	//execution(* package.*.*(..))
	//execution(retuntype pakcagName.className.methodName(paramenters)
	@Before("execution(* com.techleads.app.service.*.*(..))")
	public void beforeAdvice(JoinPoint joinPoint) {
		logger.info("intercepting method call{} "+joinPoint);

	}

}
