package Interview_quest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring {

	public static void main(String[] args) {
		
		int x;
		System.out.println(lengthOfLongestSubstring(""));
	
	}

	
public static int lengthOfLongestSubstring(String s) {
        
//        ArrayList<String> comp = new ArrayList<String>();
//        int longest =1;
//        int count = 1;
//        
//        if (s.length() == 0)
//            longest = 0;
//        
//        else if (s.length() == 1)
//            longest = 1;
//        
//        else{
//        for (int i = 0; i < s.length(); i++){
//            
//            if (comp.size() != 0){
//                    if (comp.contains(Character.toString(s.charAt(i)))) {
//                    	comp.clear();
//                    	comp.add(Character.toString(s.charAt(i)));
//                    	if (count > longest)
//                    		longest = count;        
//                    	
//                    	count = 1;
//                    	}
//            
//                    else {
//                        comp.add(Character.toString(s.charAt(i)));
//                        count++;
//                    }
//            }
//            else {
//                comp.add(Character.toString(s.charAt(i)));
//            }
//        }
//        }
//        
//        if (count > longest)
//    		longest = count;
//        return longest;
	
	
	int n = s.length(), ans = 0;
    Map<Character, Integer> map = new HashMap<>(); // current index of character
    // try to extend the range [i, j]
    for (int j = 0, i = 0; j < n; j++) {
        if (map.containsKey(s.charAt(j))) {
            i = Math.max(map.get(s.charAt(j)), i);
        }
        ans = Math.max(ans, j - i + 1);
        map.put(s.charAt(j), j + 1);
    }
    return ans;
        
    }
	
	
}
