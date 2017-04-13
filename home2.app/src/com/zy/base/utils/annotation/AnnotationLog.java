package com.zy.base.utils.annotation;


import java.lang.annotation.*;

@Target({ElementType.PARAMETER, ElementType.METHOD})  
@Retention(RetentionPolicy.RUNTIME)  
@Documented
@Inherited
public @interface AnnotationLog {

    /** ǩ���ַ��� **/  
    public String operationSignstr() default "";  
     
    /** �������� **/  
    public String operationContent() default "";
}