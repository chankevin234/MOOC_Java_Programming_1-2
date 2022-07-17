public class Cat extends Animal implements NoiseCapable {

    public Cat(String name) {
        super(name); //when instanstiating this class, gives to the super class's constructor
    }

    public Cat() {
        super("Cat");
    }

    public void purr() {
        System.out.println(super.getName() + " purrs");
    }


    @Override
    public void makeNoise() {
        this.purr();
    }
}
