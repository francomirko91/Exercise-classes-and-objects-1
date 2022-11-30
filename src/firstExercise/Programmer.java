package firstExercise;

public class Programmer {
    public String name;
    public int age;
    public boolean wearsGlasses;

    void drinkCoffe(){
        System.out.println("Espresso is the secret!");
    }
    void printDetails(){
        System.out.println(name + "is a " + age + "-yo programmer");
    }
    void hasGlasses(){
        System.out.println("Is " + name + " wearing glasses?");
    }
}
