package classexamples;

public class MainCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog("Puppy", 30000);
		//d.name = "Tommy";
		//d.cost = 1000;
		d.eat();
		d.walk();
		
		Dog d1 = new Dog("Tommy", 40000);
		d1.eat();
		d1.walk();
		
		//Address of d and d1 are different 
		System.out.println("d" + d);
		System.out.println("d1" + d1);
		
		Dog d2=d; //Addres of d2 and d are same
		System.out.println("d2" + d2);
		
		d2.cost=60;
		d2.eat();
		System.out.println(d1.hashCode());
		System.out.println(d1.hashCode());
		System.out.println(d1.getClass());
		d2.walk();

		
	}

}
