// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TryWithResource.java

package com._520it_02;

import java.io.FileInputStream;
import java.io.InputStream;

public class TryWithResource
{

	public TryWithResource()
	{
	}

	public static void main(String args1[])
	{
	}

	private static void work2()
	{
		Exception exception;
		exception = null;
		Object obj = null;
		InputStream in = new FileInputStream("");
		if (in != null)
			in.close();
		break MISSING_BLOCK_LABEL_68;
		Exception exception1;
		exception1;
		if (exception == null)
			exception = exception1;
		else
		if (exception != exception1)
			exception.addSuppressed(exception1);
		throw exception;
		Exception e;
		e;
		throw new RuntimeException(e);
	}

	private static void work1()
	{
		InputStream in = null;
		try
		{
			int a = 1 / 0;
			in = new FileInputStream("");
			a = 1 / 0;
			break MISSING_BLOCK_LABEL_66;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		try
		{
			if (in != null)
				in.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		break MISSING_BLOCK_LABEL_82;
		Exception exception;
		exception;
		try
		{
			if (in != null)
				in.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		throw exception;
		try
		{
			if (in != null)
				in.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
