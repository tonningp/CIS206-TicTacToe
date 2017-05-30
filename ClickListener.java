import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClickListener implements ActionListener {
    
    GameButton button;
    GameState gamestate;

    public ClickListener(GameState gamestate,GameButton button) {
        this.button = button;
        this.gamestate = gamestate;
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Player is:" +gamestate.getPlayer());
        System.out.println("Button is:" +button.getSquareId());
        this.button.setText(gamestate.getPlayer());

        //You will neeed to change to the next player
        // it is suggested that the logic for this
        // happens in the GameState object that was
        // injected into this ClickListener object
        //
        // You will also need to check the winner, this is the
        // place that you should check for the winner as well.
    }
}
