package com.larry.blog.argumentresolver;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface ParsedIp {

    String defaultValue() default "UNKNOWN";

}
