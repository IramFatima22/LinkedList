
public class ReverseInGroups {

	public static void main(String[] args) {
		Node node=new Node(1);
		node.next=new Node(2);
		node.next.next=new Node(3);
		node.next.next.next=new Node(4);
		node.next.next.next.next=new Node(5);
		node.next.next.next.next.next=new Node(6);
		node.next.next.next.next.next.next=new Node(7);
		node.next.next.next.next.next.next.next=new Node(8);
		int k=3;
		Node res=method1(node,k);
		Node curr=res;
		while(curr!=null){
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}

	private static Node method1(Node node, int k) {
		int i=0;
		Node head=node;
		Node prev=null;
		Node next=null;
		while(node!=null && i<k){
			next=node.next;
			node.next=prev;
			prev=node;
			node=next;
			i++;
		}
		if(node!=null)
			head.next=method1(next, k);
		return prev;
		
	}

}
