public class Character {
String name;
int money;
int roll;
public int rollDice(){
    Math.random() * (Dice.getMax - Dice.getMin) + Dice.getMin;
}
}
