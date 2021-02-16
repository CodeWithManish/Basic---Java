package apractice;

public class A {
	public static void main(String args[]){  
		   /*String s="Sachin";  
		   s.concat(" Tendulkar");//concat() method appends the string at the end  
		   System.out.println(s);//will print Sachin because strings are immutable objects  
		*/ 
		
		/*String s="Sachin";  
		   s=s.concat(" Tendulkar");  
		   System.out.println(s);  
		   System.out.println(s.length());
		   }  */
		 
			StringBuilder sb=new StringBuilder();  
			System.out.println(sb.capacity());//default 16  
			sb.append("Hello");  
			System.out.println(sb.capacity());//now 16  
			sb.append("java is my favourite language");  
			System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
			sb.ensureCapacity(10);//now no change  
			System.out.println(sb.capacity());//now 34  
			sb.ensureCapacity(50);//now (34*2)+2  
			System.out.println(sb.capacity());//now 70 
	}  
}

