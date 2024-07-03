
public class ClassA {
	int a=10,b=20;
	void meth1() {
		//int a=10,b=20;
		System.out.println("Addition :"+(a+b));
	}
	void meth2() {
		System.out.println("Subtraction:"+(a-b));
	}
	void meth3() {
		System.out.println("Multiplication:"+(a*b));
	}
	void meth4() {
		System.out.println("division:"+(a/b));
	}

	public static void main(String[] args) {
		System.out.println("Start");
		ClassA obj =new ClassA();
		obj.meth1();
		obj.meth2();
		obj.meth3();
		obj.meth4();
		System.out.println("End");

	}

}
