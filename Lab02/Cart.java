package Lab02;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    public static final int MAX_NUMBER_ORDERED = 20;

    private int qtyOrdered;
    private List<DigitalVideoDisc> itemsOrdered;

    public Cart() {
        qtyOrdered = 0;
        itemsOrdered = new ArrayList<>(MAX_NUMBER_ORDERED);
    }

    public int getQtyOrdered() {
        return this.qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered > MAX_NUMBER_ORDERED) {
            System.out.println("The cart is almost full");
            return;
        } else {
            qtyOrdered++;
            itemsOrdered.add(disc);
            System.out.println("The disc has been added");
        }
        return;
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int find = 0;
        String discName = disc.getTitle();
        for (DigitalVideoDisc item : itemsOrdered) {
            if (item.getTitle().equals(discName)) {
                find = 1;
                itemsOrdered.remove(item);
            }
        }
        if (qtyOrdered == 0) {
            System.out.println("Your cart is empty");
            return;
        }
        if (find == 0) {
            System.out.println("Unable to found disc in your cart");
        } else {
            System.out.println("Your item has been removed");
        }
        return;
    }

    public float totalCost() {
        float sum = 0f;
        for (DigitalVideoDisc item : itemsOrdered) {
            sum += item.getCost();
        }
        return sum;
    }
}
