package shkoda.kitgroup.testproject.entity.battle;

/**
 * Created by Nightingale on 27.08.2015.
 */
public class Damage  {
    public final Attack.Type type;
    private int value;
    private Attacker author;
    private Attackable target;

    public Damage(Attack.Type type) {
        this.type = type;
    }

    public Damage(Attack.Type type, int value) {
        this.type = type;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Attacker getAuthor() {
        return author;
    }

    public void setAuthor(Attacker author) {
        this.author = author;
    }

    public Attackable getTarget() {
        return target;
    }

    public void setTarget(Attackable target) {
        this.target = target;
    }
}
