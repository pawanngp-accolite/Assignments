package MyProject.Adapter;

public class FormatAdapter implements RoomTemperatureController {
	 private TempPackage temp;
	 public FormatAdapter(TempPackage t) {
	    temp = m;
	 }
	 public void play(String h2o) {
	   System.out.print("Using Adapter --> ");
	   temp.converth2o(h2o);
	 }
	}