package netflix;

import javax.swing.JOptionPane;

public class I_Dont_Feel_So_Good {
public static void main(String [] args) {
	Movie a = new Movie("Big Oof", 4);
	Movie b = new Movie("Phat Oof", 4);
	Movie c = new Movie("XL Oof", 2);
	Movie d = new Movie("Furious Oof", 4);
	Movie e = new Movie("Supreme 00f", 5);
a.getTicketPrice();
b.getTitle();
c.getRating();
NetflixQueue s = new NetflixQueue();
s.addMovie(a); s.addMovie(b); s.addMovie(c); s.addMovie(d); s.addMovie(e);
s.printMovies();
JOptionPane.showMessageDialog(null, "The best movie is: " + s.getBestMovie());
s.sortMoviesByRating();
JOptionPane.showMessageDialog(null, "The second best movie is: " + s.getMovie(2));
}
}
