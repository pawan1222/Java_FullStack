package Map;
/*
Q. Online Order Processing System
Each Order has:
	int orderId
	String customerName
	double orderAmount
	int itemCount
	long orderTime

Write a Java program to sort orders using Comparator based on:
	Higher orderAmount first
	If amount same → fewer itemCount first
	If itemCount same → earlier orderTime first
	If orderTime same → customerName in ascending order
	If customerName same → orderId in ascending order
*/

import java.util.*;

public class comparator2 {
    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();

        orders.add(new Order(101, "Rahul", 5000.0, 3, 1695000000000L));
        orders.add(new Order(102, "Ankit", 7000.0, 2, 1694000000000L));
        orders.add(new Order(103, "Rahul", 7000.0, 5, 1693000000000L));
        orders.add(new Order(104, "Aman", 7000.0, 2, 1694000000000L));
        orders.add(new Order(105, "Aman", 7000.0, 2, 1694000000000L));

        System.out.println("Before Sorting:");
        for (Order o : orders) {
            System.out.println(o);
        }

        Collections.sort(orders, new OrderComparator());

        System.out.println("\nAfter Sorting:");
        for (Order o : orders) {
            System.out.println(o);
        }
    }
}

class Order {
    int orderId;
    String customerName;
    double orderAmount;
    int itemCount;
    long orderTime;

    Order(int orderId, String customerName, double orderAmount, int itemCount, long orderTime) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderAmount = orderAmount;
        this.itemCount = itemCount;
        this.orderTime = orderTime;
    }

    @Override
    public String toString() {
        return "OrderId: " + orderId +
               ", Name: " + customerName +
               ", Amount: " + orderAmount +
               ", Items: " + itemCount +
               ", Time: " + orderTime;
    }
}


class OrderComparator implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {

        // 1. Higher orderAmount first
        int cmp = Double.compare(o2.orderAmount, o1.orderAmount);
        if (cmp != 0) return cmp;

        // 2. Fewer itemCount first
        cmp = Integer.compare(o1.itemCount, o2.itemCount);
        if (cmp != 0) return cmp;

        // 3. Earlier orderTime first
        cmp = Long.compare(o1.orderTime, o2.orderTime);
        if (cmp != 0) return cmp;

        // 4. customerName ascending
        cmp = o1.customerName.compareTo(o2.customerName);
        if (cmp != 0) return cmp;

        // 5. orderId ascending
        return Integer.compare(o1.orderId, o2.orderId);
    }
}
