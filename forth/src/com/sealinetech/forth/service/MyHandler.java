package com.sealinetech.forth.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler
{
	private Object worker;
	private IInterceptor interceptor;
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable
	{
		// TODO Auto-generated method stub
		interceptor.before();
		Object result = method.invoke(worker, args);
		interceptor.after();
		return result;
	}
	public Object getWorker()
	{
		return worker;
	}
	public void setWorker(Object worker)
	{
		this.worker = worker;
	}
	public IInterceptor getInterceptor()
	{
		return interceptor;
	}
	public void setInterceptor(IInterceptor interceptor)
	{
		this.interceptor = interceptor;
	}

}
