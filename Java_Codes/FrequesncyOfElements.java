import java.util.Scanner;
import java.util.HashMap;
public class FrequesncyOfElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=scanner.nextInt();    
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }

        int tempArr[];
        int size=0;
        while(true){
            if(map.size()==size) break;
            tempArr=new int[map.size()];
            size=tempArr.length;
            int i=0;
            for(int key:map.keySet()){
                tempArr[i++]=map.get(key)==1?key:map.get(key);
            }
            map.clear();
            for(int a:tempArr){
                map.put(a,map.getOrDefault(a,0)+1);
            }
        }
        tempArr=new int[map.size()];
        int i=0;
        for(int key:map.keySet()){
            tempArr[i++]=map.get(key)==1?key:map.get(key);
        }
        printArray(tempArr);
    }
    public static void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
