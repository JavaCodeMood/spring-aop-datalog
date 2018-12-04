package com.lhf.aop.datalog;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName: Datalog
 * @Description:
 * @Author: liuhefei
 * @Date: 2018/12/4
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface Datalog {

    //中文字段名
    String name();
}
