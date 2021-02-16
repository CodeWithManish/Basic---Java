package apractice;

public class B {
 int rollNo;
 String Name;
 String city;
public B(int rollNo, String name, String city) {
	this.rollNo = rollNo;
	this.Name = name;
	this.city = city;
	
} 


@Override
public String toString() {
	return "B [rollNo=" + rollNo + ", Name=" + Name + ", city=" + city + "]";
}


public static void main(String[] args) {
	B b=new B(01,"Manish","lko");
	B b1=new B(01,"anish","bob");
	System.out.println(b);
	System.out.println(b1);
}

 
 
}
