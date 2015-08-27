package shkoda.kitgroup.testproject.entity.battle;

/**
 * Created by Nightingale on 27.08.2015.
 */
public class Attack {
    public final Type type;
    private int value;

    public Attack(Type type, int value) {
        this.type = type;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public enum Type {
        INTELLIGENCE,
        CYNISM
    }
}
