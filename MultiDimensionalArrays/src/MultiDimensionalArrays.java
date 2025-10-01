public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] data = generateRandom2dArray(20, 20, 100);
        display(data);


        int[][] data2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        /*
                   utah
                 |
              cache                       saltlake
            |     |     |
          logan hyrum smithfield



         */

        int[][][] data3d = {
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9},
                },
                {
                        {12,23,34},
                        {435,564,678},
                },
        };
        System.out.println(data3d[0][2][1]);
        char[][] canvas = generateCanvas(30, 30);
//        drawCircle(canvas, 10, 10, 5);
//        display(canvas);
        drawCircle(canvas, 15, 15, 10);
        display(canvas);
    }

    public static void display(char[][] canvas) {
        for (char[] row: canvas) {
            for (char pixel: row) {
                System.out.printf("%s  ", pixel);
            }
            System.out.println();
        }
    }

    public static void display(int[][] array) {
        for (int[] row:array) {
            for (int value: row) {
                System.out.printf("%3d ", value);
            }
            System.out.println();
        }
    }
    //    int[][] data2 = {
    //            {1,2,3},
    //            {4,5,6},
    //            {7,8,9}
    //    };
    public static int[][] generateRandom2dArray(int rows, int cols, int max) {
        int[][] array = new int[rows][cols];
        for(int row = 0; row<rows; row++) {
            array[row] = new int[cols];
            for(int col = 0; col<cols; col++) {
                array[row][col] = (int)(Math.random() * max);
            }
        }
        return array;
    }

    public static char[][] generateCanvas(int width, int height) {
        char[][] array = new char[height][width];
        for(int y = 0; y<height; y++) {
            array[y] = new char[width];
            for(int x = 0; x<width; x++) {
                array[y][x] = ' ';
            }
        }
        return array;
    }

    public static void drawCircle(char[][] canvas, int centerX, int centerY, int radius) {
        for (int y = 0; y < canvas.length; y++) {
            for (int x = 0; x<canvas[y].length; x++) {
                double distance = Math.sqrt(Math.pow(x - centerX, 2) + Math.pow(y-centerY, 2));
                if (distance < radius) {
                    canvas[y][x] = 'x';
                }
            }
        }
    }
}
