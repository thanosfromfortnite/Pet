public class Kennel {
    private Pet[] kennel = new Pet[3];

    public Kennel() {
        kennel[0] = new Cat("Cat Person");
        kennel[1] = new Dog("Dog Man");
        kennel[2] = new LoudDog("Snoop Dogg");
    }

    public void allSpeak() {
        for (int i = 0; i < kennel.length; i ++) {
            System.out.println(kennel[i].getName() + ": '" + kennel[i].speak() + "'");
        }
    }

}
