package dynamic_beat_3;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DynamicBeat extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private	Image	screenImage;
	private	Graphics	screenGrapics;
	
	private	Image	introBackground;

	public DynamicBeat() {
		setTitle("Danamic Beat kiup");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();
		
		Music introMusic = new Music("introMusic.mp3", true);
		introMusic.start();
	}
	
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGrapics = screenImage.getGraphics();
		screenDraw(screenGrapics);
		g.drawImage(screenImage, 0,  0,  null);
	}

	private void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0,  0,  null);
		this.repaint();
		
	}
}
