package linkedlist;

public class singlyLinked {

	    private singlynode head;
	    private int size;

	    public void addToFront(Employee employee) {
	        singlynode node = new singlynode(employee);
	        node.setNext(head);
	        head = node;
	        size++;
	    }

	    public singlynode removeFromFront() {
	        if (isEmpty()) {
	            return null;
	        }

	        singlynode removedNode = head;
	        head = head.getNext();
	        size--;
	        removedNode.setNext(null);
	        return removedNode;
	    }

	    public int getSize() {
	        return size;
	    }

	    public boolean isEmpty() {
	        return head == null;
	    }

	    public void printList() {
	    	singlynode current = head;
	        System.out.print("HEAD -> ");
	        while (current != null) {
	            System.out.print(current);
	            System.out.print(" -> ");
	            current = current.getNext();
	        }
	        System.out.println("null");
	    

	}

}
