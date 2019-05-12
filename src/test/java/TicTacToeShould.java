import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class TicTacToeShould {
    @Test
    public void stopAfterPlayingWithTwoBots(){

        Referee r = new Referee(new Playboard(),
                new BotPlayer("Gandalf"),
                new BotPlayer("Dumbledore"));
        r.start();
        assertTrue (true);
    }

}
