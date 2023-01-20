package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float wheight;
    private int speed;
    private int strenght;
    private int armor;

    public Jaeger() {
    }

    public Jaeger(String modelName, String mark, String origin, float height, 
        float wheight, int speed, int strenght, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.wheight = wheight;
        this.speed = speed;
        this.strenght = strenght;
        this.armor = armor;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWheight(float wheight) {
        this.wheight = wheight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void move(){
        System.out.println("Передвигается");
    }

    public String useTeslaFists() {
        return "Применяет кулаки Теслы";
    }

    public String activateAtmoscan() {
        return "Сканирует атмосферу";
    }

    public String usePlasmaCannon() {
        return "Стреляет из плазменной пушки";
    }

    public String activateNuclearVortexTurbine() {
        return "Запускает ядерную вихревую турбину";
    }

    public String toString() {
        return String.format("Создан робот класса Jaeger \nМодель: %s\nМарка: %s \nПроизведён в: %s"
            + "\nВысота модели: %f \nВес модели: %f \nСкорость: %d \nСила: %d \nБроня: %d ", 
            modelName, mark, origin, height, wheight, speed, strenght, armor);
    }
}