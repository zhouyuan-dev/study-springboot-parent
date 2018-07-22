package com.study.springboot.cache;


import java.lang.annotation.*;

/**
 * 缓存切面处理
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CacheAround {
    String key();

    String fieldKey();

    int expireTime() default 3600;
}
