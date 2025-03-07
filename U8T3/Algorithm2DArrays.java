import java.util.ArrayList;

public class Algorithm2DArrays {
    
  /** Return the sum of all elements of arr that are in the one particular row, 
   *  specified by the row parameter
   *
   *  PRECONDITION:  0 <= row < arr.length (i.e. row is guaranteed to be valid)
   *
   *  @param arr  2D array of ints
   *  @param row  the row to add up
   *  @return  the sum of all elements in row
   
   */
  public static int sumForRow(int[][] arr, int row){
      int sum = 0;
      int rowLength = arr[0].length;
      for(int i = 0; i < rowLength; i ++){
        sum += arr[row][i];
      }
      return sum;
  }
   /** Return the sum of all elements of arr that are in the one particular column 
   *
   *  PRECONDITION:  0 <= col < arr[0].length (i.e. col is valid)
   *
   *  @param arr  2D array of ints
   *  @param col  the column to add up
   *  @return  the sum of all elements in column
   */
  public static int sumForColumn(int[][] arr, int col){
      int sum = 0;
      int columnLength = arr.length; 
      for(int i  = 0; i < columnLength; i ++){
        sum += arr[i][col];
      }
      return sum;
  }
    /** Replaces all even integers in arr with 0; all odd integers are unchanged.
   *  It then returns the number of changes that were made.
   *
   *  Example: if arr is {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}}
   *  then this method modifies arr to be:
   *           {{1, 0, 3, 0, 5}, {0, 7, 0, 9, 0}, {0, 0, 0, 3, 5}}
   *  and returns 8 (the number of even numbers replaced by 0)
   *
   * POSTCONDITION: this method modifies the original 2D array referenced by arr
   *
   *  @param arr  2D array of ints
   *  @return  the number of changes made
   */
  public static int replaceEvensWithZero(int[][] arr){
    int count = 0;
    int columnLength = arr.length;
    int rowLength = arr[0].length;
    for(int i = 0; i < columnLength; i ++){
      for(int j = 0; j < rowLength; j ++){
        if(arr[i][j] % 2 == 0){
          arr[i][j] = 0;
          count ++;
        }
      }
    }
    return count;
  }
    /** Searches through the 2D array wordChart and finds all strings with
   *  length len; these strings are added to an ArrayList and returned.
   *  If no strings have that length, return an empty ArrayList
   *
   *  @param wordChart  2D array of Strings
   *  @parram len  the length of strings to search for
   *  @return  an ArrayList containing all strings in wordChart with length len
   */
  public static ArrayList<String> findStringsOfLength(String[][] wordChart, int len){
    ArrayList<String> wordsOfLen = new ArrayList<>();
    int columnLength = wordChart.length;
    int rowLength = wordChart[0].length;
    for(int i = 0; i < columnLength; i ++){
      for(int j = 0; j < rowLength; j ++){
        if(wordChart[i][j].length() == len){
          wordsOfLen.add(wordChart[i][j]);
        }
      }
    }
    return wordsOfLen;
  }

  public static double classAverage(Student[][] seatingChart){
    double total = 0;
    int columnLength = seatingChart.length;
    int rowLength = seatingChart[0].length;
    for(int i = 0; i < columnLength; i ++){
      for(int j = 0; j < rowLength; j ++){
        total += seatingChart[i][j].getGrade();
      }
    }
    return total/(columnLength * rowLength);
  }

  public static boolean consecutive(int[][] arr){
    int columnLength = arr.length;
    int rowLength = arr[0].length;
    for(int i = 0; i < columnLength; i ++){
      for(int j = 0; j < rowLength; j ++){
        if(j != rowLength - 1){
          if(arr[i][j + 1] == arr[i][j]){
            return true;
          }
        }
        if(i != columnLength - 1){
          if(arr[i + 1][j] == arr[i][j]){
            return true;
          }
        }
      }
    }
    return false;
  }

  public static boolean magicSquare(int[][] arr){
    int columnLength = arr.length;
    int rowLength = arr[0].length;
    int magicNumber = 0, horizontal = 0, vertical = 0, firstDiagonal = 0, secondDiagonal = 0, thirdDiagonal = 0, fourthDiagonal = 0, nextDiagonal = 0;
    String foundNumbers = "";
    for(int i = 0; i < rowLength; i ++){
      magicNumber += arr[0][i];
    }
    for(int i = 0; i < columnLength; i ++){
      for(int j = 0; j < rowLength; j ++){
        if(foundNumbers.indexOf(" " + Integer.toString(arr[i][j]) + " ") != -1){
          System.out.println(foundNumbers);
          return false;
        }
        foundNumbers += " " + arr[i][j] + " ";
        horizontal += arr[i][j];
      }
      if(horizontal != magicNumber){
        return false;
      }
      horizontal = 0;
    }
    for(int i = 0; i < rowLength; i ++){
      for(int j = 0; j < columnLength; j ++){
        vertical += arr[j][i];
      }
      if(vertical != magicNumber){
        return false;
      }
      vertical = 0;
    }
    for(int i = 0; i < rowLength; i ++){
      firstDiagonal += arr[i][i];
      secondDiagonal += arr[rowLength - 1 - i][i];
      thirdDiagonal += arr[i][rowLength - 1 - i];
      fourthDiagonal += arr[columnLength - 1 - i][rowLength - 1 - i];
    }
    if(firstDiagonal != magicNumber || secondDiagonal != magicNumber || thirdDiagonal != magicNumber || fourthDiagonal != magicNumber){
      return false;
    }
    return true;
  }
}