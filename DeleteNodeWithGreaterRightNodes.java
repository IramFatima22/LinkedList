
public class DeleteNodeWithGreaterRightNodes {

	public static void main(String[] args) {
		Node node=new Node(12);
		node.next=new Node(1);
		node.next.next=new Node(10);
		node.next.next.next=new Node(15);
		node.next.next.next.next=new Node(5);
		node.next.next.next.next.next=new Node(6);
		node.next.next.next.next.next.next=new Node(2);
		node.next.next.next.next.next.next.next=new Node(3);
		Node res=method1(node);
		Node temp=res;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	private static Node method1(Node node) {
		Node head=node;
		Node revHead=null;
		revHead=reverse(node,null,revHead);
		Node curr=revHead;
		int max=curr.data;
		Node prev=curr;
		curr=curr.next;
		while(curr!=null){
			if(curr.data>=max){
				max=curr.data;
				prev=curr;
				curr=curr.next;
			}
			else{
				prev.next=curr.next;
				curr=curr.next;
			}
		}
		head=reverse(revHead,null,head);
		return head;
	}

	private static Node reverse(Node node, Node prev, Node revHead) {
		if(node==null){
			revHead=prev;
			return revHead;
		}
		Node next=node.next;
		node.next=prev;
		return reverse(next, node, revHead);
	}

}
