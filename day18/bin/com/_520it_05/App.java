// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   App.java

package com._520it_05;

import java.io.PrintStream;
import java.util.*;

public class App
{

	public App()
	{
	}

	public static void main(String args[])
	{
		List list = new ArrayList();
		list.add("String");
		list.add("123");
		list.add("111");
		work(list);
	}

	private static void work(List list)
	{
		String s;
		for (Iterator iterator = list.iterator(); iterator.hasNext(); System.out.println(s.length()))
			s = (String)iterator.next();

	}
}
