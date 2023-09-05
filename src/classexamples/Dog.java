package classexamples;

public class Dog {
	
	String name;
	int cost;
	
	Dog(String name, int cost){
		this.name = name;
		this.cost = cost;
		
	}
	
	void eat() {
		//cost = 40;
		int age = 0;
		int cost = 900;
		//age = 5;
		System.out.println("Cost of dog is " + cost);
		System.out.println("Age of dog is " + age);
	}
	
	void walk() {
		System.out.println(name + " is Walking");
		
	}
	void add(){
		
	}

}
