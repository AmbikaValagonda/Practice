package polymorphism;


class OveLoadExample{
	
	int add(int a, int b) {
		System.out.println("int a,b ");
		return a+b;
	}
	
	double add(double a, double b) {
		System.out.println("double a,b ");
		return a+b;
	}
	
	int add(int a, int b, int c) {
		System.out.println("int a,b,c ");
		return(a+b+c);
	}
	
	
}
public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OveLoadExample ol = new OveLoadExample();
		System.out.println(ol.add(1.0, 2.0));
		System.out.println(ol.add(1, 0));
		System.out.println(ol.add(10, 20, 30));
		

	}

}
