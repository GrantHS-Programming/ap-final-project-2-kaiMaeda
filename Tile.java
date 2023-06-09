public class Tile {
    Character[] occupy;
    public Tile(){
        occupy = new Character[4];
    }
    public void event(){

        System.out.println("Landed on a default");
    }
}
