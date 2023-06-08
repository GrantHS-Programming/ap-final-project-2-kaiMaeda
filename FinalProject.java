import java.util.Scanner;
public class FinalProject {
    Character[] players = new Character[4];
    public static void main(String[] args) {
        new FinalProject();
    }
    public FinalProject(){
        gameStart();
    }
    public void gameStart(){
        Dice standard = new Dice("Default", 0, 10, 1, true);
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many players do you want from 1 to 4?");
        int playerNum = myScanner.nextInt();
        if(playerNum == 4){
            Character player4 = new Character("player Four", 5, 0, 0, true);
            Character player3 = new Character("player Three", 5, 0, 0,true);
            Character player2 = new Character("player Two", 5, 0, 0,true);
            players[3] = player4;
            players[2] = player3;
            players[1] = player2;
        }
        if (playerNum == 3){
            Character cpu1 = new Character("Cpu One", 5, 0, 0,false);
            Character player3 = new Character("player Three", 5, 0, 0,true);
            Character player2 = new Character("player Two", 5, 0, 0,true);
            players[3] = cpu1;
            players[2] = player3;
            players[1] = player2;
        }
        if (playerNum == 2){
            Character cpu1 = new Character("Cpu One", 5, 0, 0,false);
            Character cpu2 = new Character("Cpu Two", 5, 0, 0,false);
            Character player2 = new Character("player Two", 5, 0, 0,true);
            players[3] = cpu2;
            players[2] = cpu1;
            players[1] = player2;
        }
        if (playerNum == 1){
            Character cpu1 = new Character("Cpu One", 5, 0, 0,false);
            Character cpu2 = new Character("Cpu Two", 5, 0, 0,false);
            Character cpu3 = new Character("Cpu Three", 5, 0, 0,false);
            players[3] = cpu3;
            players[2] = cpu2;
            players[1] = cpu1;
        }
        Character player1 = new Character("player One", 5, 0, 0,true);
        players[0] = player1;
        players[0].recieveItem(players[0].inventory, standard);
        players[1].recieveItem(players[1].inventory, standard);
        players[2].recieveItem(players[2].inventory, standard);
        players[3].recieveItem(players[3].inventory, standard);
        everyoneRoll();
    }
    public void everyoneRoll(){
        players[0].rollDice(players[0].inventory);
        players[1].rollDice(players[1].inventory);
        players[2].rollDice(players[2].inventory);
        players[3].rollDice(players[3].inventory);
    }
}
