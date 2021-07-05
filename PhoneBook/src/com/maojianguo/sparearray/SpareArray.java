package com.maojianguo.sparearray;

public class SpareArray {
    public static void main(String[] args) {

        //原数组
        int[][] chessArr1 = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        for (int[] row : chessArr1) {
            for (int data:row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        
        int sum = 0;
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1[i].length; j++) {
                if (chessArr1[i][j] != 0)
                    sum++;
            }
        }

        //稀疏数组
        int[][] sparseArray = new int[sum + 1][3];
        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = sum;

        int count = 1;
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1[i].length; j++) {
                if (chessArr1[i][j] != 0) {
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = chessArr1[i][j];
                    count++;
                }
            }
        }

        for (int[] row : sparseArray) {
            for (int data:row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

//        复原数组
        int[][] chessArr2 = new int[sparseArray[0][0]][sparseArray[0][1]];
        for (int i = 1; i <sparseArray.length ; i++) {
            chessArr2[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        for (int[] row : chessArr2) {
            for (int data:row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
    }
}
