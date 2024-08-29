import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;

public class InsSortInt {
  public static void main(String[] args) {
    int temp;
    ArrayList<String> strnums = new ArrayList<String>();    
    try {
      File myObj = new File("randInts.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        strnums.add(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    int[] nums = new int[strnums.size()];
    for(int i = 0; i < strnums.size(); i++){
        nums[i] = Integer.parseInt(strnums.get(i));
    }
    for(int i = 1; i < nums.length; i++){
        int j = i;
        while(j >=1 && nums[j-1] > nums[j]){
            temp = nums[j-1];
            nums[j-1] = nums[j];
            nums[j] = temp;
            j--;
        }
    }
    for(int i = 0; i < nums.length; i++){
         System.out.println(nums[i]);
    }
  }
}

