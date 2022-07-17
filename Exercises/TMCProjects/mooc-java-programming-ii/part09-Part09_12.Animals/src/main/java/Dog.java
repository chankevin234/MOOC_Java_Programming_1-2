public class Dog extends Animal implements NoiseCapable {

    public Dog(String name) {
        super(name);

    }

    public Dog() {
        super("Dog"); // if there is no value given when instantiating this class, default = dog
    }

    public void bark() {
        System.out.println(super.getName() + " barks");
    }

    @Override
    public void makeNoise() {
        this.bark();
    }
}
