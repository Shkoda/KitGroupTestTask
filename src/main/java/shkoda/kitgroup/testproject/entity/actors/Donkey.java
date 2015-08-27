package shkoda.kitgroup.testproject.entity.actors;

import shkoda.kitgroup.testproject.entity.battle.ManaOwner;
import shkoda.kitgroup.testproject.entity.events.Event;
import shkoda.kitgroup.testproject.entity.inventory.Inventory;
import shkoda.kitgroup.testproject.entity.inventory.InventoryOwner;
import shkoda.kitgroup.testproject.entity.inventory.Item;
import shkoda.kitgroup.testproject.entity.stats.Mana;
import shkoda.kitgroup.testproject.utils.EventHandler;

/**
 * Created by Nightingale on 27.08.2015.
 * <p>
 * Есть осел. Который имеет ману. у него есть инвентарь в размере 4 объектов.
 */
public class Donkey implements InventoryOwner, EventHandler, ManaOwner {
    private static final int DEFAULT_INVENTORY_CAPACITY = 4;
    private Mana mana;
    private Inventory inventory;

    public Donkey(int mana, int inventoryCapacity) {
        this.mana = new Mana(mana);
        inventory = new Inventory(inventoryCapacity);
    }

    public Donkey(int mana) {
        this(mana, DEFAULT_INVENTORY_CAPACITY);
    }

    @Override
    public boolean canPut(Item item) {
        return false;
    }

    @Override
    public Item peek(int slotId) {
        return null;
    }

    @Override
    public void put(Item item, int slotId) {

    }

    @Override
    public Item pop(int slotId) {
        return null;
    }

    @Override
    public void handleEvent(Event event) {

    }

    @Override
    public boolean hasEnoughMana(int spellCost) {
        return false;
    }

    @Override
    public void cast(int spellId) {

    }
}
