import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class testCollection {
	int value=20;

	public static void main(String[] args) {
		
		//map1
		HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("A", 10);
        map1.put("B", 20);
        map1.put("C", 30);
        //map2
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("D", 40);
        map2.put("E", 50);
        map2.put("F", 60);
        
        testCollection t1=new testCollection();
        
        
        //printing method which has found value
        HashMap<String, Integer> printMap = new HashMap<>();
        printMap.putAll(t1.m1(map2,map1));
        
        Set entrySet = printMap.entrySet();
        Iterator it1 = entrySet.iterator();
		
		while(it1.hasNext())
		{
			
			System.out.println(it1.next());
			}
			
			
		}
        

	public HashMap<String,Integer> m1(HashMap<String,Integer> map2,HashMap<String,Integer> map1)
	{
		
		boolean b1=map1.containsValue(value);
		boolean b2=map2.containsValue(value);
		HashMap<String, Integer> foundMap = new HashMap<>();
		if (b1==true)
		{
			foundMap.putAll(map1);
			
		}
		if(b2==true)
		{
			foundMap.putAll(map2);
		}
		return foundMap;
	}
}
		
		