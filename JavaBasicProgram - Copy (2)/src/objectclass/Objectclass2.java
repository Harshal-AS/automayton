package objectclass;

class Z {
	void harshal() {
		System.out.println("hi harshal");
	}

}

public class Objectclass2 extends Z  {

	public static void main(String[] args) {
		Z s = new Z();
		System.out.println(s);// objectclass.Z(fully classified name) implicit
		System.out.println(s.toString());// objectclass.Z(fully classified name) explicit
		System.out.println(s.hashCode());// convert hexadecimal to decimal
		System.out.println("....................................");
		Objectclass2 s1 = new Objectclass2();
		System.out.println(s1);// objectclass.objectclass(fully classified name) implicit
		System.out.println(s1.toString());// objectclass.objectclass(fully classified name) explicit
		System.out.println(s1.hashCode());// convert hexadecimal to decimal
		System.out.println("....................................");
		Z s2 = new Objectclass2();
		System.out.println(s2);// objectclass.Z(fully classified name) implicit
		System.out.println(s2.toString());// objectclass.Z(fully classified name) explicit
		System.out.println(s2.hashCode());// convert hexadecimal to decimal

	}

}
