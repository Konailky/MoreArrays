
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
        list = new ArrayList<String>();
        list.add("cat");
        list.add("mouse");
        list.add("frog");
        list.add("dog");
        list.add("dog");
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

    //Postocndition: all words that are exactly (len) letters long have been removed form this WordList, with the order of the remaining words unchanged. 
    public void removeWordsOfLength(int len){
        for(int i = 0; i < ; i++){
            if (  == len){
                list.remove(i);
            }
        }
    }
}
