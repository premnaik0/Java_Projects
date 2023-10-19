//ASSIGNMENT
package OOCAss;
import java.util.Scanner;

class QuickSort
{
  public void quickSort(int[] arr, int first, int last) 
  {
      if (first < last) 
      {
          int pivot = first;
          int i = first;
          int j = last, temp;

          while (i < j) 
          {
              while (arr[i] <= arr[pivot] && i < last) 
              {
                  i++;
              }
              while (arr[j] > arr[pivot]) 
              {
                  j--;
              }
              if (i < j) 
              {
                  temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
              }
          }
          temp = arr[pivot];
          arr[pivot] = arr[j];
          arr[j] = temp;

          quickSort(arr, first, j - 1);
          quickSort(arr, j + 1, last);
      }
  }
  public void display(int count,int[] arr)
  {
  	System.out.println("Array after sorting:");
      for (int i = 0; i < count; i++) 
      {
          System.out.println(arr[i]);
      }	
  }
}
public class Main2 
{
  public static void main(String[] args) 
  {
      Scanner sc = new Scanner(System.in);
      QuickSort q1=new QuickSort();

      System.out.print("Enter the size of the array: ");
      int count = sc.nextInt();

      int[] arr = new int[count];
      System.out.println("Enter " + count + " elements of the array:");
      for (int i = 0; i < count; i++) 
      {
          arr[i] = sc.nextInt();
      }
      q1.quickSort(arr, 0, count - 1);
      q1.display(count, arr);
      sc.close();
  }
}