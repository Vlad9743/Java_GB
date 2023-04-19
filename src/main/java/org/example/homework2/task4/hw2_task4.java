package org.example.homework2.task4;

/*
4)() Отвалидировать доску судоку
        /Требования
        Объявлена доска 9 x 9 необходимо отвалидировать в соответствии с правилами
        1. Каждая строка должна содержать цифру 1-9 без повторения
        2. Каждая колонка должна содержать цифру 1-9 без повторения
        3. Каждый под блок из 9 элементов 3 x 3 должна содержать цифру 1-9 без повторения
        Ограничения
        • board.length == 9
        • board[i].length == 9
        • board[i][j] значение число или '.'
        */
public class hw2_task4 {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '9', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

         System.out.println("Validete:" + isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] sudokuArray){
    boolean checkResult = true;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = j+1; k < 9; k++) {
                    if (sudokuArray[i][j] == sudokuArray[i][k] && sudokuArray[i][j] != '.'){
                            checkResult = false;
                    }
                }
                
            }

        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = j + 1; k < 9; k++) {
                    if (sudokuArray[j][i] == sudokuArray[k][i] && sudokuArray[j][i] != '.') {
                        checkResult = false;
                    }
                    System.out.println(i + " "+ j + " " + k + " " + checkResult);
                }
            }
        }
        
    return checkResult;
    }
}
