// Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer) 
// and static nested class RAM (memory, manufacturer). Create an object of CPU and print 
// information of Processor and RAM.
public class cpu{
    int price;
    static class processor{
        int cores;
        String producer;
        processor(int noC, String manu){
            cores=noC;
            producer=manu;
        }
        void display(){
        System.out.println("\nProcessor info");
        System.out.println("No. of Cores = "+cores);
        System.out.println("Manufacturer = "+producer+"\n");
    }
    }
    class ram{
        int mem;
        String manuf;
        ram(int memory,String producer ){
            mem=memory;
            manuf=producer;
        }
        void display(){
        System.out.println("\nRAM info");
        System.out.println("Memory = "+mem);
        System.out.println("Manufacturer = "+manuf+"\n");
    }}
    public static void main(String[] args) {
         cpu.processor obj1= new cpu.processor(8,"Intel");
         cpu obj2 = new cpu();
         cpu.ram obj3 = obj2.new ram(8,"Samsung");
         obj1.display();
         obj3.display();

    }
}