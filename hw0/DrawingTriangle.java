'''Creative Exercise 1b: DrawTriangle'''
package yousaywhy;

public class DrawingTriangle {
    public static void DrawingTriangle(int N){

        int row = 0;
        int SIZE = N;
        while (row <= SIZE){
            int col = 0;
            while (col < row){
                System.out.print('*');
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }

    public static void main(String[] args) {
        DrawingTriangle(20);
    }
}
