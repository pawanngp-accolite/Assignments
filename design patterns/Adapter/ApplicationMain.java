package MyProject.Adapter;

public class ApplicationMain {
	
	public static void main(String[] args) {
	    RoomTempratureController c = new H2OInLiquid();
	    c.convert("h2o.liquid");
	    c = new FormatAdapter(new H2OInSolid());
	    c.convert("h2o.Solid");
	    c = new FormatAdapter(new H2OInGas());
	    c.convert("h20.Gas");
	 }

}
