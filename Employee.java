public class Employee implements java.io.Serializable {
	String name;
	int id;
	double salary;
	String address;
	Employee(int id,String name,double salary,String address) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.address=address;
	
	}
	public String toString() {
	
		return id+""+name+""+salary+""+address;
	}
	
	public void dosomething() {
		System.out.println("employee is working");
	}
}