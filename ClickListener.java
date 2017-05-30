import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClickListener implements ActionListener {
    
    JButton button;
    GameState gamestate;

    public ClickListener(GameState gamestate,JButton button) {
        this.button = button;
        this.gamestate = gamestate;
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Player is:" +gamestate.getPlayer());
        this.button.setText(gamestate.getPlayer());
    }
}
