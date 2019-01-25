package MyProject.AbstractFactory;

//ConcreteFactory2
public class WomanAbstractFactory implements AbstractFactory {
	public woman createWoman(){
	    Woman woman = new Woman();
	    return woman;
	  }

}
