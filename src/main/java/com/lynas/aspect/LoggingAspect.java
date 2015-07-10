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

    @Pointcut("within(com.lynas.controller.TestController)")
    public void p2() {}

    @Before("p2()")
    public void a2() {
        System.out.println("logg22222222");
    }

    @Pointcut("args(com.lynas.service.*)")
    public void p3() {}

}
