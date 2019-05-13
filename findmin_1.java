package Lession2;
import java.util.Scanner;

public class findmin_1 {
    public static void main(String[] args)
    {
        //Nhap vao  1 mang va tim min
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;
        int i;
        System.out.println("Nhập số phân tử của mảng");
        size = scanner.nextInt();
        array = new int[size];
        for (i = 0;i<size;i++)
        {
            System.out.println("Phần tử thứ "+(i+1)+" :");
            array[i] = scanner.nextInt();
        }
        System.out.println("Min = "+min(array));
    }
    public static int min(int[] array)
    {
        int min = array[0];
        int i;
        for(i = 0;i<array.length;i++)
        {
            if(min > array[i])
                min = array[i];
        }
        return min;
    }
}
