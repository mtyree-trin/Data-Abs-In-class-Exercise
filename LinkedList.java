public class Node {
    public Node next;
    public String item;
    
}

public class LinkedList{
    private int size;
    private Node head;

    public LinkedList(){
        this.size = 0;
        this.head = null;

    }


    public int size(){ 
        return size;
    }
    public boolean find(String val){
        Node node = this.head;
        boolean found = false;

        for (int i = 0; i < size; i++){
            if (node.item.equals(val)){
                found = true;
            }
            node = node.next;
        }
        return found;
    }

    public String get(int index){
        Node node = this.head;
        if (head  == null || index > size -1){
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = 0; i < index; i++){
                node = node.next;
            }
            return node.item;
        }
    }

    public void remove(int index){
        Node curr = this.head;
        Node prev = null;
        if (head  == null || index > size -1){
            throw new IndexOutOfBoundsException();
        } else{
            for (int i = 0; i < index; i++){
                prev = curr;
                curr = curr.next;
            }
            prev.next = curr.next;
            this.size--;
        }
    }

    public void add(String val){
        Node node = new Node();
        node.item = val;

        Node curr = this.head;

        if (this.head == null){
            this.head.next = null;
            this.size = 1;
        }else{
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = node;
            node.next = null;
            this.size++;
        }
    }





    get(int index){
        //look at index and return the value there

    }
    set(int index, String valString)
        //look at index and change val to valString
    add(String val)
        // add a link and the element val
        // is it empty
    insert(int index, String val){
        // add val to specifc index
    }
    remove(int index)
        // remove links that are atached to that index
        
}