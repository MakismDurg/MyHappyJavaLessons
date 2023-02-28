package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf myFirstWolf = new Wolf();
        myFirstWolf.setName("Валентин");
        myFirstWolf.setGender("самец");
        myFirstWolf.setAge(6);
        myFirstWolf.setWeight(40.5);
        myFirstWolf.setColour("серый");
        System.out.printf("Для этого теста я создал волка по кличке %s: %s %d лет весом %2.1f кг, окрас %s.\n",
                myFirstWolf.getName(), myFirstWolf.getGender(), myFirstWolf.getAge(),
                myFirstWolf.getWeight(), myFirstWolf.getColour());
        myFirstWolf.go();
        myFirstWolf.run();
        myFirstWolf.howl();
        System.out.println("Подтверждает ли Валентин это правило?\n" + myFirstWolf.isCircusPerform());
    }
}