package day12;

public class Puppy {
	int puppyAge;
	
	public Puppy() {
		
	}
	public Puppy(String name) {
		// This constructor has one parameter, name.
		
		System.out.println("Passed Name is: " + name);
	
	}
	
	public void setAge(int age) {
		puppyAge = age;
	}
	
	public int getAge( ) {
		System.out.println("Puppy's age is : " + puppyAge);
		return puppyAge;
	}

}