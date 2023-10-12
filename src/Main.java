import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        House house = new House("KOK JAR");
        Father father = new Father(48, "Amanjan", "T Supra", Habits.HARDWORKING, house, "accountant");

        System.out.println(father.getInfo());
        father.makeVoice();
        father.makeVoice("Goodbye World");

        System.out.println();

        House house1 = new House("TIME SQUARE");
        Son son1 = new Son(25, "Fatih", "T Sequoia", Habits.SLEEPY, house1,"Treding", "FinTech");
        System.out.println(son1.getInfo());
        son1.makeVoice();
        son1.makeVoice("I study well");

        System.out.println();

        Son son2 = new Son(29, "Bakbergen", "Tesla Model x", Habits.DECISIVE, house1, "MMA Fighter", "Politech");
        System.out.println(son2.getInfo());
        son1.makeVoice();
        son1.makeVoice("I am very Strong");

        System.out.println();
    }
}