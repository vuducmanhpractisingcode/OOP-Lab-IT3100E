package Lab02;

public class Aims {

    public static void main(String[] args) {
        // TO-DO Auto-generated method stub
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        // Add item in the list
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);
        // remove item from the list
        // anOrder.removeDigitalVideoDisc(dvd2);
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());
    }
}
