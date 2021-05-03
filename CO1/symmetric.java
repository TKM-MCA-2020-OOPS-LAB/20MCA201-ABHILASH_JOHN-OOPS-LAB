import java.util.Scanner;
public class symmetric {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number of rows of the Matrix");
int row = sc.nextInt();
System.out.println("Enter the Number of Columns of the Matrix");
int col = sc.nextInt();
int[][] matrix = new int[row][col];
int count=0,i,j;
for(i=1;i<=row;i++){
    for(j=1;j<=col;j++){
        System.out.println("Enter the Element at M("+i+","+j+")");
       matrix[i][j] = sc.nextInt();
       if(matrix[i][j]==matrix[j][i]){
           count++;
       }
    }
}
if(count==row*col){
System.out.println("Matrix is Symmetric");
}
}
}
