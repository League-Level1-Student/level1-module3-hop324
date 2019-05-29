package cow_timer;

import javax.swing.JOptionPane;

public class CowTimerRunner {
	public static void main(String[] args) throws InterruptedException {
		/* Make a CowTimer, set its time and start it.
		 Use a short delay (seconds) when testing, then try with longer delays */
		String minute = new String();
		minute = JOptionPane.showInputDialog("How many minutes?");
		int minutes = Integer.parseInt(minute);
		CowTimer moo = new CowTimer(minutes);
		moo.setTime(minutes);
		moo.start();
	}
}
