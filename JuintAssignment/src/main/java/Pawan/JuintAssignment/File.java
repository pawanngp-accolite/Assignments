package Pawan.JuintAssignment;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class File {

	public static List<Student> student = new ArrayList<Student>();
	public static List<Subject> subject = new ArrayList<Subject>();
	static int intArray[] = new int[20];

	public static List<Student> usingBufferedReaderStudent() throws IOException {
		try (BufferedReader in = new BufferedReader(
				new FileReader("C:\\\\Users\\\\pawan.ngp\\\\Desktop\\\\marks.csv"))) {
			String str;

			while ((str = in.readLine()) != null) {
				System.out.println(str);
				List<String> list = Arrays.asList(str.split(","));
				Student s = new Student();
				s.setCode(Integer.parseInt(list.get(0)));

				s.setName(list.get(1));
				s.setDOB(list.get(2));
				student.add(s);
			}
			for (Student s : student) {
				System.out.println(s.getCode() + s.getDOB() + s.getName());
			}

		} catch (IOException e) {
			System.out.println("File Read Error");
		}
		return student;
	}


	public static List<Subject> usingBufferedReaderSubject() throws IOException {
		try (BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\pawan.ngp\\Desktop\\marks.txt"))) {
			String str;

			while ((str = in.readLine()) != null) {
				System.out.println(str);
				List<String> list = Arrays.asList(str.split(","));
				Subject s = new Subject();
				s.setCode(Integer.parseInt(list.get(0)));
				s.setSubject(list.get(1));
				s.setMark(Integer.parseInt(list.get(2)));
				subject.add(s);
			}
			for (Subject s : subject) {
				System.out.println(s.getCode() + s.getSubject() + s.getMark());
			}
			for (Subject s : subject) {
				int i = s.getCode();
				System.out.println(i);
				System.out.println(s.getMark());
			}
			
			
		} catch (IOException e) {
			System.out.println("File Read Error");
		}
		return subject;
	}
	
	public List<Rank> calc(List<Student> a1,List<Subject> d1){
			List<Rank> rank = new ArrayList<Rank>();
			for (Rank r : rank) {
				r.setTOTAL(0);
			}
			Rank c[] = new Rank[d1.size()];
			for (int i = 0; i < d1.size(); i++) {
				c[i] = new Rank();
				c[i].setTOTAL(0);
				c[i].setRANK(1);
			}
			int j = 0;
			for (Subject a : d1) {
				c[j].setTOTAL(a.getMark());
				c[j].setID(a.getCode());

				j++;

			}
			j = 0;
			for (Student a : a1) {
				c[j].setNAME(a.getName());
				c[j].setDOB(a.getDOB());
				j++;
			}
			for (int i = 0; i < c.length; i++) {
				System.out.println(c[i].getTOTAL() + " " + c[i].getDOB());
			}
			int i;
			for (i = 1, j = 0; i <= a1.size(); i++, j++) {
				rank.add(c[j]);
			}
			System.out.println(rank.size());
			

			Collections.sort(rank, new MySalaryComp());
			int n = 0;
			float q=0;
			float max=rank.get(0).getTOTAL();
			for (Rank r1 : rank) {
				q=((float)(r1.getTOTAL()/max))*100;
			
				
				r1.setper(q);
				
				
			}

			for (Rank r1 : rank) {
				

				r1.setRANK(r1.getRANK() + n);

				System.out.println(
						r1.getID() + " " + r1.getTOTAL() + " " + r1.getNAME() + " " + r1.getDOB() + " " + r1.getRANK()+" "+r1.getper());
				n++;
			
			}
			List<String> lines =new  ArrayList<>();
			for(Rank r1:rank)
			{
				lines.add(r1.getNAME()+" "+r1.getRANK()+" "+r1.getper());
			}
			Path file = Paths.get("C:\\Users\\pawan.ngp\\Desktop\\output.txt");
			try {
				Files.write(file, lines, Charset.forName("UTF-8"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			return rank;
			
			
			

		}
	

	

	public static void main(String[] args) throws IOException {
		File f = new File();
	 List<Student> a1 = new ArrayList<Student>();
		List<Subject> d1 = new ArrayList<Subject>();
		a1=f.usingBufferedReaderStudent();
		d1=f.usingBufferedReaderSubject();
		f.calc(a1,d1);
	
	}
}
