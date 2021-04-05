public class SinglyLinkedList {
    
    public Node head;
    public SinglyLinkedList() {
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
    }  
    public void remove() {
        Node runner = this.head;
        while(runner.next != null) {
            if(runner.next == null) {
                runner = null;
            }
            runner = runner.next;
        }
    
    }
    public void printValues() {
        Node runner = this.head;
        while (runner.next !=null) {
            runner = runner.next;
        }
        System.out.println(runner.value);

    }
    
}

