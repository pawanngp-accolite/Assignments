package Service;

import PersonPackage.Person;


public interface personService {
    public boolean addPerson(Person p);
	
	public boolean deletePerson(int id);
	
	public Person getPerson(int id);
	
	//public Person UpdatePerson(int id,Person p);
	
	
	
	public Person[] getAllPersons();
}