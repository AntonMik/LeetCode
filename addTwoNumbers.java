package Interview_quest;


class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
	}
}
public class addTwoNumbers {

		
	
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		addTwoNumbers(l1, l2);
		
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		String temp1 = "";
		String temp2 = "";
		int ans;
		ListNode ret = new ListNode(0);
		
		while (l1 != null) {
			temp1 = temp1 + Integer.toString(l1.val);
			l1 = l1.next;
		}
		
		while (l2 != null) {
			temp2 = temp2 + Integer.toString(l2.val);
			l2 = l2.next;
		}
		
		ans = Integer.parseInt(temp1) + Integer.parseInt(temp2);
		
		System.out.println(ans);
		
		ret.val = Integer.parseInt(Integer.toString(ans).substring(2, 3));
		ret.next = new ListNode(Integer.parseInt(Integer.toString(ans).substring(1, 2)));
		ret.next.next = new ListNode(Integer.parseInt(Integer.toString(ans).substring(0, 1)));
		
		return ret;	
	}
	
}
