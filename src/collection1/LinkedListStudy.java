package collection1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListStudy {

	public static void main(String[] args) 
	{
     LinkedList A=new LinkedList<>();
     
     System.out.println(A);
		
     A.add("AVDHUT");
     A.add('W');
     A.add(908);
     A.add(12.07);
     System.out.println(A);
     
     for (int i=0;i<=A.size()-1;i++);           //for loop
     {
   // 	 System.out.println(A.get(i));
     }
     
     for(Object S:A)                           //for each loop
     {
    	 System.out.println(S);
    	 
     }
     
     Iterator P=A.iterator();                  // Iterator
     while(P.hasNext())
     {
    	 
    	 System.out.println(P.next());
     }
     
     
     
     
     
	}

}
