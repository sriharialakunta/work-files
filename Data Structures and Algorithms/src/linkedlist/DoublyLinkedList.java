package linkedlist;

public class DoublyLinkedList {
	    private DoublyNode head;
	    private DoublyNode tail;
	    private int size;

	    public void addToFront(Employee employee) {
	    	DoublyNode node = new DoublyNode(employee);

	        if (head == null) {
	            tail = node;
	        }
	        else {
	            head.setPrevious(node);
	            node.setNext(head);
	        }

	        head = node;
	        size++;
	    }

	    public void addToEnd(Employee employee) {
	    	DoublyNode node = new DoublyNode(employee);
	        if (tail == null) {
	            head = node;
	        }
	        else {
	            tail.setNext(node);
	            node.setPrevious(tail);
	        }

	        tail = node;
	        size++;
	    }

	    public DoublyNode removeFromFront() {
	        if (isEmpty()) {
	            return null;
	        }

	        DoublyNode removedNode = head;

	        if (head.getNext() == null) {
	            tail = null;
	        }
	        else {
	            head.getNext().setPrevious(null);
	        }

	        head = head.getNext();
	        size--;
	        removedNode.setNext(null);
	        return removedNode;
	    }

	    public DoublyNode removeFromEnd() {
	        if (isEmpty()) {
	            return null;
	        }

	        DoublyNode removedNode = tail;

	        if (tail.getPrevious() == null) {
	            head = null;
	        }
	        else {
	            tail.getPrevious().setNext(null);
	        }

	        tail = tail.getPrevious();
	        size--;
	        removedNode.setPrevious(null);
	        return removedNode;
	    }

	    public int getSize() {
	        return size;
	    }

	    public boolean isEmpty() {
	        return head == null;
	    }

	    public void printList() {
	    	DoublyNode current = head;
	        System.out.print("HEAD -> ");
	        while (current != null) {
	            System.out.print(current);
	            System.out.print(" <=> ");
	            current = current.getNext();
	        }
	        System.out.println("null");
	    }


	}


