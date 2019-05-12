import java.util.Random;

public class BotPlayer implements Playable {
    private String name;
    Symbol s;

    public BotPlayer(String name){
        this.name = name;
    }
    public int[] getCord() {
        Random l= new Random();
        int row= l.nextInt(3);
        Random c= new Random();
        int col=c.nextInt(3);

        return new int[]{row, col};
    }
    @Override
    public String toString() {
        return name + s;
    }

    public Symbol getSymbol() {
        return s;
    }

    public void setSymbol(Symbol s) {
this.s=s;
    }
}
