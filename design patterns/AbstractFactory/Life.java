package MyProject.AbstractFactory;

public class Life {
	 public void buildHuman(AbstractFactory abstractFactory){
		    Human human = abstractFactory.createHuman();
		    human.setId("JH4538");
		  }

}
