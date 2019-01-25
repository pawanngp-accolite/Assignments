package MyProject.AbstractFactory;

//ConcreteFactory1
public class CarAbstractFactory implements AbstractFactory {
	 
	  public Human createHuman(){
	    Man man = new Man();
	    return man;

}
}
