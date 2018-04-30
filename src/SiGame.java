import java.awt.EventQueue;
import javax.swing.JFrame;

public class SiGame extends JFrame implements Commons {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			SiGame ex = new SiGame();
			ex.setVisible(true);
		});
	}

	private void initUI() {
		add(new Board());
		setTitle("Space Invaders");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(BOARD_WIDTH, BOARD_HEIGHT);
		setLocationRelativeTo(null);
		setResizable(false);
	}

	public SiGame() {
		initUI();
	}

}
