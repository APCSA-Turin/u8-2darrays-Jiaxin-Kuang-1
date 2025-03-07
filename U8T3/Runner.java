import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        int[][] testArr3 = {{2, 16, 13, 3}, {11, 5, 8, 10}, {7, 9, 12, 6}, {14, 4, 1, 15}};
        int[][] testArr4 = {{1, 23, 16, 4, 21}, {15, 14, 7, 18, 11}, {24, 17, 13, 9, 2}, {20, 8, 19, 12, 6}, {5, 3, 10, 22, 25}};
        
        boolean test3 = Algorithm2DArrays.magicSquare(testArr3);
        boolean test4 = Algorithm2DArrays.magicSquare(testArr4);
        System.out.println(test3);
        System.out.println(test4);
    }
}
