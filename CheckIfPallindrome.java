import java.util.Stack;

public class CheckIfPallindrome {

	public static void main(String[] args) {
		Node node=new Node(1);
		node.next=new Node(2);
		node.next.next=new Node(3);
		node.next.next.next=new Node(3);
		node.next.next.next.next=new Node(2);
		node.next.next.next.next.next=new Node(1);
		System.out.println(method1(node));
	}

	private static boolean method1(Node node) {
		Stack<Integer> s=new Stack<Integer>();
		Node slow=node,fast=node;
		while(fast!=null && fast.next!=null){
			s.add(slow.data);
			slow=slow.next;	
			fast=fast.next.next;
		}
		if(fast!=null){
			slow=slow.next;
		}
		while(slow!=null){
			if(slow.data!=s.pop()){
				return false;
			}
			slow=slow.next;
		}
		return true;
	}

}
