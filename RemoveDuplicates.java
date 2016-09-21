
public class RemoveDuplicates {

	public static void main(String[] args) {
		Node node=new Node(1);
		node.next=new Node(5);
		node.next.next=new Node(5);
		node.next.next.next=new Node(5);
		node.next.next.next.next=new Node(7);
		node.next.next.next.next.next=new Node(8);
		node.next.next.next.next.next.next=new Node(8);
		Node head=method1(node);
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	private static Node method1(Node node) {
		Node head=node,curr=node;
		while(node!=null){
			while(node!=null && node.data==curr.data){
				node=node.next;
			}
			curr.next=node;
			curr=curr.next;
		}
		return head;
	}

}
