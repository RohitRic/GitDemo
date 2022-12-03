package MavenTuts.MavenJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class countFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String  str= "yado ki barat nikli hai aaj dill ke dware";
		HashMap<Character,Integer> countMap = new HashMap<Character,Integer>();
		//System.out.println(freq.length);
		int i;
		char[] strArray =str.toCharArray();
		
		for(char c: strArray)
		{
			if(countMap.containsKey(c))
			{
				countMap.put(c, countMap.get(c)+1);
			}
			else
			{
				countMap.put(c, 1);
			}
		}
		for(Entry<Character, Integer> e: countMap.entrySet())
		{
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
	}

}
