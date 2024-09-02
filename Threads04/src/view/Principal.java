package view;

import controller.ThreadSapo;

public class Principal
{

	public static void main(String[] args)
	{
		for(int i=1;i<6;i++)
			{
			ThreadSapo op=new ThreadSapo(i);
			op.start();
					
	    	}

	}
}