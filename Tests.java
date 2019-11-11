import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Tests {
	private String Name;
	private String date;
	private HashMap<String,Integer> people;
	
	public Tests() {
		Name = null;
		date = null;
		people = new HashMap<String,Integer>();
	}
	
	public Tests(String name, String date) {
		this.Name = name;
		this.date = date;
		people = new HashMap<String,Integer>();
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void addStudent(String name, Integer Grade) {
		people.put(name, Grade);
	}
	public String getGrade(String name) {
		return name + "'s grade is: " + people.get(name);		
	}
	public void printAllStudent() {
		TreeMap<String,Integer> sort = new TreeMap<>(people); 
	        for (Map.Entry<String,Integer> entry : sort.entrySet())  
	            System.out.println(entry.getKey() + ":" + entry.getValue());
	}
}
