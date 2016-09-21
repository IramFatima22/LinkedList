
public class NthNodeFromEnd {

	public static void main(String[] args) {
		Node node=new Node(1);
		node.next=new Node(2);
		node.next.next=new Node(3);
		node.next.next.next=new Node(4);
		node.next.next.next.next=new Node(5);
		int n=1;
		method1(node,n);
	}

	private static void method1(Node node, int n) {
		int i=1;
		Node start=node;
		while(node!=null && i<n){
			i++;
			node=node.next;
		}
		if(node==null) return;
		while(node.next!=null){
			node=node.next;
			start=start.next;
		}
		System.out.println(start.data);
		
	}

}
