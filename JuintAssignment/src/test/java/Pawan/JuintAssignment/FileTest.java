package Pawan.JuintAssignment;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FileTest {
	
	public File f;
	
	
	
Student studentRecord;
	
	@Before
	@Test
	public void checkIfTheStringOutputIsCorrect() throws IOException {
		System.out.println("Before Test");
		File f=new File();
		List<Student> stuList = new ArrayList<>();
		List<Subject> subList = new ArrayList<>();
		List<Rank> rList = new ArrayList<>();
		stuList.add(new Student());
		stuList.get(0).setName("AAA");
		stuList.get(0).setCode(120);
		stuList.get(0).setDOB("21-06-1997");
		subList.add(new Subject());
		subList.get(0).setSubject("AAA");
		subList.get(0).setCode(120);
		subList.get(0).setMark(45);
		
		
		try {
			rList=f.calc(stuList, subList);
			assertEquals("AAA", rList.get(0).getNAME());
		} catch (NumberFormatException e) {
		
			e.printStackTrace();
		}
	}
	
	@Before
	@Test
	public void checkTopper() {
	System.out.println(" Test");
	File f=new File();
	List<Student> stuList1 = new ArrayList<>();
	List<Subject> subList1 = new ArrayList<>();
	List<Rank> rList1 = new ArrayList<>();
	stuList1.add(new Student());
	stuList1.get(0).setName("AAA");
	stuList1.get(0).setCode(120);
	stuList1.get(0).setDOB("21-06-1997");
	stuList1.add(new Student());
	stuList1.get(0).setName("BBB");
	stuList1.get(0).setCode(121);
	stuList1.get(0).setDOB("21-06-1998");
	subList1.add(new Subject());
	subList1.get(0).setSubject("jee");
	subList1.get(0).setCode(120);
	subList1.get(0).setMark(45);
	subList1.add(new Subject());
	subList1.get(0).setSubject("jee");
	subList1.get(0).setCode(121);
	subList1.get(0).setMark(57);

	try {
		rList1=f.calc(stuList1, subList1);
		assertEquals("BBB", rList1.get(0).getNAME());
	} catch (NumberFormatException e) {
	
		e.printStackTrace();
	}}
	@Before
	@Test
	public void checkTopperWhenMarksAreSame() {
	System.out.println("Test");
	File f=new File();
	List<Student> stuList2 = new ArrayList<>();
	List<Subject> subList2 = new ArrayList<>();
	List<Rank> rList2 = new ArrayList<>();
	stuList2.add(new Student());
	stuList2.get(0).setName("AAA");
	stuList2.get(0).setCode(120);
	stuList2.get(0).setDOB("21-06-1997");
	stuList2.add(new Student());
	stuList2.get(0).setName("BBB");
	stuList2.get(0).setCode(121);
	stuList2.get(0).setDOB("21-06-1998");
	subList2.add(new Subject());
	subList2.get(0).setSubject("jee");
	subList2.get(0).setCode(120);
	subList2.get(0).setMark(57);
	subList2.add(new Subject());
	subList2.get(0).setSubject("jee");
	subList2.get(0).setCode(121);
	subList2.get(0).setMark(57);

	try {
		rList2=f.calc(stuList2, subList2);
		assertEquals("BBB", rList2.get(0).getNAME());
	} catch (NumberFormatException e) {
	
		e.printStackTrace();
	}}	


}




