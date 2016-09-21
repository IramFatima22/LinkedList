
public class DetectLoop {

	public static void main(String[] args) {
		Node node=new Node(1);
		Node node1=new Node(2);
		node.next=node1;
		node1.next=new Node(3);
		node1.next.next=new Node(4);
		node1.next.next.next=new Node(5);
		node1.next.next.next.next=node1;
		System.out.println(method1(node));
	}

	private static boolean method1(Node node) {
		Node slow=node;
		Node fast=node;
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
				return true;
		}
		return false;
		
	}

}
