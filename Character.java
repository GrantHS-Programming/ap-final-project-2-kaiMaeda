import java.util.Scanner;
public class Character {
    String name;
    int money;
    int movement;
    int trophy;
    Item[] inventory;
    public Character(String name, int money, int movement, int trophy) {
        this.name = name;
        this.money = money;
        this.movement = movement;
        this.trophy = trophy;
        inventory = new Item[4];
    }
    public String getName(){
        return name;
    }
    public void recieveItem(Item[] inventory, Item received){
        for (int i = 0; i < inventory.length; i++){
            if (inventory[i] == null){
                inventory[i] = received;
                System.out.println(getName() + " received " +received.getName());
                break;
            }
            else{
                System.out.println(getName() + ", do you want to replace an item for " + received.getName());
                Scanner myScanner = new Scanner(System.in);
                int optionNum = 1;
                for (Item option : inventory)
                {
                    if (option instanceof Dice) {
                        System.out.println(option.getName() + ": " + optionNum + "\n");
                        optionNum += 1;
                    }
                }
                System.out.println("No: " + optionNum + "\n");
                myScanner.useDelimiter("\\n");
                int choice = myScanner.nextInt();
                if (choice == optionNum){
                    System.out.println(getName() + "did not take " + received.getName() + " with them.");
                }
            }
        }
    }
    public int rollDice(Item[] inventory){
        System.out.println(getName() + ", which dice do you want to use?");
        Scanner myScanner = new Scanner(System.in);
        int optionNum = 1;
        for (Item option : inventory)
        {
            if (option instanceof Dice) {
                System.out.println(option.getName() + ": " + optionNum + "\n");
                optionNum += 1;
            }
        }
        myScanner.useDelimiter("\\n");
        int choice = myScanner.nextInt();
        while (inventory[choice] instanceof Dice){
            System.out.println("chose a dice");
            choice = myScanner.nextInt();
        }
        return (int) (Math.random() * inventory[choice].getMax()) + inventory[choice].getMin();
    }
}
