public class Wolf {
    private String name;
    private String gender;
    private int age;
    private double weight;
    private String colour;

    public void setName(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
 
    public String getGender() {
        return gender;
    }

    public void setAge(int age) {
        if(age < 8 && age > -1) {
            this.age = age;
        } else {
        	System.out.println("Некорректный возраст");
        }
    }
 
    public int getAge() {
        return age;
    }

     public void setWeight(double weight) {
        this.weight = weight;
    }
 
    public double getWeight() {
        return weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
 
    public String getColour() {
        return colour;
    }

    public void go() {
        System.out.println("Он ходит");
    }

    public void run() {
        System.out.println("Он бегает");
    }

    public void sit() {
        System.out.println("Он сидит");
    }
    
    public void howl() {
        System.out.println("Он воет");
    }

    public void hunt() {
        System.out.println("Он охотится");
    }

    public boolean isCircusPerform() {
        System.out.println("Волк слабее льва и тигра, но в цирке не выступает.");
        return true;
    }
}
