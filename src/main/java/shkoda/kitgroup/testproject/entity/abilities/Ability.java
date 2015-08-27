package shkoda.kitgroup.testproject.entity.abilities;


import shkoda.kitgroup.testproject.entity.abilities.effects.Effect;
import shkoda.kitgroup.testproject.entity.abilities.mechanics.AbilityMechanics;
import shkoda.kitgroup.testproject.entity.events.Event;
import shkoda.kitgroup.testproject.entity.game.Game;
import shkoda.kitgroup.testproject.entity.actors.Player;
import shkoda.kitgroup.testproject.utils.EventHandler;

import java.util.Arrays;


public class Ability implements EventHandler {
    public final int id;
    public final AbilityMechanics mechanics;

    public final Effect[] effects;

    protected Player myPlayer, enemyPlayer;

    protected Game game;

    public Ability(int id, AbilityMechanics mechanics, Effect[] effects) {
        this.id = id;
        this.mechanics = mechanics;
        this.mechanics.setAbilityId(id);
        this.effects = effects;
        this.mechanics.setEffects(effects);
    }


    @Override
    public void handleEvent(Event e) {
        if (mechanics.handleEvent(e)) {
            //notify

        }
    }



    public void cancel() {
        for (Effect effect : effects) {
            effect.cancel();
        }
    }


    @Override
    public String toString() {
        return "Ability{" +
                "id=" + id +
                ", mechanics=" + mechanics +
                ", effects=" + Arrays.toString(effects) +
                '}';
    }
}
