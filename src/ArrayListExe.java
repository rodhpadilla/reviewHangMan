import java.util.ArrayList;
import java.util.List;

public class ArrayListExe {
    public static void main(String[] args) {
        // Old way
//        ArrayList<Integer> myNumbers = new ArrayList<>(List.of(10, 23, 44, 59, 62, 81));
//        for (int item = 0; item < myNumbers.size(); item++) {
//            if (myNumbers.get(item) % 2 == 0) {
//                myNumbers.remove(item);
//            }
//        }
//        for (Integer myNumber : myNumbers) {
//            {
//                System.out.println(myNumber);
//            }
//        }

        // Modern approach
        ArrayList<Integer> myNumbers = new ArrayList<>(List.of(10, 23, 44, 59, 62, 81));
        myNumbers.removeIf(number -> number % 2 == 0);
        System.out.println(myNumbers);
    }

}
