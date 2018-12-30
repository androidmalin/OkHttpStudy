package com.malin.okhttp;

public class AddPhoneInterceptor implements Interceptor {

    @Override
    public String intercept(Chain chain) {
        InterceptorChain interceptorChain = (InterceptorChain) chain;
        interceptorChain.name = interceptorChain.name + " phone:15511112222";
        return interceptorChain.proceed();
    }
}
