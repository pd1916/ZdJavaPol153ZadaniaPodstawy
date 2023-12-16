package pl.sdacademy.java.basic.exercices.day3.task9;

import java.util.Objects;

public class OrderItem {
    public static final String DELIMITER = "\t|\t";
    private final String productName;
    private final int quantity;
    private final double price;

    public OrderItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public double getAmount() {
        return quantity * price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isCorrect() {
        if((quantity > 0) && (price > 0)) {
            return true;
        }
        System.out.println("Wrong price or quantity");
        return false;
    }

    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append(productName).append(DELIMITER);
        sb.append(price).append(" zł").append(DELIMITER);
        sb.append(quantity).append(" pcs").append(DELIMITER);
        sb.append(getAmount()).append(DELIMITER);
        System.out.println(sb);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return quantity == orderItem.quantity && Double.compare(price, orderItem.price) == 0 && Objects.equals(productName, orderItem.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, quantity, price);
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
