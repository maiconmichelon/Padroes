package templateApplet;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet{

	private String message;

	@Override
	public void init() {
		message = ("Hello world");
		repaint();
	}
	
	@Override
	public void start() {
		message = "stating";
		repaint();
	}
	
	@Override
	public void stop() {
		message = "stop";
		repaint();
	}
	
	@Override
	public void destroy() {
	}

	@Override
	public void paint(Graphics g) {
		g.drawString(message, 5, 15);
	}
	
}
