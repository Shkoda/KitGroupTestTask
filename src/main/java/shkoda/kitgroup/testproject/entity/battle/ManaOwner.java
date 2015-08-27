package shkoda.kitgroup.testproject.entity.battle;

/**
 * Created by Nightingale on 27.08.2015.
 */
public interface ManaOwner {
    boolean hasEnoughMana(int spellCost);

    void cast(int spellId);
}
