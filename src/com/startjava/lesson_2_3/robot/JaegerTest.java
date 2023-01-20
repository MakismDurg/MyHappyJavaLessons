package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
    	Jaeger jaeger1 = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.25f, 1.980f, 7, 8, 6);
        System.out.println(jaeger1);
        jaeger1.move();
        System.out.println(jaeger1.activateNuclearVortexTurbine());
        System.out.println(jaeger1.usePlasmaCannon());
        System.out.println();

        Jaeger jaeger2  = new Jaeger();
        jaeger2.setModelName("Cherno Alpha");
        jaeger2.setMark("Mark-1");
        jaeger2.setOrigin("Russia");
        jaeger2.setHeight(85.34f);
        jaeger2.setWheight(2.412f);
        jaeger2.setSpeed(3);
        jaeger2.setStrenght(10);
        jaeger2.setArmor(10);
        System.out.println(jaeger2);
        jaeger2.move();
        System.out.println(jaeger2.useTeslaFists());
        System.out.println(jaeger2.activateAtmoscan());
    }
}
