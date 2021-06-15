package Thread_Basics;

public class sub_thread extends Thread{
    @Override
    public void run(){
        System.out.println("Sub Application Started");
        for(int i=0;i<5;i++){
            System.out.println("sub thread");
        }
        System.out.println("Sub Application Stopped");
    }
}
