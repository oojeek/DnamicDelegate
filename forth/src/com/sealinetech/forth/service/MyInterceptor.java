package com.sealinetech.forth.service;

public class MyInterceptor implements IInterceptor
{

	@Override
	public void before()
	{
		// TODO Auto-generated method stub
		System.out.println("Before method invoke...");
	}

	@Override
	public void after()
	{
		// TODO Auto-generated method stub
		System.out.println("After method invoke...");
	}

}
