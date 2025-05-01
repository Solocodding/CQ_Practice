import java.util.Scanner;
public class ConsecutiveHases{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the size of N*N array");
        int n=scanner.nextInt();
        char arr[][]=new char[n][n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scanner.next().charAt(0);
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(arr[i][j] == '#') {
                    count++;
                    if(count > max) max = count;
                } else {
                    count = 0;
                }
            }
        }
        System.out.println("Maximum consecutive # in rows: "+max);
    }
}