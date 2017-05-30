import javax.swing.JButton;

public class GameButton extends JButton {
    private int id;

    GameButton(int id) {
        this.id = id;
        this.setText(""+id);
    }

    public int getSquareId() {
        return this.id;
    }
}
