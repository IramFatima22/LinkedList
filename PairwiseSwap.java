
public class PairwiseSwap {

	public static void main(String[] args) {
		Node node=new Node(1);
		node.next=new Node(2);
		node.next.next=new Node(3);
		node.next.next.next=new Node(4);
		node.next.next.next.next=new Node(5);
		node.next.next.next.next.next=new Node(6);
		node.next.next.next.next.next.next=new Node(7);
		Node res=swap(node);
		traverse(res);
	}
	private static void traverse(Node node) {
		Node temp=node;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}	
	}

	private static Node swap(Node node) {
		Node prev=node;
		Node next=null;
		Node curr=node.next;
		if(curr!=null){
			next=curr.next;
			curr.next=prev;
			if(next!=null){
				Node res=swap(next);
				prev.next=res;
			}
			return curr;
		}
		return prev;	
	}

}
