import java.util.Iterator;

public class CustomQueue<T> implements Iterable<T>{
    //instace variables
    private SinglyLinkedNode<T> head;
    private SinglyLinkedNode<T> tail;
    private int size;

    //constructor:
    public CustomQueue(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    public SinglyLinkedNode<T> getHead(){
        return this.head;
    }

    public void setHead(SinglyLinkedNode<T> head){
        this.head=head;
    }
    
    public SinglyLinkedNode<T> getTail(){
        return this.tail;
    }

    public void setTail(SinglyLinkedNode<T> head){
        this.tail=head;
    }

    public int getSize(){
        return this.size;
    }

    //instance methods

    public boolean isEmpty(){
        return (this.size==0);
    }

    public void add(T dataGiven){
        SinglyLinkedNode<T> newNode=new SinglyLinkedNode<T>(dataGiven);
        if(this.isEmpty()){
            System.out.println("\nAdding "+dataGiven+" to queue...");
            this.setHead(newNode);
        }
        else{
            System.out.println("\nAdding "+dataGiven+" to queue...");
            this.tail.setNext(newNode);
        }
        this.setTail(newNode);
        this.size++;
    }

    @Override
    public String toString(){
       String result=" ";
       SinglyLinkedNode<T> current=new SinglyLinkedNode<T>();
       current=this.head;
       for(current=this.head; current!=null; current=current.getNext()){
        result=result+" "+current.getData()+"==>";
       }
       return result;
        
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return new CustomQueueIterator(this.head);
    }

    class CustomQueueIterator implements Iterator<T>{

        //instance variable:
        SinglyLinkedNode<T> currentNode;

        //constructor:
        CustomQueueIterator(SinglyLinkedNode<T> startingNodeGiven){
            this.currentNode=startingNodeGiven;
        }


        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return (this.currentNode!=null);
        }

        @Override
        public T next() {
            // TODO Auto-generated method stub
            T currentNodeData=currentNode.getData();
            currentNode=currentNode.getNext();
            return currentNodeData;
        }

    }
}
