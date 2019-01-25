package MyProject.ObserverPattern;

public class ApplicationMain {

	 public static void main(String[] args) {
	      Movie movie = new Movie();

	      new Observer1(movie);
	      new Observer2(movie);
	      new Observer3(movie);

	      System.out.println("First state change: 10");	
	      movie.setState(10);
	      System.out.println("Second state change: 20");	
	      movie.setState(20);
	      System.out.println("Third state change: 30");	
	      movie.setState(30);
	   }
}
