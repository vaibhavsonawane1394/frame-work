package collection1;

import java.util.Iterator;

public class TreeSet {

	public static void main(String[] args) {
  
  java.util.TreeSet tr=new java.util.TreeSet<>();
  
  System.out.println(tr);
		tr.add("mayur");
		tr.add("abhijeet");
		tr.add("suraj");
	//	tr.add('k');             //use only string...class cast exception
		//tr.add(987);           ////use only string...class cast exception
		
		System.out.println(tr);       //accending order of inseertion
		
	//	tr.add("suraj");
		System.out.println(tr);         //dosent allow duplicate
		
	//	tr.add(null);               // null not allowed....,give null pointer exception
		System.out.println(tr); 
		
//		for(int i=0;i<=tr.size()-1;i++);
//		{
//			System.out.println(tr.get(i));
//		}
		
		for (Object o:tr)
		{
			System.out.println(o);
		}
		
		Iterator i=tr.iterator();
		while (i.hasNext())
		{
			System.out.println(i.next());
		}
				
			
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
