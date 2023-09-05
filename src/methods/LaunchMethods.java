package methods;

class Calculator{
	int num1;
	int num2;
	int res;
	
	void add(int a, int b){
		int num2=0;	
		num1=a;
		num2=b;
		res=num1+num2;
		System.out.println(res);
	}
}
class Test{
	void createObject() {
		Calculator c = new Calculator();
		c.add(10,40);
	}
}
public class LaunchMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.add(10,20);
		
		Test t = new Test();
		t.createObject();
	}

}
