package CO4Q5;

public class mul extends Thread{
    public void run(){
        System.out.println("\n");
        for(int i =0;i<11;i++){
            System.out.println("5*"+i+" = "+5*i);
        }
    }
}
