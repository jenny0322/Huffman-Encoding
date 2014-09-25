import java.util.HashMap;


public class Test {
	 public static HashMap<String, Integer> breakdown(HashMap<String, Integer> m1) {
	    	HashMap<String, Integer> m2 = new HashMap<String, Integer>();
	       for (String key: m1.keySet()) {
	    	  if (m1.get(key)!= 1){
	    		  m2.put(key, m1.get(key));
	    	}
	    	  else if (m1.get(key) == 1) {
	    		char[] wordReader = key.toCharArray();
	    		   for(int i = 0; i < wordReader.length; i ++) {
	    			if (!(m2.containsKey(wordReader[i]))){
	             	   m2.put(Character.toString(wordReader[i]), 1);
	                }else{
	             	   m2.put(Character.toString(wordReader[i]), m2.get(Character.toString(wordReader[i]))+1);
	                }
	    		}
	    	}
	    }m1 = m2;
	    return m1;
	    }
	public static void main(String[] args) {
		HashMap<String, Integer> maptest = new HashMap<String, Integer>();
		maptest.put("kitten", 5);
		maptest.put("Kim", 1);
		HashMap<String, Integer> maptest2 = breakdown(maptest);
		for (String key: maptest2.keySet()) {
			System.out.println(key);
			System.out.println(maptest2.get(key));
		}
	}
}
