
/**
 * Write a description of class WordList here.
 * Project to practice arrayLists
 *
 * @author KongYang
 * @version 1.22.18
 */
import java.util.ArrayList;
import java.util.List;

public class WordList
{
    private ArrayList<String> myList;// Contains Strings made up of letters    
    
    public WordList(){
        myList = new ArrayList<String>();
        myList.add("cat");
        myList.add("mouse");
        myList.add("frog");
        myList.add("dog");
        myList.add("dog");
    }
    
    //Postcondition: returns the number of words in this WordList that are exactly (len) letters long.
    public int numWordsOfLength(int len){
        int count = 0;
        for (String i : myList){
            if ( i.length() == len){
                count++;
            }
        }
        return count;
    }

    //Postcondition: all words that are exactly (len) letters long have been removed form this WordList, with the order of the remaining words unchanged. 
    public void removeWordsOfLength(int len){
       for (int i = myList.size()-1; i >= 0 ; i--){
           if ( myList.get(i).length() == len){
               myList.remove(i);
            }
           
        }
    }
}
