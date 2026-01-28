import java.util.Scanner;

public class GroupAssignment {
    public static void main(String[] args) {
        
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
