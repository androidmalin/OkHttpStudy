
package com.malin.okhttp;

public interface Interceptor {
    String intercept(Chain chain);

    interface Chain {
        String proceed();
    }
}
