public class LectureDemoCustomQueueProgram {
    public static void main(String[] args){
        CustomQueue<Integer> myQueue=new CustomQueue<Integer>();
        System.out.println(myQueue.isEmpty());

        int toAdd;
        toAdd=10;

        myQueue.add(toAdd);
        System.out.println(myQueue.isEmpty());

       
        toAdd=11;

        myQueue.add(toAdd);
        System.out.println(myQueue.isEmpty());

        toAdd=12;

        myQueue.add(toAdd);
        System.out.println(myQueue.isEmpty());

        myQueue.add(55);
        System.out.println(myQueue.isEmpty());

        System.out.print("myQueue: ");
        System.out.println(myQueue);

        System.out.println("\nEnhanced For: ");
        for(Integer element: myQueue){
            System.out.println(element);
        }

       
    }

   
}
