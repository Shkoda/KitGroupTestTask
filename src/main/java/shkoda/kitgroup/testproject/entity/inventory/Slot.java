package shkoda.kitgroup.testproject.entity.inventory;

/**
 * Created by Nightingale on 27.08.2015.
 */
public class Slot {
    private Item content;

    public boolean isFree(){
        return content == null;
    }

    public Item pop(){
        Item tmp = content;
        content = null;
        return tmp;
    }

    /**
     *
     * @param item
     * @return previous content
     */
    public Item push(Item item){
        Item tmp = content;
        content = item;
        return tmp;
    }
}
