package main.algoritm.matrix;

public class RotateNinetyInPlace {

    private RotateNinetyInPlace() {}

    private static void transpose(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = i; j < m[0].length; j++) {
                int x = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = x;
            }
        }
    }


    public static void rotateByNinetyToLeft(int[][] m) {
        // transpose
        transpose(m);

        //  swap rows
        for (int  i = 0; i < m.length/2; i++) {
            for (int j = 0; j < m[0].length; j++) {
                int x = m[i][j];
                m[i][j] = m[m.length -1 -i][j];
                m[m.length -1 -i][j] = x;
            }
        }
    }


    public static void rotateByNinetyToRight(int[][] m) {
        // transpose
        transpose(m);

        // swap columns
        for (int  j = 0; j < m[0].length/2; j++) {
            for (int i = 0; i < m.length; i++) {
                int x = m[i][j];
                m[i][j] = m[i][m[0].length -1 -j];
                m[i][m[0].length -1 -j] = x;
            }
        }
    }

    public int[][] rotateMatrixRight(int[][] matrix)
    {
    /* W and H are already swapped */
        int w = matrix.length;
        int h = matrix[0].length;
        int[][] ret = new int[h][w];
        for (int i = 0; i < h; ++i) {
            for (int j = 0; j < w; ++j) {
                ret[i][j] = matrix[w - j - 1][i];
            }
        }
        return ret;
    }


    public int[][] rotateMatrixLeft(int[][] matrix)
    {
    /* W and H are already swapped */
        int w = matrix.length;
        int h = matrix[0].length;
        int[][] ret = new int[h][w];
        for (int i = 0; i < h; ++i) {
            for (int j = 0; j < w; ++j) {
                ret[i][j] = matrix[j][h - i - 1];
            }
        }
        return ret;
    }

    public static void rightRotate(int[][] matrix, int n) {
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - first;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int temp = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = temp;
            }
        }
    }


    public static void main(String[] args) {
        int[][] mEven = {{1, 3},
                {2, 4}};

        rotateByNinetyToLeft(mEven);

        for (int i = 0; i < mEven.length; i++) {
            for (int j = 0; j < mEven[0].length; j++) {
                System.out.print(mEven[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        rotateByNinetyToRight(mEven);

        for (int i = 0; i < mEven.length; i++) {
            for (int j = 0; j < mEven[0].length; j++) {
                System.out.print(mEven[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        int[][] mOdd = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        rotateByNinetyToLeft(mOdd);

        for (int i = 0; i < mOdd.length; i++) {
            for (int j = 0; j < mOdd[0].length; j++) {
                System.out.print(mOdd[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        rotateByNinetyToRight(mOdd);

        for (int i = 0; i < mOdd.length; i++) {
            for (int j = 0; j < mOdd[0].length; j++) {
                System.out.print(mOdd[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

    }
}
