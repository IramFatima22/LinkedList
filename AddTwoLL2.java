class Sum{
	Node node;
	int carry;
	public Sum(){
		node=null;
		carry=0;
	}
}
public class AddTwoLL2 {
	public static void main(String[] args) {
		Node node1=new Node(5);
		node1.next=new Node(6);
		node1.next.next=new Node(3);
		Node node2=new Node(8);
		node2.next=new Node(4);
		node2.next.next=new Node(2);
		Sum res=add(node1,node2);
		Node head=null;
		if(res.carry!=0){
			head=new Node(res.carry);
			head.next=res.node;
		}
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	private static Sum add(Node node1, Node node2) {
		if(node1==null && node2==null){
			return new Sum();
		}
		Sum s1=add(node1.next,node2.next);
		int sum=node1.data+node2.data+s1.carry;
		int carry=sum/10;
		sum=sum%10;
		Node head=new Node(sum);
		head.next=s1.node;
		s1.node=head;
		s1.carry=carry;
		return s1;
	}

}
