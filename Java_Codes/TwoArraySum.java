import java.util.Scanner;
public class TwoArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of first array:");
        int An= scanner.nextInt();
        int A[]=new int[An];
        System.out.println("Enter the elements of first array:");
        for(int i=0;i<An;i++){
            A[i]=scanner.nextInt();
        }
        
        System.out.println("Enter the size of second array:");
        int Bn= scanner.nextInt();
        int B[]=new int[Bn];
        System.out.println("Enter the elements of second array:");
        for(int i=0;i<Bn;i++){
            B[i]=scanner.nextInt();
        }
        int rem=0;
        int C[]=new int[Math.max(An,Bn)];
        int i=An-1;
        int j=Bn-1;
        while(i>=0 && j>=0){
            C[i]=(A[i]+B[j]+rem)%10;
            rem=(A[i]+B[j]+rem)/10;
            i--;
            j--;
        }
        while(i>=0){
            C[i]=(A[i]+rem)%10;
            rem=(A[i]+rem)/10;
            i--;
        }
        while(j>=0){
            C[j]=(B[j]+rem)%10;
            rem=(B[j]+rem)/10;
            j--;
        }
        TwoArraySum obj=new TwoArraySum();
        obj.printArray(C);
    }
    public  void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
