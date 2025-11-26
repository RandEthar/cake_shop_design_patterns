//concrete decorator
public  class Skittles extends CondimentDecorator {
    Cake cake;

    public Skittles(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + ", Skittles";
    }

    @Override
    public double cost() {
        return 2.0 + cake.cost();
    }
    
}
