package firstExercise;

public class TestProgrammers {
    public static void main(String[] args) {
     Programmer programmer1 = new Programmer();

     Programmer programmer2 = new Programmer();

        programmer1.name = "Mario";
        programmer1.age = 25;
        programmer1.wearsGlasses = true;

        programmer1.drinkCoffe();
        programmer1.printDetails();

        programmer2.name = "Luca";
        programmer2.age = 30;
        programmer2.wearsGlasses = false;

        programmer2.printDetails();
        programmer2.hasGlasses();










    }
}
