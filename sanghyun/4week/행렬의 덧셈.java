import java.util.*;

public class Row {
    public static void main(String[] args) {
        int[][] arr1= {{1,2}, {2,3}};
        int[][] arr2= {{3,4}, {5,6}};


        
        List<int[]> tempList = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            int[] tempArray = new int[arr1[i].length];
            for (int ii = 0; ii < arr1[i].length; ii++) {
                tempArray[ii] = arr1[i][ii] + arr2[i][ii];
            }
            tempList.add(tempArray);
        }

        int[][] answer = tempList.toArray(new int[0][]);

    }
}