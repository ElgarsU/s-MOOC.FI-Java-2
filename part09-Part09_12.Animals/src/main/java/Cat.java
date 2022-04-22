
public class Cat extends Animal implements NoiseCapable {
    
    private String name;
    
    public Cat(String name) {
        super(name);
    }
    
    public Cat() {
        this.name = "Cat";
    }
    
    public void purr() {
        System.out.println(this.name+ " purrs");
    }
    
    @Override
    public void makeNoise() {
        this.purr();
    }
}