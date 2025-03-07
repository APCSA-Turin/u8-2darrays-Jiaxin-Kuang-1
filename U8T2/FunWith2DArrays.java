package U8T2;

public class FunWith2DArrays {
    public static double average(int[][] nums){
        double total = 0;
        for(int[] numArray : nums){
            for(int num : numArray){
                total += num;
            }
        }
        return total/(nums.length * nums[0].length);
    }

    public static int edgeSum(int[][] nums){
        int total = 0;
        int rowLength = nums[0].length - 1;
        int columnLength = nums.length - 1;
        for(int i = 0; i < rowLength + 1; i ++){
            total += nums[0][i] + nums[columnLength][i];
        }
        for(int i = 1; i < columnLength; i ++){
            total += nums[i][0] + nums[i][rowLength];
        }
        return total;
    }

    public static int[] indexFound(String[][] words, String target){
        int[] index = {-1, -1};
        int nestedLength = words.length; 
        int length = words[0].length;
        for(int i = 0; i < length; i ++){
            for(int j = 0; j < nestedLength; j ++){
                if(words[j][i].equals(target)){
                    index[0] = j; 
                    index[1] = i;
                    return index;
                }
            }
        }
        return index;
    }

    public static int[][] split(int[][] nums, int firstRow, int secondRow){
        if(firstRow >= nums.length || secondRow >= nums[0].length){
            return new int[0][0];
        }
        int[][] newNums = new int[firstRow + 1][secondRow + 1];;
        for(int i = 0; i <= firstRow; i ++){
            for(int j = 0; j <= secondRow; j ++){
                newNums[i][j] = nums[i][j];
            }
        }
        return newNums;
    }
}
