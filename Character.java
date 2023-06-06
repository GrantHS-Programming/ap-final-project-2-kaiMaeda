import java.util.Scanner;
public class Character {
    String name;
    int money;
    int diceRoll;
    int trophy;

    boolean isHuman;
    Item[] inventory;
    public Character(String name, int money, int diceRoll, int trophy, boolean isHuman) {
        this.name = name;
        this.money = money;
        this.diceRoll = diceRoll;
        this.trophy = trophy;
        this.isHuman = isHuman;
        inventory = new Item[4];
    }
    public String getName(){
        return name;
    }
    public int getDiceRoll(){return diceRoll;}
    public void recieveItem(Item[] inventory, Item received){
        for (int i = 0; i < inventory.length; i++){
            if (inventory[i] == null){
                inventory[i] = received;
                System.out.println(getName() + " received " +received.getName());
                break;
            }
            else{
                if (isHuman = true){
                    System.out.println(getName() + ", do you want to replace an item for " + received.getName());
                    Scanner myScanner = new Scanner(System.in);
                    int optionNum = 1;
                    for (Item option : inventory)
                    {
                        System.out.println(option.getName() + ": " + optionNum + "\n");
                        optionNum += 1;
                    }
                    System.out.println("No: " + optionNum + "\n");
                    myScanner.useDelimiter("\\n");
                    int choice = myScanner.nextInt();
                    if (choice == optionNum){
                        System.out.println(getName() + " did not take " + received.getName() + " with them.");
                    }
                    else {
                        inventory[choice - 1] = received;
                        System.out.println(getName() + " recieved " + received.getName());
                    }
                }
                else {
                    int choice = 0;
                    System.out.println(getName() + ", do you want to replace an item for " + received.getName());
                    int optionNum = 1;
                    int lowest = inventory[0].getCost();
                    for (Item option : inventory) {
                        System.out.println(option.getName() + ": " + optionNum + "\n");
                        if(option.getCost() < lowest){
                            lowest = option.getCost();
                            System.out.println(lowest);
                            choice = optionNum - 1;
                        }
                        optionNum += 1;
                    }
                    System.out.println("No: " + optionNum + "\n");
                    if (choice == 0){
                        System.out.println(getName() + "did not take " + received.getName() + " with them.");
                    }
                    if (received.getCost() > lowest){
                        inventory[choice] = received;
                        System.out.println(getName() + " recieved " + received.getName());
                    }
                }
            }
        }
    }
    public void rollDice(Item[] inventory){
        System.out.println(getName() + ", which dice do you want to use?");
        int optionNum = 1;
        for (Item option : inventory)
        {
            if (option instanceof Dice) {
                System.out.println(option.getName() + ": " + optionNum + "\n");
                optionNum += 1;
            }
        }
        int choice = 0;
        if(isHuman == true){
            Scanner myScanner = new Scanner(System.in);
            myScanner.useDelimiter("\\n");
            choice = myScanner.nextInt();
            while (inventory[choice] instanceof Dice){
                System.out.println("chose a dice");
                choice = myScanner.nextInt();
            }
        }
        else{
            //cpu option
        }
        diceRoll = (int) (Math.random() * inventory[choice - 1].getMax()) + inventory[choice - 1].getMin();
    }
}
