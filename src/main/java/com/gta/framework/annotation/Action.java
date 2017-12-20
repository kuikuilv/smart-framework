package com.gta.framework.annotation;

/**
 * Created by kui.lv on 2017/12/8.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 *
 */
@Target(ElementType.METHOD)
@Retention()
public @interface Action {
    String value();
}
