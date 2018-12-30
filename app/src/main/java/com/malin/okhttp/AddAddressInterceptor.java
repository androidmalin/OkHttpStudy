package com.malin.okhttp;

public class AddAddressInterceptor implements Interceptor {

    @Override
    public String intercept(Chain chain) {
        InterceptorChain interceptorChain = (InterceptorChain) chain;
        interceptorChain.name = interceptorChain.name + " address:beijing";
        return interceptorChain.proceed();
    }
}
