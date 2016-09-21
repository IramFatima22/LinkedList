
public class DeleteAlternateNode {

	public static void main(String[] args) {
		Node node=new Node(1);
		node.next=new Node(2);
		node.next.next=new Node(3);
		node.next.next.next=new Node(4);
		node.next.next.next.next=new Node(5);
		Node head=method1(node);
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}

	}

	private static Node method1(Node node) {
		Node head=node;
		while(node!=null && node.next!=null){
			node.next=node.next.next;
			node=node.next;
		}
		return head;
		
	}

}
