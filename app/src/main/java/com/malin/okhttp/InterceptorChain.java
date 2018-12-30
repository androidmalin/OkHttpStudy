package com.malin.okhttp;

import java.util.List;

public class InterceptorChain implements Interceptor.Chain {

    private List<Interceptor> interceptorList;
    protected String name;
    private int index;

    InterceptorChain(String name, List<Interceptor> interceptorList, int index) {
        this.name = name;
        this.interceptorList = interceptorList;
        this.index = index;
    }

    @Override
    public String proceed() {
        if (index >= interceptorList.size()) {
            return name;
        }
        InterceptorChain next = new InterceptorChain(name, interceptorList, index + 1);
        Interceptor interceptor = interceptorList.get(index);
        return interceptor.intercept(next);
    }

}
