import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size");
        int rowSize = sc.nextInt();
        System.out.println("Enter the column size");
        int columnSize = sc.nextInt();

        // *****
        // *****
        // *****
        // *****
        // *****

        // for (int row = 0; row < rowSize; row++) {
        // for (int column = 0; column < columnSize; column++) {
        // System.out.print("*");
        // }
        // System.out.print("\n");
        // }

        // *****
        // * *
        // * *
        // * *
        // *****

        // for (int row = 1; row <= rowSize; row++) {
        // for (int column = 1; column <= columnSize; column++) {
        // if (row == 1 || row == rowSize || column == 1 || column == columnSize) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.print('\n');

        // }

        // *
        // **
        // ***
        // ****
        // *****

        // for (int row = 1; row <= rowSize; row++) {
        // for (int column = 1; column <= row; column++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // *****
        // ****
        // ***
        // **
        // *

        // for (int row = 1; row <= rowSize; row++) {
        // for (int column = rowSize; column >= row; column--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // *
        // **
        // ***
        // ****
        // *****

        // for (int row = 1; row <= rowSize; row++) {
        // for (int column = 1; column <= columnSize; column++) {
        // if (column <= (columnSize - row)) {
        // System.err.print(" ");
        // } else
        // System.out.print("*"); // }
        // System.out.println();
        // }

        // 1
        // 12
        // 123
        // 1234
        // 12345

        // for (int row = 1; row <= rowSize; row++) {
        // for (int column = 1; column <= row; column++) {
        // System.out.print(column);
        // }
        // System.out.println();
        // }

        // 12345
        // 1234
        // 123
        // 12
        // 1

        // for (int row = rowSize; row >= 1; row--) {
        // for (int column = 1; column <= row; column++) {
        // System.out.print(column);
        // }
        // System.out.println();
        // }

        // 1
        // 01
        // 101
        // 0101
        // 10101

        // int val = 1;
        // for (int row = 1; row <= rowSize; row++) {
        // if (row % 2 != 0)
        // val = 1;
        // for (int column = 1; column <= row; column++) {
        // System.out.print(val);
        // val = val ^ 1;
        // }
        // System.out.println();
        // }

        // * *
        // ** **
        // *** ***
        // ********
        // ********
        // *** ***
        // ** **
        // * *

        // for (int row = 1; row <= rowSize; row++) {
        // for (int column = 1; column <= row; column++) {
        // System.out.print("*");
        // }
        // for (int column = (2 * rowSize) - (2 * row); column >= 1; column--) {
        // System.out.print(" ");
        // }
        // for (int column = 1; column <= row; column++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int row = 1; row <= rowSize; row++) {
        // for (int column = rowSize; column >= row; column--) {
        // System.out.print("*");
        // }
        // for (int column = 1; column <= 2 * (row - 1); column++) {
        // System.out.print(" ");
        // }
        // for (int column = rowSize; column >= row; column--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // *****
        // *****
        // *****
        // *****
        // *****

        // for (int row = 1; row <= rowSize; row++) {
        // for (int column = rowSize - 1; column >= row; column--) {
        // System.out.print(" ");
        // }
        // for (int column = 1; column <= rowSize; column++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // }

        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4
        // 5 5 5 5 5

        // for (int row = 1; row <= rowSize; row++) {
        // for (int column = rowSize - 1; column >= row; column--) {
        // System.out.print(" ");
        // }
        // for (int column = 1; column <= row; column++) {
        // System.out.print(row + " ");
        // }
        // System.out.println();

        // }

    }
}
