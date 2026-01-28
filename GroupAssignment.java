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
        
        
    }
}
