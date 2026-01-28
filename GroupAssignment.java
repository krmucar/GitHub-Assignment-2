import java.util.Scanner;

public class GroupAssignment {
    public static void getMin(int[] arr){
        int minVal = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] < minVal){
                minVal= arr[i];
            }
        }
        System.out.println("Min value is: " + minVal);
    }

    public static void getMax(int[] arr){
        int maxVal = 0;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] > maxVal){
                maxVal= arr[i];
            }
        }
        System.out.println("Max value is: " + maxVal);
    }
        
    public static void findAvrgDiff(int[] arr){

        int total = 0;
        for(int i=0; i<arr.length; i++){
            total = arr[i] + total;
        }
        
        int avrg = total/arr.length;
        int[] newArr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            newArr[i] = arr[i] - avrg;
            
        }
        System.out.print("{");
        int count = 0;
         for(int i=0; i<newArr.length-1; i++){
            count++;
            System.out.print(newArr[i] + "," + " ");
        }
        System.out.print(arr[count]);
        System.out.print("}");
    }

    public static int sumOfOddNumberedIndexes(int[] arr1)
    {
        int sum = 0;
        
        for(int i = 0;i < arr1.length - 1;i = i + 2)
        {
            sum += arr1[i];
        }
        
        return sum;
    }

    public static int sumOfEvenNumberedNumbers(int[] arr1)
    {
        int sum = 0;
        for(int k = 0; k < arr1.length - 1;k++)
        {
            sum += arr1[k];
        }
        return sum - sumOfOddNumberedIndexes(arr1);
    }

    public static Array[] createArray()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = scan.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i<size; i++)
        {
            numbers[i] = (int)(Math.random()*100);
        }
        return numbers;
    }
}
