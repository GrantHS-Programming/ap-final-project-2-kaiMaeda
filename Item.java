public class Item {
    private String name;
    private int cost;
    private boolean standard;

    public Item(String name, int cost,  boolean standard) {
        this.name = name;
        this.cost = cost;
        this.standard = standard;
    }
    public String getName(){
        return name;
    }
    public int getMax(){
        System.out.println("get max");
        return cost + 1;
    }
    public int getMin(){
        System.out.println("get max");
        return cost;
    }
    public int getCost(){
        return cost;
    }
    public boolean getStandard(){
        return standard;
    }

}
