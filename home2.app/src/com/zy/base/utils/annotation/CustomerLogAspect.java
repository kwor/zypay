package com.zy.base.utils.annotation;

import javax.annotation.Resource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.zy.base.pojo.CustomerLog;
import com.zy.base.service.CustomerLogService;

@Aspect
@Component
public class CustomerLogAspect {
	// 注入Service用于把日志保存数据库
	@Resource // 这里我用resource注解，一般用的是@Autowired，他们的区别如有时间我会在后面的博客中来写
	private CustomerLogService customerLogService;

	private static final Logger logger = LoggerFactory.getLogger(CustomerLogAspect.class);

	// Controller层切点
	@Pointcut("execution (* com.zy.base.controller.CustomerController.*(..))")
	public void controllerAspect() {
	}

	/**
	 * 前置通知 用于拦截Controller层记录用户的操作
	 * 
	 * @param joinPoint
	 *            切点
	 */

	/*
	 * @Before("controllerAspect()") public void doBefore(JoinPoint joinPoint) {
	 * System.out.println("==========执行controller前置通知===============");
	 * if(logger.isInfoEnabled()){ logger.info("before " + joinPoint); } } //
	 */
	// 配置controller环绕通知,使用在方法aspect()上注册的切入点
	/*
	 * @Around("controllerAspect()") public void around(JoinPoint joinPoint){
	 * System.out.println("==========开始执行controller环绕通知==============="); long
	 * start = System.currentTimeMillis(); try { ((ProceedingJoinPoint)
	 * joinPoint).proceed(); long end = System.currentTimeMillis();
	 * if(logger.isInfoEnabled()){ logger.info("around " + joinPoint +
	 * "\tUse time : " + (end - start) + " ms!"); }
	 * System.out.println("==========结束执行controller环绕通知==============="); }
	 * catch (Throwable e) { long end = System.currentTimeMillis();
	 * if(logger.isInfoEnabled()){ logger.info("around " + joinPoint +
	 * "\tUse time : " + (end - start) + " ms with exception : " +
	 * e.getMessage()); } } } //
	 */
	/**
	 * 后置通知 用于拦截Controller层记录用户的操作 记录接口提交情况
	 * 
	 * @param joinPoint
	 *            切点
	 */
	@After("controllerAspect()")
	public void after(JoinPoint joinPoint) {
		try {
			// *========数据库日志=========*//
			// CustomerLog log = new CustomerLog();
			// String targetName = joinPoint.getTarget().getClass().getName();
			
			    
			    String targetName = joinPoint.getTarget().getClass().getName();
				//String methodName = joinPoint.getSignature().getName();
				
				Object[] arguments = joinPoint.getArgs(); // 获得参数列表
				
				//此处注解获得的参数是固定的，不能改变的，所以确定为2个
		
				
		
				//*/
		 
				
				CustomerLog log = new CustomerLog();
			
				long timenow = System.currentTimeMillis();
				log.setAddTime(String.valueOf(timenow));
				log.setCustomerId(1);
				
				Byte status=0;
				log.setStatus(status);
				
				log.setUrl(targetName);
				
				
			String methodName = joinPoint.getSignature().getName();
			//Object[] arguments = joinPoint.getArgs(); // 获得参数列表
				
			if (arguments.length <= 0) {
				System.out.println("=== " + methodName + " 方法没有参数");
			} else {
				for (int i = 0; i < arguments.length; i++) {
			 
					if(i==1){
						
						log.setRequestparams(String.valueOf(arguments[i]));
					}else{
						log.setSign(String.valueOf(arguments[i]));
					}
					
					
					
					
					//System.out.println("==== 参数   " + (i + 1) + " : " + arguments[i]);
				}
			}
			customerLogService.create(log);
			// 保存数据库
			// customerLogService.create(log);
			// System.out.println("=====controller后置通知结束=====");
			// System.out.println(operationSignstr);
			// System.out.println(methodName);
			// System.out.println(targetName);
		} catch (Exception e) {
			// 记录本地异常日志
			logger.error("==后置通知异常==");
			logger.error("异常信息:{}", e.getMessage());
		}
	}

//	// 配置后置返回通知,使用在方法aspect()上注册的切入点
//	@AfterReturning("controllerAspect()")
//	public void afterReturn(JoinPoint joinPoint) {
//		System.out.println("=====执行controller后置返回通知=====");
//		if (logger.isInfoEnabled()) {
//			logger.info("afterReturn " + joinPoint);
//		}
//	}

	/**
	 * 异常通知 用于拦截记录异常日志
	 * 
	 * @param joinPoint
	 * @param e
	 */
	/*
	 * @AfterThrowing(pointcut = "controllerAspect()", throwing="e") public void
	 * doAfterThrowing(JoinPoint joinPoint, Throwable e) {
	 * 
	 * // } //
	 */
}
