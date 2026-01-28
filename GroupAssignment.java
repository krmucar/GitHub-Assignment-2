public class GroupAssignment {
    public static int getMax(int[] arr){
        int maxVal = 0;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i]> maxVal){
                maxVal= arr[i];
            }
        }
        return maxVal;
    }

    
    public static void main(String[] args) {
        
    }
}
