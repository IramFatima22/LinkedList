
public class QuickSort {

	public static void main(String[] args) {
		Node node=new Node(1);
		node.next=new Node(5);
		node.next.next=new Node(7);
		node.next.next.next=new Node(3);
		node.next.next.next.next=new Node(2);
		Node res=sort(node);
		Node temp=res;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	private static Node sort(Node node) {
		if(node==null || node.next==null)
			return node;
		Node tail=node;
		while(tail.next!=null){
			tail=tail.next;
		}
		Node part=partition(node,tail);
		Node curr=part.next;
		Node next=part.next.next;
		part.next=null;
		Node n1=sort(node);
		Node n2=sort(next);
		merge(n1,curr,n2);
		return n1;
	}
	private static void merge(Node n1, Node curr, Node n2) {
		while(n1.next!=null){
			n1=n1.next;
		}
		n1.next=curr;
		curr.next=n2;
		
	}

	private static Node partition(Node node, Node tail) {
		Node curr=node;
		Node prev=null;
		while(node!=null && node.next!=null){
			if(node.data<tail.data){
				swap(node,curr);
				prev=curr;
				curr=curr.next;
			}
			node=node.next;
		}
		swap(curr,tail);
		return prev;
	}
	private static void swap(Node node, Node curr) {
		int temp=node.data;
		node.data=curr.data;
		curr.data=temp;
	}
}
