package pl.sdacademy.java.basic.exercices.day3.task9;

public class Main {
    public static void main(String[] args) {
        OrderItem cukier = new OrderItem("Cukier", 3, 4);
        OrderItem mleko = new OrderItem("Mleko", 10, 3);

        Order order = new Order(2);
        order.addItem(cukier);
        order.addItem(mleko);
        //order.addItem(mleko);

        order.print();
    }
}
