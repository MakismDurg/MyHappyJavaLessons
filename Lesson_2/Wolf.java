public class Wolf {
    String name;
    String gender;
    int age;
    double weight;
    String colour;

    void go() {
        System.out.println("Он ходит");
    }

    void run() {
        System.out.println("Он бегает");
    }

    void sit() {
        System.out.println("Он сидит");
    }
    
    void howl() {
        System.out.println("Он воет");
    }

    void hunt() {
        System.out.println("Он охотится");
    }

    boolean isCircusPerform() {
        System.out.println("Волк слабее льва и тигра, но в цирке не выступает.");
        return true;
    }
}
