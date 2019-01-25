package MyProject.ObserverPattern;

public class Observer1 extends Observer{
	  private Movie movie;

	public Observer1(Movie movie){
	      this.movie = movie;
	      this.movie.attach(this);
	   }

	   @Override
	   public void update() {
	      System.out.println( "Observer1: " +movie.getState() ); 
	   }

}
