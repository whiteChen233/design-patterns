package com.github.white.proxy.v2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.github.white.log.GlobalLogger;

/**
 * The type Proxy handler.
 */
public class ProxyHandler implements InvocationHandler {

    /**
     * The Target.
     */
    private Object target;

    /**
     * New proxy instance object.
     *
     * @param target the target
     * @return the object
     */
    public Object newProxyInstance(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }


    /**
     * Invoke object.
     *
     * @param proxy  the proxy
     * @param method the method
     * @param args   the args
     * @return the object
     * @throws Throwable the throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 预处理
        preOperate();

        Object ret = method.invoke(target, args);

        // 后续处理
        postOperate();
        return ret;
    }

    /**
     * Pre operate.
     */
    public void preOperate() {
        GlobalLogger.info("预处理");
    }

    /**
     * Post operate.
     */
    public void postOperate() {
        GlobalLogger.info("后续处理");
    }
}
