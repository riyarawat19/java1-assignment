public class Q26Queue {
    int f,e,size ;
    int[]queue;
   Q26Queue(int c ){
        f = 0;
        size = c;
        e=-1;
        queue = new int[size];
    }

    void enqueue(int data){
        if(e==size-1){
            System.out.println("Queue is full");
        }
        queue[++e]= data;
    }

   void  dequeue(){
        if(f>e){
            System.out.println("Queue is empty");
            return ;
        }
        for(int i=0;i<e;i++){
            queue[i]=queue[i+1];

        }
        e--;
       
        
    }

    void display(){
        for(int i = f;i<=e;i++){
            System.out.print(queue[i]+"  ");
        }
    }

    public static void main(String[] args) {
         Q26Queue q = new Q26Queue(4);
         q.enqueue(20);
         q.enqueue(90);
         q.display();
        
    }
}