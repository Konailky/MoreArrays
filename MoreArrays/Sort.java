
/**
 * Write a description of class Sort here.
 * 3 methods to sort an array.
 *
 * @author KongYang
 * @version 1.15.18
 */
public class Sort
{
    int[] array = {5,6,7,2,1,3,8,4};

    public Sort(){//Runs everything and checks to see if the array is sorted or not.

        bubbleSort();
        //insertSort();
        //selectSort();

        boolean check = false;

        while ( check == false){
            for ( int i = 0; i < array.length-1; i++){
                if (array[i] > array[i+1]){
                    check = false;
                }
                i++;
            }
            check = true;
        }
    }

    public  void bubbleSort(){

        for (int i = 0; i < array.length-1; i++){
            if(array[i] > array[i+1]){
                int temp = array[i+1];
                array[i+1] = array[i];
                array[i] = temp;
            }
            i++;
        }
        System.out.print("BubbleSort:");
         System.out.println(" ");
        for(int i : array){//Printing the sorted list array
            System.out.print(i);
        }
    }

    public  void insertSort(){
    }

    public  void selectSort(){
    }
}
