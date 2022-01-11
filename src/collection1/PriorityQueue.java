package collection1;

public class PriorityQueue {

	public static void main(String[] args)
	{
		
java.util.PriorityQueue p=new java.util.PriorityQueue<>();

System.out.println(p);

p.add("sachin");
p.add("ajay");
p.add("mayur");

//p.add(1234);         //only homogenus data
System.out.println(p);

p.add("mayur");
System.out.println(p);
		
p.remove();
System.out.println(p);           //always removw head of Queue

System.out.println(p.poll());
System.out.println(p);           //Retrive and Remove of head of queue

p.element();
System.out.println(p);           //only retrive head does not remove it

p.peek();
System.out.println(p);          // only retrive heads does not remove it

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
