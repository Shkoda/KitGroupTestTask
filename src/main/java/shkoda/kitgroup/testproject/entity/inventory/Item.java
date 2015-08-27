package shkoda.kitgroup.testproject.entity.inventory;

import java.util.UUID;

/**
 * Created by Nightingale on 27.08.2015.
 */
public class Item {
    public final int prototypeId;
    public final Type type;
    private final UUID id;



    public Item(int prototypeId, Type type) {
        this.prototypeId = prototypeId;
        this.type = type;
        this.id = UUID.randomUUID();
    }

    public enum Type{
        WEAPON,
        ARMOR,
        CONSUMABLE
    }

}
