package shkoda.kitgroup.testproject.entity.abilities.effects;

import shkoda.kitgroup.testproject.entity.abilities.args.AbilityMechanicsArgs;
import shkoda.kitgroup.testproject.entity.game.Game;
import shkoda.kitgroup.testproject.entity.actors.Player;

public abstract class Effect  {
    public final int id;
    public final EffectType type;

    private  Game game;
    protected Player owner;



    public Effect(int id, EffectType type) {
        this.id = id;
        this.type = type;
    }

    public void init(Player owner,  Game game) {
        this.owner = owner;
        this.game = game;
    }

    public int getDamage() {
        return 0;
    }

    public abstract void apply(AbilityMechanicsArgs args);

    public abstract void cancel();


}
