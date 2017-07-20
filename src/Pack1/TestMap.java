package Pack1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {
	private static final String S = "Yanjiayin";

	public static void main(String[] args) throws Exception{
		Map<Integer, String>  map=new HashMap<Integer,String>();
		List<String> list=new ArrayList<String>();
		list.add("123");
		list.add("#");
		list.add("Y");
		for(int i = 0;i<list.size();i++){
		
		map.put(i, list.get(i));
		
		 System.out.println(map.get(i));
		}
		System.out.println(list.size());
	}

}
