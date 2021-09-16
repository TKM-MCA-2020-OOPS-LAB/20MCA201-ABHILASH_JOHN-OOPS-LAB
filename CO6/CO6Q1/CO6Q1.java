package CO6Q1;
import java.io.File;

public class CO6Q1 {


    static void RecursivePrint(File[] arr,int index,int level)
    {

        if(index == arr.length)
            return;

        for (int i = 0; i < level; i++)
            System.out.print("\t");

        if(arr[index].isFile())
            System.out.println(arr[index].getName());

        else if(arr[index].isDirectory())
        {
            System.out.println("[" + arr[index].getName() + "]");

            RecursivePrint(arr[index].listFiles(), 0, level + 1);
        }

        RecursivePrint(arr,++index, level);
    }

    public static void main(String[] args)
    {

        String maindirpath = "/home/rony/Desktop/mca/2NDSEm";

        File maindir = new File(maindirpath);

        if(maindir.exists() && maindir.isDirectory())
        {

            File arr[] = maindir.listFiles();

            System.out.println("-----------------------------------------");
            System.out.println("Files from main directory : " + maindir);
            System.out.println("-------------------------------------------");

            RecursivePrint(arr,0,0);
        }
    }
}