package ProgramsNew;

public class Parameterized_constructors {

	public Parameterized_constructors(String name) {
		System.out.println(name);
	}

	public Parameterized_constructors(int input) {
		System.out.println(input);
	}

	public Parameterized_constructors() {
		System.out.println("default constructor");

	}

	public static void main(String[] args) {
Parameterized_constructors ob = new Parameterized_constructors(1234);

	}
}
