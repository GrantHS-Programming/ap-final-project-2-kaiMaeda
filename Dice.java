public class Dice extends Item{
    private int max;
    private int min;

    public Dice(String name, int cost, int max, int min, boolean standard){
        super(name,cost,standard);
        this.max = max;
        this.min = min;
    }
    public int getMax(){
        return max;
    }
    public int getMin(){
        return min;
    }
}
