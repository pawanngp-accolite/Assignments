package Pawan.JuintAssignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

class MySalaryComp implements Comparator<Rank>{
	SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
	Date date1;
	Date date2;
    public int compare(Rank e1, Rank e2) {
        if(e1.getTOTAL() < e2.getTOTAL()){
        	
            return 1;
        } 
        else if(e1.getTOTAL() > e2.getTOTAL())
        {
        	
            return -1;
        }
        else 
        {
        	try {
				 date1 = format.parse(e1.getDOB());
			} catch (ParseException e) {
				e.printStackTrace();
			}
        	try {
				 date2 = format.parse(e2.getDOB());
			} catch (ParseException e) {
		
				e.printStackTrace();
			}
        	if(date1.compareTo(date2)>0)
        		return 1;
        	else
        		return -1;
        }
    }
}