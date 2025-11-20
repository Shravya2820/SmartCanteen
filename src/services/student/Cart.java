package services.student;

import java.util.ArrayList;

public class Cart {

    public static ArrayList<String> items = new ArrayList<>();

    public static void addItem(String item, int qty) {
        items.add(item + "  x" + qty);
    }

    public static ArrayList<String> getItems() {
        return items;
    }

    public static void clear() {
        items.clear();
    }
}
