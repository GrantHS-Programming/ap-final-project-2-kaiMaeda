import java.util.Scanner;
public class Character {
    String name;
    int money;
    int movement;
    int trophy;
    Item[] inventory;
    public Character(String name, int money, int movement, int trophy, Item[] inventory) {
        this.name = name;
        this.money = money;
        this.movement = movement;
        this.trophy = trophy;
        this.inventory = inventory;
    }
    public int rollDice(Item[] inventory){
        Scanner myScanner = new Scanner(System.in);
        int optionNum = 2;
        System.out.println("Default: 1\n");
        for (Item option : inventory)
        {
            if (option instanceof Dice) {
                System.out.println(option.getName() + ": " + optionNum + "\n");
                optionNum += 1;
            }
        }
        myScanner.useDelimiter("\\n");
        int choice = myScanner.nextInt();
        if (inventory[choice] instanceof Dice){
            return (int) (Math.random() * inventory[choice].getMax()) + inventory[choice].getMin();
        }
    }
}
