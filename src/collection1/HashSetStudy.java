package collection1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args)
	{
	HashSet Q=new HashSet<>();
		
	System.out.println(Q);
	Q.add("vaibhav");
	Q.add('t');
	Q.add('H');
	Q.add(4321);
	Q.add(12.05);
	
	System.out.println(Q);    // insertion order not maintain...get random
	
	Q.add('H');              // Duplicate not allowed
	System.out.println(Q);
		
	Q.add(null);             // allow only 1 null...,Duplicate null not allow
	System.out.println(Q);
	
		for(int i=0;i<=Q.size()-1;i++)
		{
		//	System.out.println(Q.get(i))
		}
		
		System.out.println("================");
		
		for (Object o:Q)
		{
			System.out.println(o);
		}
		
		System.out.println("================");
		
		Iterator k=Q.iterator();
				while(k.hasNext())
				{
					System.out.println(k.next());
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
