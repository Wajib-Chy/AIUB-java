import java.lang.*;

public class Person{
	private int id;
	private String name;
	private int age;
	
	public Person(){
		System.out.println("Empty cons for Person");
	}
	
	public Person(int id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;
		System.out.println("Pera cons for Person");
	}
	
	public void setId(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name= name;
	}
	public void setAge(int age){
		this.age=age;
	}
	
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	
	public void details(){
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}