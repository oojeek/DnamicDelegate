package com.sealinetech.forth.service;

import java.lang.reflect.Proxy;

public class MyProxy
{
	public static Object getProxy(Object worker, IInterceptor interceptor)
	{
		MyHandler handler = new MyHandler();
		handler.setInterceptor(interceptor);
		handler.setWorker(worker);
		return Proxy.newProxyInstance(worker.getClass().getClassLoader(), worker.getClass().getInterfaces(), handler);
	}
}
