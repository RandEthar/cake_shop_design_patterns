public class CustomerDashboard implements Observer, DisplayElement {
    private Order order;

    @Override
    public void update(Order order) {
        this.order = order;
        display();
    }

    @Override
    public void display() {
        System.out.println("Your order is ready: "
                + order.getCake().getDescription()
                + " (Order#" + order.getnumberOrder() + ")");
    }

}
