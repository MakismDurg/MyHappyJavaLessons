class Person {
    String gender = "male";
    String name = "Нафанаил";
    int height = 174;
    int weight = 83;

    boolean isHeAlive() {
        System.out.printf("%s жив", name);
        return true;
    }

    String go() {
        return "Ходит";
    }

    void sleep() {
        System.out.println("Я сплю");
    }

    void eat() {
        System.out.println("Я ем");
    }

    void see() {
        System.out.println("Я вижу");
    }

    void greetings() {
        System.out.println("Сәлеметсіз бе");
    }
}