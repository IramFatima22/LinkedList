
public class MergeAlternates {

	public static void main(String[] args) {
		Node node1=new Node(1);
		node1.next=new Node(2);
		node1.next.next=new Node(3);
		Node node2=new Node(4);
		node2.next=new Node(5);
		node2.next.next=new Node(6);
		node2.next.next.next=new Node(7);
		node2.next.next.next.next=new Node(8);
		node2=merge(node1,node2);
		traverse(node1);
		System.out.println();
		traverse(node2);
	}

	private static void traverse(Node node) {
		Node temp=node;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}	
	}
	private static Node merge(Node node1, Node node2) {
		Node curr1=node1;
		Node curr2=node2;
		Node next1=null, next2=null;
		while(curr1!=null && curr2!=null){
			next1=curr1.next;
			next2=curr2;
			Node temp=curr2.next;
			curr1.next=next2;
			next2.next=next1;
			curr1=next1;
			curr2=temp;
		}
		return curr2;
	}

}
