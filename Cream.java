//concrete decorator

public class Cream extends CondimentDecorator {
    Cake cake;

    public Cream(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + ", Cream";
    }

    @Override
    public double cost() {
        return 5.0 + cake.cost();
    }
    
}
