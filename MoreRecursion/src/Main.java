public class Main {
    public static void main(String[] args) {
        int[][] map = generate(20, 20);
        char[][] traversal = new char[20][20];
        traverse(map, 0, 0, traversal, 15);
        displaySideBySide(map, traversal);
        System.out.println(sum(999999999, 0));

    }

    public static int sum(int n, int sum) {
         if (n <= 0) return sum;
         return sum(n-1, sum + n);
    }


    public static boolean binarySearch(int[] data, int search, int start, int end) {
        if (start > end) return false;
        int middle = (start + end) / 2;
        if (data[middle] == search) return true;
        return binarySearch(
                data,
                search,
                search < data[middle] ? start : middle + 1,
                search < data[middle] ? middle - 1 : end
        );

    }

    private static void traverse(int[][] map, int row, int col, char[][] output, int energy) {
        if (row < 0 || row >= map.length || col < 0 || col >= map[row].length) return;
        if (energy < map[row][col]) return;

        output[row][col] = '*';

        traverse(map, row - 1, col, output, energy - map[row][col]);
        traverse(map, row + 1, col, output, energy - map[row][col]);
        traverse(map, row, col - 1, output, energy - map[row][col]);
        traverse(map, row, col + 1, output, energy - map[row][col]);

    }

    public static int[][] generate(int width, int height) {
        int[][] map = new int[height][width];

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                map[row][col] = (int)(Math.random() * 3) + 1;
            }
        }
        return map;
    }

    public static void displaySideBySide(int[][] map, char[][] traversal) {
        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                System.out.printf("%d ", map[row][col]);
            }
            System.out.print("    ");
            for (int col = 0; col < map[row].length; col++) {
                System.out.printf("%s ", traversal[row][col]);
            }
            System.out.println();
        }
    }




}
