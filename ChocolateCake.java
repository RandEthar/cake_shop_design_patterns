//concrete component
public class ChocolateCake extends Cake {
    public ChocolateCake() {
        description = "Chocolate Cake";
    }

    @Override
    public double cost() {
        return 20.0;
    }
}
