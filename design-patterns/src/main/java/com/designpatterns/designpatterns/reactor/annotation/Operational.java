package com.designpatterns.designpatterns.reactor.annotation;

import com.designpatterns.designpatterns.reactor.enumeration.OperationalSymbolEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description
 * Date 2021/1/17 22:31
 * Created by kwz
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Operational {

    OperationalSymbolEnum [] operations = new OperationalSymbolEnum[0];
}
