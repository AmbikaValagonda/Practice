package jvmmemoryexample;

class Demo{
	void dis() {
		System.out.println("Helooo..");
	}
}

class Display{
	Demo d = new Demo();
	void display() {
		d.dis();
	}
	
}
public class JVMMemoryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1 = new Demo();
		d1.dis();
		
		Display d2 = new Display();
		d2.display();

	}

}
