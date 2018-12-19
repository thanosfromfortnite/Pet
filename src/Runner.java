public class Runner {

    public static void main(String[] args) {
        Cat cat = new Cat("FELINE");
        Dog dog = new Dog("CANINE");
        LoudDog loudDog = new LoudDog("EXTRA LOUD CANINE");
        System.out.println(cat.getName() + ": '" + cat.speak() + "'");
        System.out.println(dog.getName() + ": '" + dog.speak() + "'");
        System.out.println(loudDog.getName() + ": '" + loudDog.speak() + "'");


        System.out.println("==Kennel==");
        Kennel kennel = new Kennel();
        kennel.allSpeak();
    }
}
