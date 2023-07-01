
public class SLL {
	
	public Node head;
	
	public SLL() {
		this.head = null;
	}
	
	public void add(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
		} else {
			Node runner = head;
			while(runner.next != null) {
				runner = runner.next;
			}
			runner.next = newNode;
		}
		System.out.println("Added " + value);
	}
	
	public void removeFront() {
		if(head != null) {
			Node runner = head;
			if(runner.next != null) {
				head = runner.next;
			}
		}
	}

}
