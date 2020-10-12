package Lab6.exercise3;

//TestAnimal.java
/*A driver (test) class that contains the main() method for 
testing the functionality of the Animal class*/


public class TestAnimal {
	public static void main( String args[]) {

		Animal allAnimals[] = new Animal[10];

		System.out.println("Calling the no argument constructor");
		Animal animal1 = new Animal();

		String lionContinents[]={"Africa", "Asia"}; //initialise array of strings

		//4 argument constructors and 4 mutator methods

		System.out.println("\nCalling the 4 argument constructor for lion object..");
		Animal animal2 = new Animal("Lion", lionContinents, 200, 40);

		System.out.println("\nCalling the 4 argument constructor to create rat bear object");
		Animal animal3 = new Animal("Rat",new String[]{"Europe", "America", "Africa", "Asia"}, 0.2,5);

		System.out.println("\nCalling the 4 argument constructor to creat polar bear");
		Animal animal4 = new Animal("Polar Bear", new String[]{"Antarctica"}, 450, 15);

		allAnimals[0] = animal1;
		allAnimals[1] = animal2;
		allAnimals[2] = animal3;
		allAnimals[3] = animal4;

		System.out.println("\n\nThe details of all the animals in the array are:\n\n");

		for(int i=0;i< allAnimals.length;i++){
			System.out.println(allAnimals[i] + "\n\n");
		}
	}
}