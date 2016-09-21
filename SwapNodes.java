
public class SwapNodes {

	public static void main(String[] args) {
		Node node=new Node(10);
		node.next=new Node(15);
		node.next.next=new Node(12);
		node.next.next.next=new Node(13);
		node.next.next.next.next=new Node(20);
		node.next.next.next.next.next=new Node(14);
		int x=10,y=20;
		node=swap(node,x,y);
		while(node!=null){
			System.out.print(node.data+" ");
			node=node.next;
		}
	}
	private static Node swap(Node node, int x, int y) {
		Node prev1=null,prev2=null;
		Node curr1=node, curr2=node;
		while(curr1!=null && curr1.data!=x){
			prev1=curr1;
			curr1=curr1.next;
		}
		while(curr2!=null && curr2.data!=y){
			prev2=curr2;
			curr2=curr2.next;
		}
		if(curr1==null || curr2==null)
			return node;
		if(prev1==null)
			node=curr2;
		else
			prev1.next=curr2;
		if(prev2==null)
			node=curr1;
		else
			prev2.next=curr1;
		Node temp=curr1.next;
		curr1.next=curr2.next;
		curr2.next=temp;
		return node;	
	}
}

