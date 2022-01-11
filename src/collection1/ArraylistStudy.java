package collection1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistStudy {

	public static void main(String[] args)
	{
	ArrayList obj=new ArrayList();	//generic ...Accept all data type
	
	ArrayList<String> obj1=new ArrayList<String>();

	System.out.println(obj);         //create empty Array
	
	obj.add("tcs");                  //Add Element object form
	System.out.println(obj);
	
	obj.add("wipro");
	obj.add("wallmart");
	obj.add(213);
	obj.add('M');
	System.out.println(obj);
	
	obj.add(2,"zensor");           // add element in index form
	System.out.println(obj);
	
	obj.remove(3);                 //remove Element in object form
	System.out.println(obj);
	
	System.out.println(obj.get(2));         // to get specific element
	
	obj.clear();                    // Remove all Element
	System.out.println(obj);
	
	obj.add("Mahindra");          //Add element in object based
	obj.add("tata");
	obj.add("kirloskar");
	System.out.println(obj);
	
	obj.add("tata");               //Duplicate Element Allow
	System.out.println(obj);
	
	obj.add(null);                //Add multiple null value
	obj.add(null);
	System.out.println(obj);
	
	obj.add(2,null);             //add null value in index form
	System.out.println(obj);
	
	obj.add(2, "Arya");          // Add element in Index form
	System.out.println(obj);
	
	System.out.println(obj.contains("Mahindra"));   // To check contain is present or not...., and get boolean value
	
	System.out.println(obj.indexOf("tata"));         //to give index no of Array
	
	System.out.println(obj.isEmpty());               // To check Array is empty or not...,get boolean value
	
	System.out.println(obj.size());
	
	for (int i=0;i<=obj.size()-1;i++)             //1st Way using For loop
	{
		System.out.println(obj.get(i));
	}
	
Iterator a=obj.iterator();                       // 2nd By Using Iterator
while (a.hasNext())
{
	System.out.println(a.next());
}


for (Object o:obj)
{
System.out.println(o);	
}
	
	}

}
