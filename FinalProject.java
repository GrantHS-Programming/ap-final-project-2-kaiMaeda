import java.util.Scanner;
public class FinalProject {
    public static void main(String[] args) {
        new FinalProject();
    }
    public FinalProject(){
        gameStart();
    }
    public void gameStart(){
        Dice Default = new Dice("Default", 0, 10, 1);
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many players do you want from 1 to 4?");
        int playerNum = myScanner.nextInt();
        Character[] players = new Character[4];
        if(playerNum == 4){
            Character player4 = new Character("playerFour", 5, 0, 0, null);
            Character player3 = new Character("playerThree", 5, 0, 0, null);
            Character player2 = new Character("playerTwo", 5, 0, 0, null);
            players[3] = player4;
            players[2] = player3;
            players[1] = player2;
        }
        if (playerNum == 3){
            Character cpu1 = new Character("CpuOne", 5, 0, 0, null);
            Character player3 = new Character("playerThree", 5, 0, 0, null);
            Character player2 = new Character("playerTwo", 5, 0, 0, null);
            players[3] = player3;
            players[2] = player2;
            players[1] = cpu1;
        }
        if (playerNum == 2){
            Character cpu1 = new Character("CpuOne", 5, 0, 0, null);
            Character cpu2 = new Character("CpuTwo", 5, 0, 0, null);
            Character player2 = new Character("playerTwo", 5, 0, 0, null);
            players[3] = player2;
            players[2] = cpu1;
            players[1] = cpu2;
        }
        if (playerNum == 1){
            Character cpu1 = new Character("CpuOne", 5, 0, 0, null);
            Character cpu2 = new Character("CpuTwo", 5, 0, 0, null);
            Character cpu3 = new Character("CpuThree", 5, 0, 0, null);
            players[3] = cpu1;
            players[2] = cpu2;
            players[1] = cpu3;
        }
        Character player1 = new Character("playerOne", 5, 0, 0, null);
        players[0] = player1;
    }
}
