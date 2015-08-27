package shkoda.kitgroup.testproject.entity.abilities.args;

public abstract class AbilityMechanicsArgs {
    public final Type type;

    public AbilityMechanicsArgs(Type type) {
        this.type = type;
    }

    public static enum Type {

        DEAL_DAMAGE,
        STUN,

    }
}
