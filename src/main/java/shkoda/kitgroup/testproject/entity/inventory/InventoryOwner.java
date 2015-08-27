package shkoda.kitgroup.testproject.entity.inventory;

/**
 * Created by Nightingale on 27.08.2015.
 */
public interface InventoryOwner {
    boolean canPut(Item item);
    void put(Item item, int slotId);
    Item pop(int slotId);
    Item peek(int slotId);
}
