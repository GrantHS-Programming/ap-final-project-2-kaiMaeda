public class Item {
    private String name;
    private int cost;

    public Item(String name, int cost) {
        this.name = name;
        this.cost = cost;
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
}
