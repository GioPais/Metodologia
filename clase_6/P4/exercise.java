
interface Element {}

class Box implements Element {}

class Canvas {
	public void add(Element e) {
		System.out.println("Element added");
	}
	public void add(Box e) {
		System.out.println("Box added");
	}
}

class Main {
	public static void main(String[] argv){
		Canvas c = new Canvas();
		Element o1 = new Box();
		Box o2 = new Box();
		c.add(o1);
		c.add(o2);
		c.add(new Box());
	}
}