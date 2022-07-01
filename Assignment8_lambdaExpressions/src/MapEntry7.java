import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntry7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<Integer,String> m= new HashMap<>();
        m.put(1, "Amit");
        m.put(2, "Venkat");
        StringBuilder str=new StringBuilder();
        Set<Map.Entry<Integer,String>> s =m.entrySet();
        for(Map.Entry<Integer,String> str1 : s) {
        	str.append(str1.getValue()+","+str1.getKey()+"\n");
        }
        System.out.println(str);
	}

}
