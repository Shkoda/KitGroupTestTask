package shkoda.kitgroup.testproject.entity.actors;

import shkoda.kitgroup.testproject.entity.abilities.Ability;
import shkoda.kitgroup.testproject.entity.abilities.mechanics.Cancellable;
import shkoda.kitgroup.testproject.entity.battle.*;
import shkoda.kitgroup.testproject.entity.events.Event;
import shkoda.kitgroup.testproject.entity.inventory.Inventory;
import shkoda.kitgroup.testproject.entity.inventory.InventoryOwner;
import shkoda.kitgroup.testproject.entity.inventory.Item;
import shkoda.kitgroup.testproject.entity.stats.*;
import shkoda.kitgroup.testproject.utils.EventHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nightingale on 27.08.2015.
 * <p>
 * * Есть персонаж. У персонажа есть здоровье, мана, энергия.
 * Есть тип урона и сам урон. Персонаж имеет броню.
 * У персонажа есть активные и пассивные способности.
 * На него возможно наложить бафы и дебафы (http://wowslovar.ru/baf/).
 * Есть инвентарь в размере n объектов.
 * <p>
 * * (например персонаж атакует башню, башня применяет баф на персонажа,
 * персонаж отдает вещь ослу и наоборот)
 */
public class Player implements Attacker, Attackable, EventHandler, InventoryOwner, ManaOwner {
    private Health health;
    private Mana mana;
    private Armor armor;
    private Attack attack;
    private Inventory inventory;

    private List<Ability> activeAbilities = new ArrayList<>();
    private List<Ability> passiveAbilities = new ArrayList<>();

    private List<Cancellable> continuousEffects = new ArrayList<>();

    private Donkey donkey;

    public Player(int hp, int mana, int armor, int inventoryCapacity, Attack.Type damageType, int damageValue) {
        this.health = new Health(hp);
        this.mana = new Mana(mana);
        this.armor = new Armor(armor);
        this.inventory = new Inventory(inventoryCapacity);
        this.attack = new Attack(damageType, damageValue);
    }

    public void refresh() {
        health.resetToMaxValue();
        mana.resetToMaxValue();
        armor.resetToMaxValue();
    }


    @Override
    public boolean isAlive() {
        return health.isAlive();
    }

    @Override
    public boolean canBeAttackedNow() {
        return true;
    }

    @Override
    public void acceptDamage(Damage damage) {
        //try to absorb damage with armor and abilities
        health.decrement(damage.getValue());
    }

    @Override
    public Damage tryToAbsorbDamage(Damage damage) {
        return damage;
    }

    @Override
    public Damage generateDamage() {
        Damage damage = new Damage(attack.type, attack.getValue());
        //try to modify damage with abilities
        return damage;
    }

    @Override
    public void attack(Attackable victim) {

    }

    @Override
    public void handleEvent(Event event) {
        activeAbilities.forEach(a -> a.handleEvent(event));
        passiveAbilities.forEach(a -> a.handleEvent(event));
        //handle with inventory
    }

    public void addEffect() {

    }

    public void removeEffect() {

    }


    @Override
    public boolean canPut(Item item) {
        return false;
    }

    @Override
    public void put(Item item, int slotId) {

    }

    @Override
    public Item pop(int slotId) {
        return null;
    }

    @Override
    public Item peek(int slotId) {
        return null;
    }

    @Override
    public boolean hasEnoughMana(int spellCost) {
        return false;
    }

    @Override
    public void cast(int spellId) {

    }

    public void transferItemToDonkey(int srcSlotId, int dstSlotId) {
        transferItem(this, donkey, srcSlotId, dstSlotId);
    }

    public void transferItemFromDonkey(int srcSlotId, int dstSlotId) {
        transferItem(donkey, this, srcSlotId, dstSlotId);
    }

    private void transferItem(InventoryOwner src, InventoryOwner dst, int srcSlotId, int dstSlotId) {
        if (dst == null)
            return;

        Item item = src.peek(srcSlotId);
        if (!dst.canPut(item))
            return;

        src.pop(srcSlotId);
        dst.put(item, dstSlotId);
    }

    public Donkey getDonkey() {
        return donkey;
    }

    public void setDonkey(Donkey donkey) {
        this.donkey = donkey;
    }
}
