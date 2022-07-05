package recursion;


/**
 * Count total paths in maze to move from (0,0) to (m,n)
 * hint:- matrix(m*n)
 * eg- matrix(3*3)
 * move from (0,0)i.e.(i,j) to (3,3)i.e.(m,n)
 * <p>
 * rule:- you can only move to right or bottom into the matrix.
 */
public class CountTotalPath {

    public static int totalPath(int i, int j, int m, int n) {

        if (i == n || j == m)
            return 0;

        if (i == n - 1 && j == m - 1)
            return 1;


        int rightPath = totalPath(i, j + 1, m, n);
        int downPath = totalPath(i + 1, j, m, n);
        return rightPath + downPath;
    }

    public static void main(String[] args) {
        System.out.println(totalPath(0, 0, 3, 3));
    }
}
