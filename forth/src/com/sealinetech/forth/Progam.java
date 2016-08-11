package com.sealinetech.forth;

import com.sealinetech.forth.service.*;

public class Progam
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//System.out.println("Hello world!!!");
		IWorker worker = new WorkerImpl();
		IInterceptor interceptor = new MyInterceptor();
		
		IWorker proxyWorker = (IWorker) MyProxy.getProxy(worker, interceptor);
		proxyWorker.doWorker();
	}

}
