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

    public String getName() {
        return name;
    }

    public int getDiceRoll() {
        return diceRoll;
    }

    public void recieveItem(Item[] inventory, Item received) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = received;
                System.out.println(getName() + " received " + received.getName());
                break;
            }
            else {
                if (isHuman = true) {
                    System.out.println(getName() + ", do you want to replace an item for " + received.getName());
                    Scanner myScanner = new Scanner(System.in);
                    int optionNum = 1;
                    for (Item option : inventory) {
                        System.out.println(option.getName() + ": " + optionNum + "\n");
                        optionNum += 1;
                    }
                    System.out.println("No: " + optionNum + "\n");
                    myScanner.useDelimiter("\\n");
                    int choice = myScanner.nextInt();
                    if (choice == optionNum) {
                        System.out.println(getName() + " did not take " + received.getName() + " with them.");
                    } else {
                        while(inventory[choice - 1].getStandard() == true){
                            System.out.println("You can't replace standard");
                            myScanner.useDelimiter("\\n");
                            choice = myScanner.nextInt();
                        }
                        System.out.println(getName() + " replaced " + inventory[choice - 1].getName());
                        inventory[choice - 1] = received;
                        System.out.print(" with " + received.getName());
                    }
                }
                else {
                    int choice = 0;
                    System.out.println(getName() + ", do you want to replace an item for " + received.getName());
                    int optionNum = 1;
                    int lowest = inventory[1].getCost();
                    for (Item option : inventory) {
                        System.out.println(option.getName() + ": " + optionNum + "\n");
                        if (option.getCost() < lowest) {
                            lowest = option.getCost();
                            System.out.println(lowest);
                            choice = optionNum;
                        }
                        optionNum += 1;
                    }
                    System.out.println("No: " + optionNum + "\n");
                    if (choice == 0) {
                        System.out.println(getName() + "did not take " + received.getName() + " with them.");
                    }
                    if (received.getCost() > lowest && inventory[choice -1].getStandard() == true) {
                        System.out.println(getName() + " replaced " + inventory[choice - 1].getName());
                        inventory[choice - 1] = received;
                        System.out.print(" with " + received.getName());
                    }
                }
            }
        }
    }

    public void rollDice(Item[] inventory) {
        System.out.println(getName() + ", which dice do you want to use?");
        int choice = 0;
        int optionNum = 1;
        int maxval = 0;
        for (Item option : inventory) {
            if (option instanceof Dice) {
                System.out.println(option.getName() + ": " + optionNum + "\n");
                if (option.getMax() > maxval) {
                    maxval = option.getMax();
                    choice = optionNum;
                }
                optionNum += 1;
            }
        }
        if (isHuman == true) {
            Scanner myScanner = new Scanner(System.in);
            myScanner.useDelimiter("\\n");
            choice = myScanner.nextInt();
            while (inventory[choice] instanceof Dice) {
                System.out.println("chose a dice");
                choice = myScanner.nextInt();
            }
        }
        diceRoll = (int) (Math.random() * inventory[choice - 1].getMax()) + inventory[choice - 1].getMin();
        System.out.println(getName() + " rolled a " + diceRoll);
    }
    public void movement(){

    }
}
