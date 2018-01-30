
/**
 * Write a description of class Sort here.
 * 3 methods to sort an array.
 *
 * @author KongYang
 * @version 1.15.18
 */
public class Sort
{
    int[] array = {5,6,7,2,1,3,3,8,4};
    boolean check = false;

    public Sort(){//Runs everything.
        while(check == false){
            //bubbleSort();
            //insertSort();
            selectSort();
            if (check()){
                check = true;
            }
        }
    }

    public boolean check(){
        check = true;
        for (int i = 0; i < array.length-1; i++){
            if ( array[i] > array[i+1]){
                check = false;
            }
        }
        return check;
    }

    public void bubbleSort(){
        for (int i = 0; i < array.length-1; i++){
            if(array[i] > array[i+1]){
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
    }

    public  void insertSort(){
        for (int i = array.length-1; i >0 ; i--){
            for(int index = i-1; index >= 0; index--){
                if (array[index] > array[i]){
                    int temp = array[index];
                    array[index] = array[i];
                    array[i] = temp;
                }
            }

        }
    }

    public  void selectSort(){
        for (int i = array.length-1; i>=0; i --){
            for( int index = ; index < array.length-1; index++){
                int max = array[i];
            }
        }
    }
}

