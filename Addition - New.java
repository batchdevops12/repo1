package coreJava;

public class Addition { // call by compiler

	int a = 20, b = 10, c; // V.D

	public void add() { // u.d.m

		c = a + b; // B.L
		System.out.println("addition result is:" + c);
	}

	public void multi() { // u.d.m

		c = a * b; // B.L
		//this.div();
		System.out.println("multi result is:" + c);
	}

	public void sub() { // u.d.m

		c = a - b; // B.L
		System.out.println("sub result is:" + c);
	}

	public void div() { // u.d.m

		c = a / b; // B.L
		System.out.println("div result is:" + c);
		
	}

	public static void main(String[] args) { // call by jvm -call toString()

		Addition obj = new Addition();

		obj.add();
		obj.multi();
		obj.sub();
		obj.div();

	}

}
