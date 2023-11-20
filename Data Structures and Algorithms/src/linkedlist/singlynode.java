package linkedlist;

public class singlynode {

	    private Employee employee;
	    private singlynode next;

	    public singlynode(Employee employee) {
	        this.employee = employee;
	    }

	    public Employee getEmployee() {
	        return employee;
	    }

	    public void setEmployee(Employee employee) {
	        this.employee = employee;
	    }

	    public singlynode getNext() {
	        return next;
	    }

	    public void setNext(singlynode next) {
	        this.next = next;
	    }

	    public String toString() {
	        return employee.toString();
	    }
	}
