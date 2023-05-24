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
        int players = myScanner.nextInt();
        if(players == 4){
            Character player4 = new Character("playerFour", 5, 0, 0, null);
        }
        if (players > 2){
            Character player3 = new Character("playerThree", 5, 0, 0, null);
        }
        if (players > 1){
            Character player2 = new Character("playerTwo", 5, 0, 0, null);
        }
        Character player1 = new Character("playerOne", 5, 0, 0, null);
        Character One = new Character("CpuOne", 5, 0, 0, null);
        Character Two = new Character("CpuTwo", 5, 0, 0, null);
        Character Three = new Character("CpuThree", 5, 0, 0, null);

    }
}
