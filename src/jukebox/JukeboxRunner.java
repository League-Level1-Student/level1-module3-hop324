package jukebox;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class JukeboxRunner implements ActionListener  {
	Song a = new Song("PhineasAndFerb.mp3");
	Song b = new Song("Kero Kero Bonito - Flamingo.mp3");
	public static void main(String[] args) {
		new JukeboxRunner().setup();
		SwingUtilities.invokeLater(new Jukebox());


	}
	void setup() {
		JFrame frame = new JFrame();
		 JPanel panel = new JPanel();
		 JButton button1 = new JButton();
		 JButton button2 = new JButton();

		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.setSize(50, 50);
		panel.setLayout(new GridLayout(5, 5));
		panel.setBackground(Color.cyan);
		button1.setSize(10, 10);
		button1.setBackground(Color.orange);
		button1.setText("Phineas and Ferb");
		button2.setBackground(Color.orange);
		button2.setSize(10, 10);
		button2.setText("Flamingo");
		frame.setSize(100, 100);
		button1.addActionListener(this);
		button2.addActionListener(this);
		frame.pack();
		frame.setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button1 = new JButton();
		this.button1 = button1;
	}
}
