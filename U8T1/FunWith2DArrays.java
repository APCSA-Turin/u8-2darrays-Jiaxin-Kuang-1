public class FunWith2DArrays {
    public static int totalElements(int[][] nestedArray){
        int totalElements = 0;
        for(int[] array : nestedArray){
            totalElements += array.length;
        }
        return totalElements;
    }

    public static void fourCorners(String[][] nestedArray){
        int rows = nestedArray.length - 1;
        int length = nestedArray[0].length - 1;
        System.out.println(nestedArray[0][0]);       
        System.out.println(nestedArray[0][length]);
        System.out.println(nestedArray[rows][0]);
        System.out.println(nestedArray[rows][length]);
    }

    public static void swapFrontAndBackRows(String[][] nestedArray){
        int rows = nestedArray.length - 1;
        String[] tempArray = nestedArray[rows];
        nestedArray[rows] = nestedArray[0];
        nestedArray[0] = tempArray;
    }
}
