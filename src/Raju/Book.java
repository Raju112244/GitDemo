package Raju;

public class Book {
  String name;
	
	
  // Constructor
	public  Book(String name)
	{
		this.name=name;
	}
	public void display()
	{
		System.out.println("name:"+this.name);
	}
	public static void main(String[] args) 
	{
	   Book d=new Book("raju");
	   d.display();
     
	}

}
