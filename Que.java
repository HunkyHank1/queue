/*
Henry Johnson
que: a node class that enters things by last in line, and pulls them out by first in line
11/13/20
11/17/20
 */
public class Que<T> {
    private Node<T> first;
    private Node<T> last;
    private Node<T> ancestorNode;
    private int size;
    public Que(){
        size = 0;
        first = null;
        last = null;
        ancestorNode = new Node<T>();
    }
    public void enqueue(T data){
        //Creates a new node with data
        Node<T> newNode = new Node<T>(data);
        if(first == null){
            this.first = newNode;
        }
        else if (last == null){
            this.last = newNode;
            newNode.setParent(this.first);
        }
        else{
            newNode.setParent(this.last);
            this.last = newNode;
        }
        //adds 1 to size
        size++;
    }
    public T dequeue(){
        //moves to last node
        Node<T> returnable = first;
        Node<T> currNode = last;
        for(int i = size -2; i >0; i--){
            currNode = currNode.getParent();
        }
        first = currNode;
        currNode.setParent(null);
        //removes currnode and saves the datatype
        size--;

        return returnable.getData();
    }
    public Node peek(){
        return first;
    }
    public int size(){
        //returns number of nodes
        return size;
    }
    public boolean isEmpty(){
        //returns if there is nothing in the stack
        return !(size>0);
    }
}
