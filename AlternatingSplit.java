
public class AlternatingSplit {

	public static void main(String[] args) {
		Node node=new Node(1);
		node.next=new Node(0);
		node.next.next=new Node(1);
		node.next.next.next=new Node(0);
		node.next.next.next.next=new Node(1);
		node.next.next.next.next.next=new Node(0);
		method1(node);
	}

	private static void method1(Node node) {
		Node temp1=new Node(1);
		Node temp2=new Node(1);
		Node curr1=temp1,curr2=temp2;
		boolean flag=true;
		while(node!=null){
			if(flag){
				curr1.next=node;
				curr1=curr1.next;
			}
			else{
				curr2.next=node;
				curr2=curr2.next;
			}
			node=node.next;
			flag=!flag;
		}
		curr1.next=null;
		curr2.next=null;
		temp1=temp1.next;
		temp2=temp2.next;
		curr1=temp1;curr2=temp2;
		while(curr1!=null){
			System.out.print(curr1.data+" ");
			curr1=curr1.next;
		}
		System.out.println();
		while(curr2!=null){
			System.out.print(curr2.data+" ");
			curr2=curr2.next;
		}
		
	}

}
