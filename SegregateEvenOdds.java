
public class SegregateEvenOdds {

	public static void main(String[] args) {
		Node node=new Node(17);
		node.next=new Node(15);
		node.next.next=new Node(8);
		node.next.next.next=new Node(12);
		node.next.next.next.next=new Node(10);
		node.next.next.next.next.next=new Node(5);
		node.next.next.next.next.next.next=new Node(4);
		Node res=method1(node);
		while(res!=null){
			System.out.print(res.data+" ");
			res=res.next;
		}
		
	}

	private static Node method1(Node node) {
		Node curr=node;
		Node tail=getTail(curr);
		Node last=tail;
		Node prev=null;
		Node next=node;
		while(curr!=last){
			next=curr.next;
			if(curr.data%2!=0){
				tail.next=new Node(curr.data);
				tail=tail.next;
				if(prev==null)
					node=curr.next;
				else
					prev.next=curr.next;
				curr=next;
			}
			else{
				prev=curr;
				curr=next;
			}
			
		}
		return node;
	}

	private static Node getTail(Node curr) {
		while(curr.next!=null){
			curr=curr.next;
		}
		return curr;
	}

}
