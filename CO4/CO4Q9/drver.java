package CO4Q9;

import java.util.*;

class driver {


    void sort(int arr[])
    {
        int n = arr.length;
        for(int i =0;i < n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }

    void display(int arr[])
    {
        System.out.println("Sorted Array :");
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args)
    {
        int n,e;
        System.out.println("Enter size of Array :");
        Scanner inp =new Scanner(System.in);
        n = inp.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter element :");
            e = inp.nextInt();
            arr[i]=e;
        }

        driver ob = new driver();
        ob.sort(arr);
        ob.display(arr);

    }

}
