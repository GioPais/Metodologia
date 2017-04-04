
class A {
	A() { System.out.println("A.A()"); }
	A(int i) { this(); System.out.println("A.A(int)");}
}

class B extends A {
	B() { this(0); System.out.println("B.B(int");}
	B(int i) { super(i); System.out.println("B.B(int)");}

	public static void main(String[] argv){
		new B();
	}
}
	
