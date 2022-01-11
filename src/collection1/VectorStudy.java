package collection1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorStudy {
public static void main(String[] args)
{

Vector j=new Vector<>();
	
	System.out.println(j);
	j.add("pune");
	j.add(12.34);
	j.add('N');
	j.add(123);
	
	System.out.println(j);
	
	for(int i=0;i<=j.size()-1;i++);
	{
	//System.out.println(j.get(i));
	}
	
	Iterator a=j.iterator();
	while (a.hasNext())
	{
		
		System.out.println(a.next());
	}
		

for (Object o:j)
{
System.out.println(o);	
}
	
	Enumeration v=j.elements();
	 while (v.hasMoreElements()) 
	 {
		System.out.println(v.nextElement());
		
	}
	
	
	
	
	
}
}
