import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
public class TitlePanel extends JPanel{
	private static final long serialVersionUID = 1L;
	private PlayerCharacter pc;
	
	public TitlePanel() {
		//pc = new PlayerCharacter(this ,700, 300, "images/pc_singleFrame.png");
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		pc.draw(g);
	}
}