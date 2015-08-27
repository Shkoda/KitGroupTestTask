package shkoda.kitgroup.testproject.entity.stats;

/**
 * Created by Nightingale on 27.08.2015.
 */
public class Health extends Bar{
    public Health(int max, int current) {
        super(max, current);
    }

    public Health(int max) {
        super(max);
    }

    public boolean isAlive(){
        return current>0;
    }


}
