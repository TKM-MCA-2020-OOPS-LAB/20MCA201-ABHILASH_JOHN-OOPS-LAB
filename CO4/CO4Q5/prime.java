package CO4Q5;

public class prime extends Thread{
    int num;
    public prime(int n){
        this.num=n;
    }
    public void run(){
        int x, y, flg;
        System.out.println("All the Prime numbers within 1 and " + num + " are:");
        for (x = 1; x <= num; x++) {
            if (x == 1 || x == 0)
                continue;
            flg = 1;
            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }
            if (flg == 1)
                System.out.print("\n prime number ="+x + " ");
        }
    }
}
