public class SinglyLinkedNode<T>{
    //instance variables:
    T data;
    SinglyLinkedNode next;

    //constructors
    public SinglyLinkedNode(){
        this.data=null;
        this.next=null;
    }

    public SinglyLinkedNode(T dataGiven){
        this.data=dataGiven;
        this.next=null;
    }

    public SinglyLinkedNode getNext(){
        return this.next;
    }

    public void setNext(SinglyLinkedNode n){
        this.next=n;
    }

    public void setData(T data){
        this.data=data;
    }

    public T getData(){
        return this.data;
    }
}