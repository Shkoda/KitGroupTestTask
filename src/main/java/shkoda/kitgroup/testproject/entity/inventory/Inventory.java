package shkoda.kitgroup.testproject.entity.inventory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nightingale on 27.08.2015.
 */
public class Inventory {
    private int capacity;
    private Map<Integer, Item> inventory;

    public Inventory(int capacity) {
        this.capacity = capacity;
        inventory = new HashMap<>(capacity);
    }

    public void put(Item item, int cellNumber) {

    }

    public Item pop(int cellNumber) {
        return null;
    }
    public Item peek(int slotId){
        return null;
    }

}
