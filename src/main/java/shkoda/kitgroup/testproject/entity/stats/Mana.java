package shkoda.kitgroup.testproject.entity.stats;

/**
 * Created by Nightingale on 27.08.2015.
 */
public class Mana extends Bar {
    public Mana(int max, int current) {
        super(max, current);
    }

    public Mana(int max) {
        super(max);
    }

    public boolean isEnough(int manaForSpell){
        return current>=manaForSpell;
    }
}
