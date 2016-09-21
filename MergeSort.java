
public class MergeSort {

	public static void main(String[] args) {
		Node node=new Node(1);
		node.next=new Node(5);
		node.next.next=new Node(7);
		node.next.next.next=new Node(3);
		node.next.next.next.next=new Node(2);
		Node res=split(node);
		Node temp=res;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	private static Node split(Node node) {
		if(node==null || node.next==null)
			return node;
		Node mid=findMid(node);
		Node next=mid.next;
		mid.next=null;
		Node node1=split(node);
		Node node2=split(next);
		Node merged=merge(node1,node2);
		return merged;
	}

	private static Node merge(Node node1, Node node2) {
		if(node1==null) return node2;
		if(node2==null) return node1;
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
		if(node1!=null){
			curr.next=node1;
		}
		if(node2!=null){
			curr.next=node2;
		}
		return temp.next;
	}

	private static Node findMid(Node node) {
		Node fast=node;
		Node prev=null;
		while(fast!=null && fast.next!=null){
			prev=node;
			node=node.next;
			fast=fast.next.next;
		}
		if(fast==null)
			return prev;
		return node;
	}

}
