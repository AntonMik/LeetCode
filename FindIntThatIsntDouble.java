package Interview_quest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FindIntThatIsntDouble {
	
	public static void main(String[] args) {
		
		int [] array = new int[] {2,1, 3, 4,1, 2, 3, 4, 4, 2, 5, 5,7, 7, 6, 6};
		
		int n = array.length;
		
		System.out.println(NotRepeated(array, n));
		
	}
	
//	
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public static int NotRepeated (int ar[], int n) {
//		
//		LinkedList link = new LinkedList();
//		ArrayList arlist = new ArrayList();
//		int answer = 0;
//		
//		for (int i = 0; i < n; i++) {
//			if(link.size() >= 1) {
//				for (int j = 0; j < link.size() ; j++) {	
//					if ((((LinkedList) link.get(j)).get(1).equals(ar[i]))) {
//						
//						((LinkedList) link.get(j)).set(1, (int) link.get(j)+1);
//					}
//					else {
//					arlist.add(ar[i]);
//					arlist.add(1);
//					link.add(arlist);
//					arlist = null;
//					
//					}
//				}
//			}
//			
//			else {
//				arlist.add(ar[i]);
//				arlist.add(1);
//				link.add(arlist);
//				arlist = null;
//			}
//		}
//		
//		for (int i = 0; i < link.size(); i++) {
//			
//			if ((((LinkedList) link.get(i)).get(1)).equals(1)){
//				answer = (int)((LinkedList) link.get(i)).get(0);
//			}
//			
//			
//		}
//		
//		
//		
//		
//		
//		return answer;
//	}
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static int NotRepeated (int ar[], int n) {

		int answer = -1;
		ArrayList arList = new ArrayList();
			
		System.out.println(Arrays.toString(ar));
				
		int n1 = 0;
		int n2 = 1;
		
		for (int i = 0; i < n; i++) {
			
			n1 = i;
			n2 = i +1;
				
			if (i == ar.length && (ar[i] != ar[i-1]))
				answer = ar[i];
				
			else if (ar[n1] == ar[n2])
				i++;
			
			else if (ar[0] != ar[1])
				answer = ar[0];
			
			else {
				if (ar[n1-1] == ar[n1]) {
					if (ar[n2] == ar[n2+1])
						i++;
					else
						answer = ar[n2];
				}
				else
					answer = ar[n1];
				}
					
			}
			
			
		
	
		
		
		
		
		
		
		
		return answer;
		
		
	}
	
	
}




