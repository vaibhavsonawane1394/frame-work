package collection1;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhashSet {

	public static void main(String[] args) {
	
		LinkedHashSet s=new LinkedHashSet<>();
		
		System.out.println(s);
		
		s.add("Ajit");
		s.add('W');
	    s.add(908);
	    s.add(12.07);
		
	    System.out.println(s);            //Order of insertion maintain
		
	   System.out.println( s.contains('W'));
		System.out.println(s);
		
		System.out.println(s.isEmpty());
		
	    for (int i=0;i<=s.size()-1;i++);
		{
		//	System.out.println(s.get(i))
		}
		
		for (Object o:s)
		{
			System.out.println(o);
		}
		
		Iterator n=s.iterator();
		while (n.hasNext())
		{
			System.out.println(n.next());
		}
		
		
		
	}

}
