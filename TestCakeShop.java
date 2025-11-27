public class TestCakeShop {

    public static void main(String[] args) {

        // Get the single instance of the CakeOrderingSystem (Singleton)
        CakeOrderingSystem cakeOrderingSystem = CakeOrderingSystem.getInstance();
      
        // Register dashboards (Observers)
        CustomerDashboard customerDashboard = new CustomerDashboard(cakeOrderingSystem);
        MangerDashboard mangerDashboard = new MangerDashboard(cakeOrderingSystem);

        // Create a cake factory
        CakeShop myCakeShop = new MyCakeShop();

        // ---------- Order 1 ----------
        // Create base cake (Factory)
        Cake cake = myCakeShop.orderCake("CheeseCake");

        // Add decorations (Decorator)
        cake = new Cream(cake);
        cake = new Skittles(cake);

        // Create order with unique number
        Order order1 = new Order(cake);

        // Notify observers and record sale
        cakeOrderingSystem.placeOrder(order1);

        // ---------- Order 2 ----------
        Cake cake2 = myCakeShop.orderCake("AppleCake");
        cake2 = new Cream(cake2); // decoration
        Order order2 = new Order(cake2);
        cakeOrderingSystem.placeOrder(order2);

        // ---------- Order 3 ----------
        Cake cake3 = myCakeShop.orderCake("ChocolateCake");
        cake3 = new Skittles(cake3);
        Order order3 = new Order(cake3);
        cakeOrderingSystem.placeOrder(order3);

        // ---------- Order 4 ----------
        Cake cake4 = myCakeShop.orderCake("CheeseCake");
        cake4 = new Cream(cake4);
        cake4 = new Skittles(cake4);
        Order order4 = new Order(cake4);
        cakeOrderingSystem.placeOrder(order4);
         // ---------- Order 5 ----------
        Cake cake5 = myCakeShop.orderCake("ChocolateCake");
        cake5 = new ChocolateChips(cake5);
        Order order5 = new Order(cake5);
        cakeOrderingSystem.placeOrder(order5);
    }
}
