package shkoda.kitgroup.testproject.entity.stats;

/**
 * Created by Nightingale on 27.08.2015.
 */
public abstract class Bar {
    protected int max, current;

    public Bar(int max, int current) {
        this.max = max;
        this.current = current;
    }

    public Bar(int max) {

        this.max = max;
        current = max;
    }

    public void resetToMaxValue(){
        current = max;
    }

    public int increment(int amount) {
        current = Math.min(current + amount, max);
        return current;
    }

    public int decrement(int amount) {
        current = Math.max(current - amount, 0);
        return current;
    }

    public int getMax() {
        return max;
    }

    public int getCurrent() {
        return current;
    }
}
