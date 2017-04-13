package com.zy.base.utils.annotation;


import java.lang.annotation.*;

@Target({ElementType.PARAMETER, ElementType.METHOD})  
@Retention(RetentionPolicy.RUNTIME)  
@Documented
@Inherited
public @interface AnnotationLog {

    /** 签名字符串 **/  
    public String operationSignstr() default "";  
     
    /** 内容主体 **/  
    public String operationContent() default "";
}