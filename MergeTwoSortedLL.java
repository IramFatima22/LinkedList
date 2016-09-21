
public class MergeTwoSortedLL {
	static Node curr;
	public static void main(String[] args) {
		Node node1=new Node(1);
		node1.next=new Node(4);
		node1.next.next=new Node(8);
		Node node2=new Node(5);
		node2.next=new Node(7);
		node2.next.next=new Node(9);
		Node node=merge1(node1,node2);
		while(node!=null){
			System.out.print(node.data+" ");
			node=node.next;
		}
	}
	private static Node merge1(Node node1, Node node2) {
		Node temp=new Node(1);
		Node curr=temp;
		while(node1!=null && node2!=null){
			if(node1.data<node2.data){
				curr.next=node1;
				node1=node1.next;
			}
			else{
				curr.next=node2;
				node2=node2.next;
			}
			curr=curr.next;
		}
		if(node1!=null)
			curr.next=node1;
		if(node2!=null)
			curr.next=node2;
		return temp.next;
	}

}
