import java.util.Scanner;
public class Character {
    String name;
    int money;
    int movement;
    Item[] inventory;
    public Character(String name, int money, int movement, Item[] inventory) {
        this.name = name;
        this.money = money;
        this.movement = movement;
        this.inventory = inventory;
    }
    public int rollDice(Item[] inventory){
        Scanner myScanner = new Scanner(System.in);
        int optionNum = 1;
        for (Item option : inventory)
        {
            System.out.println(optionNum + ": " + option.getName());
            System.out.println();
            optionNum +=1;
        }
        myScanner.useDelimiter("\\n");
        int choice = myScanner.nextInt();
        return (int) (Math.random() * inventory[choice].getMax()) + ;
    }
}
