package map;

import java.util.HashMap;
import java.util.TreeMap;

class PersonalInfo
{
	int id;
	String name;
	String city;
	@Override
	public String toString() {
		return "PersonalInfo [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	public PersonalInfo(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	
	}
public class GeneralExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//HashMap<Integer,PersonalInfo> info=new HashMap();
TreeMap<Integer,PersonalInfo> info=new TreeMap();
info.put(3, new PersonalInfo(11, "veena", "bnt"));
info.put(8, new PersonalInfo(77, "manu", "athani"));
info.put(5, new PersonalInfo(22, "aaru", "belagavi"));
info.put(7, new PersonalInfo(33, "Mahi", "belagavi"));
System.out.println(info);


	}

}
