package shkoda.kitgroup.testproject.entity.actors;

import shkoda.kitgroup.testproject.entity.abilities.Ability;
import shkoda.kitgroup.testproject.entity.abilities.mechanics.Cancellable;
import shkoda.kitgroup.testproject.entity.battle.*;
import shkoda.kitgroup.testproject.entity.inventory.Inventory;
import shkoda.kitgroup.testproject.entity.stats.Armor;
import shkoda.kitgroup.testproject.entity.stats.Health;
import shkoda.kitgroup.testproject.entity.stats.Mana;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nightingale on 27.08.2015.
 * <p>
 * * Есть башня. Имеет жизнь и ману. Она может атаковать и может создавать ауру. Имеет броню и способности.
 */
public class Tower implements Attackable, Attacker, ManaOwner {

    private Health health;
    private Mana mana;
    private Armor armor;
    private Attack attack;

    private List<Ability> abilities = new ArrayList<>();

    public void generateAura() {

    }


    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public boolean canBeAttackedNow() {
        return false;
    }

    @Override
    public void acceptDamage(Damage damage) {

    }

    @Override
    public Damage tryToAbsorbDamage(Damage damage) {
        return null;
    }

    @Override
    public Damage generateDamage() {
        return null;
    }

    @Override
    public boolean hasEnoughMana(int spellCost) {
        return false;
    }

    @Override
    public void cast(int spellId) {

    }
}
