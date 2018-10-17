
public class EncapDemo {

	public static void main(String[] args) {
		Encap obj1=new Encap();
		Encap obj2=new Encap();
		obj1.setId(7005);
		obj1.setName("Ajay Thakur");
		obj1.setSalary(90000.0000);
		obj2.setId(7004);
		obj2.setName("Ajay kumar");
		obj2.setSalary(60000.0000);
		System.out.println("Id :: "+obj1.getId());
		System.out.println("Name :: "+obj1.getName());
		System.out.println("Salary :: "+obj1.getSalary());
		System.out.println("Id :: "+obj2.getId());
		System.out.println("Name :: "+obj2.getName());
		System.out.println("Salary :: "+obj2.getSalary());
	}

}
