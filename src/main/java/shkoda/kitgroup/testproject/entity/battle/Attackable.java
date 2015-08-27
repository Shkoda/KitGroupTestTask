package shkoda.kitgroup.testproject.entity.battle;

import shkoda.kitgroup.testproject.entity.battle.Damage;

/**
 * Created by Nightingale on 27.08.2015.
 */
public interface Attackable {
    boolean isAlive();
    boolean canBeAttackedNow();

    /**
     *
     * @param damage
     * @return new modified damage
     */
    Damage tryToAbsorbDamage(Damage damage);

    void acceptDamage(Damage damage);

}
