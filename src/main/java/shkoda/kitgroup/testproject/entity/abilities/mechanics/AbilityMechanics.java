package shkoda.kitgroup.testproject.entity.abilities.mechanics;


import shkoda.kitgroup.testproject.entity.abilities.args.AbilityMechanicsArgs;
import shkoda.kitgroup.testproject.entity.abilities.effects.Effect;
import shkoda.kitgroup.testproject.entity.events.Event;
import shkoda.kitgroup.testproject.entity.game.Game;
import shkoda.kitgroup.testproject.entity.actors.Player;


public abstract class AbilityMechanics {
    public final int id;
    public final MechanicsType type;

    protected Effect[] effects;

    protected Player owner;
    protected Player enemy;
    protected Game game;

    protected int abilityId;


    public AbilityMechanics(int id, MechanicsType type, Effect[] effects) {
        this.id = id;
        this.type = type;
        this.effects = effects;
    }

    public AbilityMechanics(int id, MechanicsType type) {
        this.id = id;
        this.type = type;
    }

    public void init(Player owner, Player enemy, Game game) {
        this.owner = owner;

        this.enemy = enemy;
        this.game = game;
        for (Effect effect : effects) {
            effect.init(owner, game);
        }

    }


    public abstract boolean handleEvent(Event e);


    protected void applyForEachEffect(AbilityMechanicsArgs args) {
        for (Effect effect : effects) {
            effect.apply(args);
        }
    }


    public void setAbilityId(int abilityId) {
        this.abilityId = abilityId;
    }

    public void setEffects(Effect[] effects) {
        this.effects = effects;
    }


}
