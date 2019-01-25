package MyProject.AbstractFactory;

public class ApplicationMain {
	 public static void main(String[] args){
		    Passenger passenger = new Passenger();
		    AbstractFactory abstractFactory = null;
		    
		    String myHuman="Man";
		    if(myHuman.equals("Man")){
		    	abstractFactory  = new ManAbstractFactory();
		    } else
		    	if(myHuman.equals("Woman")){
		       abstractFactory  = new WomanAbstractFactory();
		    }
		    passenger.buildHuman(abstractFactory);
		  }

}
