
public class MergekSortedLists {
//[[2],[],[-1]]
	public static void main(String[] args) {
		ListNode [] list=new ListNode[3];
		list[0]=new ListNode(2);
		list[1]=null;
		list[2]=new ListNode(-1);
		ListNode result=mergeKLists(list);
		while (result!=null) {
			System.out.println(result.val);
			result=result.next;
		}
	}

	public static ListNode mergeKLists(ListNode[] lists) {
		if (lists.length == 0)
			return null;
		if (lists.length < 2) {
			return lists[0];
		}
		int len = lists.length - 1;
		ListNode start = lists[0];
		ListNode end = lists[len];
		for (int i = 1; i < (len-1) / 2; i++) {
			if (i < len - i) {
				start = merge(start, lists[i]);
				end = merge(end, lists[len - i]);

			} else {
				break;
			}
		}

		return merge(end, start);
	}

	public static ListNode merge(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		if (l1.val < l2.val) {
			l1.next = merge(l1.next, l2);
			return l1;
		} else {
			l2.next = merge(l1, l2.next);
			return l2;
		}
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
