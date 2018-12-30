package com.malin.okhttp;

import java.util.ArrayList;
import java.util.List;

public class OkHttpInterceptor {

    public static void main(String[] args) {

        String name = "Jake";
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AddPhoneInterceptor());
        interceptorList.add(new AddAddressInterceptor());

        int index = 0;
        InterceptorChain chain = new InterceptorChain(name, interceptorList, index);

        String result = chain.proceed();
        System.out.println(result);
    }
}
