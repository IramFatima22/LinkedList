
public class ReverseLL {
	static Node head;
	public static void main(String[] args) {
		Node node=new Node(1);
		node.next=new Node(2);
		node.next.next=new Node(3);
		node.next.next.next=new Node(4);
		node.next.next.next.next=new Node(5);
		method1(node,null);
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	private static void method1(Node node, Node prev) {
		if(node==null){
			head=prev;
			return;
		}
		Node next=node.next;
		node.next=prev;
		method1(next, node);
	}

}
