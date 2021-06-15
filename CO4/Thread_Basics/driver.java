package Thread_Basics;

public class driver {
    public static void main(String[] args) {
        sub_thread obj = new sub_thread();
        obj.start();
        System.out.println("Main Application Started");
        for(int i=0;i<3;i++){
            System.out.println("main thread");
        }
        System.out.println("Main Application Stopped");
    }
}
