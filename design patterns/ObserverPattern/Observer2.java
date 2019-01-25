package MyProject.ObserverPattern;

public class Observer2 extends Observer{
	 public Observer2(Movie movie){
	      this.movie = movie;
	      this.movie.attach(this);
	   }

	   @Override
	   public void update() {
		   System.out.println( "Observer2: " +movie.getState()  );  
	   }

}
