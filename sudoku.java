import java.util.*;

class sudoku {
    private int[][] sudoku;
    public sudoku() {
        sudoku = new int[9][9];
    }
    public sudoku(int sudoku[][]) {
        this.sudoku = sudoku;
    }
    private int containsInRow(int row, int number) {
        int c = 0;
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == number) {
            c++;    
            }
        }
        return c;
    }
    private int containsInCol(int col, int number) {
        int c = 0;
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == number) {
                c++;
            }
        }
        return c;
    }
    private int containsInBox(int row, int col, int number) {
        int count = 0;
        int r = row - row % 3;
        int c = col - col % 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (sudoku[i][j] == number) {
                    count++;
                }
            }
        }
        return count;
    }
    private boolean isAllowed(int row, int col, int number) {
        int checkforCol = containsInCol(col, number);
        int checkforBox = containsInBox(row, col, number);
        int checkforRow = containsInRow(row, number);

        return !( (checkforBox!=1) || (checkforCol!=1) || (checkforRow!=1) );
    }
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        int[][] board = 
        {
        {1,2,3  ,4,5,6, 7,8,9},
        {4,5,6  ,7,8,9, 1,2,3},
        {7,8,9  ,1,2,3, 4,5,6},

        {2,3,1  ,5,6,4, 8,9,7},
        {5,6,4  ,8,9,7, 2,3,1},
        {8,9,7  ,2,3,1, 5,6,4},
    
        {3,1,2  ,6,4,5, 9,7,8},
        {6,4,5  ,9,7,8, 3,1,2},
        {9,7,8  ,3,1,2, 6,4,5}
        };
        sudoku a = new sudoku(board);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                boolean c = a.isAllowed(i, j, board[i][j] ) ;
               if(c == true) {
                   count++;
               }
            }
        }
        if(count == 81) {
            System.out.print("Valid");
        }
        else {
            System.out.print("Invalid");
        }
    }
}