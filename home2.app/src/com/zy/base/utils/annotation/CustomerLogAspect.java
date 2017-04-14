package com.zy.base.utils.annotation;
import java.lang.reflect.Method;


import javax.annotation.Resource;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.zy.base.service.CustomerLogService;

@Aspect
@Component
public class CustomerLogAspect {
	//ע��Service���ڰ���־�������ݿ�  
    @Resource  //��������resourceע�⣬һ���õ���@Autowired�����ǵ���������ʱ���һ��ں���Ĳ�������д
    private CustomerLogService customerLogService;  
    
    private  static  final Logger logger = LoggerFactory.getLogger(CustomerLogAspect.class);  
    
    //Controller���е�  
    @Pointcut("execution (* com.zy.base.controller..*.*(..))")  
    public  void controllerAspect() {  
    }  
    
    /** 
     * ǰ��֪ͨ ��������Controller���¼�û��Ĳ��� 
     * 
     * @param joinPoint �е� 
     */ 
    
    /*
    @Before("controllerAspect()")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("==========ִ��controllerǰ��֪ͨ===============");
        if(logger.isInfoEnabled()){
            logger.info("before " + joinPoint);
        }
    }    
    //*/
    //����controller����֪ͨ,ʹ���ڷ���aspect()��ע��������
    /*
      @Around("controllerAspect()")
      public void around(JoinPoint joinPoint){
          System.out.println("==========��ʼִ��controller����֪ͨ===============");
          long start = System.currentTimeMillis();
          try {
              ((ProceedingJoinPoint) joinPoint).proceed();
              long end = System.currentTimeMillis();
              if(logger.isInfoEnabled()){
                  logger.info("around " + joinPoint + "\tUse time : " + (end - start) + " ms!");
              }
              System.out.println("==========����ִ��controller����֪ͨ===============");
          } catch (Throwable e) {
              long end = System.currentTimeMillis();
              if(logger.isInfoEnabled()){
                  logger.info("around " + joinPoint + "\tUse time : " + (end - start) + " ms with exception : " + e.getMessage());
              }
          }
      }
    //*/
    /** 
     * ����֪ͨ ��������Controller���¼�û��Ĳ��� 
     * ��¼�ӿ��ύ���
     * 
     * @param joinPoint �е� 
     */  
    @After("controllerAspect()")  
    public  void after(JoinPoint joinPoint) {
         try {
            //*========���ݿ���־=========*//  
          //  CustomerLog log = new CustomerLog();
        	 //String targetName = joinPoint.getTarget().getClass().getName();    
             String methodName = joinPoint.getSignature().getName();    
        	 Object[] arguments = joinPoint.getArgs();   //��ò����б�  
        	 if(arguments.length<=0){  
                 System.out.println("=== "+methodName+" ����û�в���");  
             }else{  
             for(int i=0;i<arguments.length;i++){  
                 System.out.println("==== ����   "+(i+1)+" : "+arguments[i]);
             }  
             }
            //�������ݿ�  
           // customerLogService.create(log);  
           // System.out.println("=====controller����֪ͨ����=====");
           // System.out.println(operationSignstr); 
           // System.out.println(operationContent); 
           // System.out.println(joinPoint.getArgs()); 
        }  catch (Exception e) {  
            //��¼�����쳣��־  
            logger.error("==����֪ͨ�쳣==");  
            logger.error("�쳣��Ϣ:{}", e.getMessage());  
        }  
    }
    
    //���ú��÷���֪ͨ,ʹ���ڷ���aspect()��ע��������
      @AfterReturning("controllerAspect()")
      public void afterReturn(JoinPoint joinPoint){
          System.out.println("=====ִ��controller���÷���֪ͨ=====");  
              if(logger.isInfoEnabled()){
                  logger.info("afterReturn " + joinPoint);
              }
      }
    
    /** 
     * �쳣֪ͨ �������ؼ�¼�쳣��־ 
     * 
     * @param joinPoint 
     * @param e 
     */  
      /*
     @AfterThrowing(pointcut = "controllerAspect()", throwing="e")  
     public void doAfterThrowing(JoinPoint joinPoint, Throwable e) {
    	 
    	 //
     }  
   //*/
}
