
public class AddTwoLL {

	public static void main(String[] args) {
		Node node1=new Node(5);
		node1.next=new Node(6);
		node1.next.next=new Node(3);
		Node node2=new Node(8);
		node2.next=new Node(4);
		node2.next.next=new Node(2);
		Node res=add(node1,node2,0);
		Node temp=res;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	private static Node add(Node node1, Node node2, int carry) {
		if(node1==null && node2==null && carry==0)
			return null;
		int x1=node1!=null?node1.data:0;
		int x2=node2!=null?node2.data:0;
		int sum=x1+x2+carry;
		carry=sum/10;
		sum=sum%10;
		Node res=new Node(sum);
		Node ret=add(node1!=null?node1.next:null,node2!=null?node2.next:null,carry);
		res.next=ret;
		return res;
	}

}
