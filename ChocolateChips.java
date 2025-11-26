//concrete decorator
public class ChocolateChips extends CondimentDecorator {
    Cake cake;

    public ChocolateChips(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + ", Chocolate Chips";
    }

    @Override
    public double cost() {
        return 2.0 + cake.cost();
    }
    
}
