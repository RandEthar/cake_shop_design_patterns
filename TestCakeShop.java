
public class TestCakeShop {

  public static void main(String[] args) {
    CakeShop myCakeShop = new MyCakeShop();
    Cake cake = myCakeShop.orderCake("CheeseCake");
    System.out.println("Ordered a " + cake.getDescription() + " costing $" + cake.cost());
    cake = new Cream(cake);
    System.out.println("Added Cream: " + cake.getDescription() + " costing $" + cake.cost());
    cake = new Skittles(cake);
    System.out.println("Added Skittles: " + cake.getDescription() + " costing $" + cake.cost());
  }

}