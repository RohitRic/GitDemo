package MavenTuts.MavenJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class hashMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <Integer,String> hm = new HashMap <Integer,String>();
		hm.put(4, "Watch");
		hm.put(90, "Dino");
		hm.put(3, "Nemo");
		hm.put(2, "Frozen");
		for(Entry<Integer, String> m : hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		List<String> l = new ArrayList<String>();
		l.add("Anything");
		l.add("That");
		l.add("Looks");
		l.add("Like");
		for(String a:l)
		{
			System.out.println(a);
		}
		
	}

}
