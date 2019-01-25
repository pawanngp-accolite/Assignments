package MyProject.ObserverPattern;



public class Observer3 extends Observer{
	 public Observer3(Movie movie){
	      this.movie = movie;
	      this.movie.attach(this);
	   }

	   @Override
	   public void update() {
		   System.out.println( "Observer3: " +movie.getState()  ); 
	   }

}
