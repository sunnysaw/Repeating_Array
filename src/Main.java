import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start,sizeOfArray,counting = 0;
        System.out.println("Enter the size of array : ");
        sizeOfArray = input.nextInt();
        System.out.println("Enter the element inside array :");
        int[] array = new int[sizeOfArray];
        for (start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        int n = array.length;
        System.out.println("Printing the result :");
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n ; j++) {
                if (array[i] == array[j]) {
                    counting++;
                }
            }
        }
        if (counting > 0){
            System.out.println(counting);
        }else
            System.out.println(-1);
    }
}