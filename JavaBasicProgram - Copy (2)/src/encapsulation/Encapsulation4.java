package encapsulation;

class yogesh {
	private int empid = 4567;
	private int age;
	

	public int getempid() {
		return empid;
	}

	public int getage() {
		return age;
	}

	public void setempid(int a) {
		empid = a;
	}

	public void setharshal(int z) {
		age = z;
	}
}

public class Encapsulation4 {

	public static void main(String[] args) {
		yogesh o1 = new yogesh();
		System.out.println("getter method acess to private class age: " + o1.getempid());
		System.out.println("getter method acess to private class empid: " + o1.getage());
		System.out.println("static & non static gv...................");
		
		System.out.println("........,,,,,,,,,,,,,,,,,,,");
		o1.setempid(70104);
		o1.setharshal(40);

		System.out.println("getter method acess to private class age: " + o1.getempid());
		System.out.println("getter method acess to private class empid: " + o1.getage());

	}

}
/*1.Getter method help to access private variable outside the class
 * 2.declared with public
 * 3.return type of getter method should be same as private variable
 * 4.it should be return private variable 
 * 
 * 1.Setter method helps to modify or updated private variable outside the class
 * 2.declared with public.
 * 3.return type of setter method should be void.
 * 4.parameter datatype should be same as private variable 
 */

