public class Dice extends Item{
    private int max;
    private int min;
    public Dice(String name, int cost, int max, int min){
        super(name,cost);
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
