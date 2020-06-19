package com.test.java8.annotation.day11;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.TYPE_PARAMETER;

import java.lang.annotation.Target;

@Repeatable(MyAnnotations.class)
@Target({TYPE,FIELD,METHOD,PARAMETER,CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value() default "hellowJava8Test";
}
