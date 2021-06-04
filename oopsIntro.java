class Cat {
    int legs, eyes;
    String color, breed;

    public void Walk() {
        System.out.println("My cat has " + legs+ " legs. And it is walking now!");
    }
    public void Eat() {
        System.out.println("My cat is so bhukkhad, Eating now!");
    }
    public void Description() {
        System.out.println("My cat has " + legs + " legs." + eyes + "e yes and it is " + color+ " in color. And it's breed is "+breed);
    }
}

public class oopsIntro {
    public static void main(String[] args) {
        Cat cat1 = new Cat();

        cat1.legs = 4;
        cat1.eyes = 2;
        cat1.color = "White";
        cat1.breed = "Cattue";

        cat1.Walk();
        cat1.Eat();
        cat1.Description();
    }
}
