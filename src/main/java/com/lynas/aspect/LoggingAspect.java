package com.lynas.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by LynAs on 7/10/2015.
 */
@Component
@Aspect
public class LoggingAspect {

    @Pointcut("execution(public * home(..)))")
    public void publicServices() {
    }

    @Before("publicServices()")
    public void logg() {
        System.out.println("logg");
    }
}
