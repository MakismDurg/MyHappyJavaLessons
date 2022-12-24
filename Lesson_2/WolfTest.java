public class WolfTest {
	 public static void main(String[] args) {
	 Wolf myFirstWolf = new Wolf();
	 myFirstWolf.name = "Валентин";
	 myFirstWolf.gender = "самец";
	 myFirstWolf.age = 5;
	 myFirstWolf.weight = 40.5;
	 myFirstWolf.colour = "серый";
	 System.out.printf("Для этого теста я создал волка по кличке %s: %s %d лет, весом %2.1f кг, окрас %s.\n",
	 	myFirstWolf.name, myFirstWolf.gender, myFirstWolf.age, myFirstWolf.weight, myFirstWolf.colour);
	 myFirstWolf.go();
	 myFirstWolf.run();
	 myFirstWolf.howl();
	 System.out.println("Подтверждает ли Валентин это правило?\n"+ myFirstWolf.doesHePerformAtCircus());
	}
}