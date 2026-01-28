public class GroupAssignment {
    public static void getMin(int[] arr){
        int minVal = Integer.Max_VALUE;
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


    public static void main(String[] args) {
        int[] arr1 = new int[4];

        arr1[0] = 1;
        arr1[1] = 10;
        arr1[2] = 100;
        arr1[3] = 1000;
        arr1[4] = 10000;

        System.out.println(sumOfOddNumberedIndexes(arr1));        
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
}
