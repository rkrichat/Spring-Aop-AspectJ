package com.spring.aopaspect.aspectj;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectJ {
	
	@Pointcut("execution(* *(..))")
	public void colorPointCut() {}
	
	@Before("colorPointCut()")
	public void beforeRunTraget() {
		System.out.println("---> Before run traget method");
	}
	
	@After("colorPointCut()")
	public void afterRunTraget() {
		System.out.println("---> After run traget method");
	}
	
	@Around("colorPointCut()")
	public void around() {
		System.out.println("---> Work around");
	}
	
	@AfterThrowing("colorPointCut()")
	public void afterThrowing() {
		System.out.println("---> After throwing");
	}
	
	@AfterReturning("colorPointCut()")
	public void afterReturning() {
		System.out.println("---> After returning");
	}
}


