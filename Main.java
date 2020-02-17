import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

class Main {

//Google Question
//Given an array = [2,5,1,2,3,5,1,2,4]:
//It should return 2

//Given an array = [2,1,1,2,3,5,1,2,4]:
//It should return 1

//Given an array = [2,3,4,5]:
//It should return undefined

//loop throught the array and each element into an hash table
//which keeps a count of the ocurence of the value.

//while looping if the count is more than 1 than return that value.

public int firstRecurringChar(int[] arrayNumbers){
HashMap<Integer, Integer> countMap = new HashMap<>();
int count = 1;
  for(int i=0; i < arrayNumbers.length; i++){
    if(!countMap.containsKey(arrayNumbers[i])){
      countMap.put(arrayNumbers[i], count);
    } else {
      return arrayNumbers[i];
    }
  }
  return 0;
}
   
  public static void main(String[] args) {
    System.out.println("Hello world!");
    int[] arrayNumbers = {2,5,5,2,3,5,1,2,4};
    Main main = new Main();
    System.out.println(main.firstRecurringChar(arrayNumbers));
  }
}