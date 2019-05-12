import sun.invoke.empty.Empty;

import java.util.Random;

public class Referee {
    private Playable pX;
    private Playable p0;
    private Playboard board;

    public Referee(Playboard board, Playable a, Playable b) {
        this.board = board;
        Random r = new Random();
        if (r.nextBoolean()) {
            this.pX = a;
            a.setSymbol(Symbol.SYMBOL_X);
            this.p0 = b;
            b.setSymbol(Symbol.SYMBOL_0);
        } else {
            this.pX = b;
            b.setSymbol(Symbol.SYMBOL_X);
            this.p0 = a;
            a.setSymbol(Symbol.SYMBOL_0);
        }
    }

    public void start() {
        Playable currentPlayer = pX;
        while (board.getWinner()==Symbol.SYMBOL_EMPTY&&board.isDraw()==false) {
            System.out.println(board);

            System.out.println(currentPlayer + " si este la rand, introduceti coordonate valoare: ");
            int[] coord = currentPlayer.getCord();
            //Arbitru valideaza mutarea cu respect
            //fata de incapsulare, nu se uita abuziv in martice
            //intreaba matricea daca e libera casuta


            boolean validCord = false;
            while (validCord == false) {
                if (board.isEmpty(coord)) {
                    board.fill(coord, currentPlayer.getSymbol());

                    validCord = true;
                    if (currentPlayer == pX) {
                        currentPlayer = p0;
                    } else {
                        currentPlayer = pX;
                    }
                    // System.out.println(board);

                } else {
                    System.out.println("Introduceti alte coordonate: ");
                    coord = currentPlayer.getCord();

                }

            }

        }

        if (board.getWinner()==Symbol.SYMBOL_EMPTY)
         System.out.println("Este remiza");
        else
            System.out.println("Castigatorul este: "+board.getWinner());
        System.out.println(board);
    }


}
