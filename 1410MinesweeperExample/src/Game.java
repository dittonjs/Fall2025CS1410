import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class Game {
    private int width;
    private int height;
    private int numMines;
    private Cell[][] grid;
    private boolean started = false;
    private boolean won = false;
    private boolean lost = false;

    public Game(int width, int height, int numMines) {
        this.width = width;
        this.height = height;
        this.numMines = numMines;
        this.grid = new Cell[height][width];
    }

    private void startGame(int row, int col) {
        ArrayList<Cell> cells = initCells();
        buildFirstSelection(row, col, cells);
        buildGrid(cells);
        countNeighbors();
    }

    public void selectCell(int row, int col) {
        if (row < 0 || row >= height || col < 0 || col >= width) {
            throw new OutOfGameAreaException(row, col);
        }

        if (!started) {
            startGame(row, col);
            started = true;
        }

        switch (grid[row][col].getType()) {
            case Mine -> revealMines();
            case Empty -> explodeBlankCells(row, col);
            case Number -> grid[row][col].setActive(true);
        }
    }

    public void flagCell(int row, int col) {
        if (row < 0 || row >= height || col < 0 || col >= width) {
            throw new OutOfGameAreaException(row, col);
        }
        grid[row][col].setFlagged(!grid[row][col].isFlagged());
        won = checkWin();
    }

    private boolean checkWin() {
        // can win by either flagging the mines or by activating all other cells except the mines
        int inactiveCount = 0;
        for(int r = 0; r < height; r++) {
            for(int c = 0; c <  width; c++) {
                Cell cell = grid[r][c];
                if (!cell.isActive()) inactiveCount++;
            }
        }

        if (inactiveCount == numMines) return true;


        for(int r = 0; r < height; r++) {
            for(int c = 0; c <  width; c++) {
                Cell cell = grid[r][c];
                if (
                        (cell.isMine() && !cell.isFlagged()) ||
                        (!cell.isMine() && cell.isFlagged())
                ) return false;
            }
        }

        return true;
    }

    private void revealMines() {
        lost = true;
        for(int r = 0; r < height; r++) {
            for(int c = 0; c <  width; c++) {
                Cell cell = grid[r][c];
                if (cell.isMine()) cell.setActive(true);
            }
        }
    }

    private void explodeBlankCells(int row, int col) {
//        if (row < 0 || row >= height || col < 0 || col >= width) return;
//        if (grid[row][col].isActive()) return;
//
//        grid[row][col].setActive(true);
//
//        if (grid[row][col].getType() == Cell.Type.Number) return;
//
//        explodeBlankCells(row + 1, col);
//        explodeBlankCells(row - 1, col);
//        explodeBlankCells(row, col - 1);
//        explodeBlankCells(row, col + 1);

        // list to store which cells we still need to visit
        ArrayList<HashMap<String, Integer>> cells = new ArrayList<>();

        // the location for the cell we clicked on
        HashMap<String, Integer> dict = new HashMap<>();
        dict.put("row", row);
        dict.put("col", col);

        cells.add(dict);
        while(!cells.isEmpty()) {
            HashMap<String, Integer> cellData = cells.removeFirst();
            int rowData = cellData.get("row");
            int colData = cellData.get("col");

            if (rowData < 0 || rowData >= height || colData < 0 || colData >= width) continue;
            Cell cell = grid[rowData][colData];
            if (cell.isActive()) continue;
            cell.setActive(true);
            if (cell.getType() == Cell.Type.Number) continue;

            HashMap<String, Integer> top = new HashMap<>();
            top.put("row", rowData - 1);
            top.put("col", colData);

            HashMap<String, Integer> bottom = new HashMap<>();
            bottom.put("row", rowData + 1);
            bottom.put("col", colData);

            HashMap<String, Integer> left = new HashMap<>();
            left.put("row", rowData);
            left.put("col", colData - 1);

            HashMap<String, Integer> right = new HashMap<>();
            right.put("row", rowData);
            right.put("col", colData + 1);

            cells.add(top);
            cells.add(bottom);
            cells.add(left);
            cells.add(right);
        }

    }



    // returns a randomized list of cells with 9 blank cells guaranteed at the beginning of the list
    private ArrayList<Cell> initCells() {
        ArrayList<Cell> cells = new ArrayList<>();
        // generate all cells except 9, we will generate 9 blank cells later so that we can handle the players first click
        for (int i = 0; i < (width * height) - 9; i++) {
            Cell cell = new Cell();
            if (i < numMines) cell.setType(Cell.Type.Mine);
            cells.add(cell);
        }

        Collections.shuffle(cells);
        // put 9 blank cells at the beginning of the shuffled list
        for(int i = 0; i < 9; i++) {
            cells.addFirst(new Cell());
        }

        return cells;
    }

    private void buildFirstSelection(int row, int col, ArrayList<Cell> cells) {
        for (int r = -1; r<=1; r++) {
            for (int c = -1; c<=1; c++) {
                if (row + r >= 0 && row + r < height && col + c >= 0 && col + c < width) {
                    grid[row + r][col + c] = cells.removeFirst();
                }
            }
        }
    }

    private void buildGrid(ArrayList<Cell> cells) {
        for(int r = 0; r < height; r++) {
            for(int c = 0; c <  width; c++) {
                if (grid[r][c] == null) {
                    grid[r][c] = cells.removeFirst();
                }
            }
        }
    }


    private Cell.Type getCellType(int row, int col) {
        if (row < 0 || row >= height || col < 0 || col >= width) return null;
        return grid[row][col].getType();
    }

    private void countNeighbors() {
        for(int r = 0; r < height; r++) {
            for(int c = 0; c < width; c++) {
                int count = 0;
                if (grid[r][c].getType() == Cell.Type.Mine) continue;
                if (getCellType(r-1, c) == Cell.Type.Mine) count ++;
                if (getCellType(r+1, c) == Cell.Type.Mine) count ++;
                if (getCellType(r, c-1) == Cell.Type.Mine) count ++;
                if (getCellType(r, c+1) == Cell.Type.Mine) count ++;
                if (getCellType(r-1, c-1) == Cell.Type.Mine) count ++;
                if (getCellType(r-1, c+1) == Cell.Type.Mine) count ++;
                if (getCellType(r+1, c-1) == Cell.Type.Mine) count ++;
                if (getCellType(r+1, c+1) == Cell.Type.Mine) count ++;
                if (count > 0) {
                    grid[r][c].setType(Cell.Type.Number);
                    grid[r][c].setMineNeighbors(count);
                }
            }
        }
    }

    public boolean isLost() {
        return lost;
    }

    public boolean isWon() {
        return won;
    }

    public void displayGame() {
        for(int r = 0; r < height; r++) {
            for(int c = 0; c <  width; c++) {
                if (started) {
                    System.out.printf("%s", grid[r][c]);
                } else {
                    System.out.print("◼");
                }
            }
            System.out.println();
        }
    }

    public static class OutOfGameAreaException extends RuntimeException {
        public OutOfGameAreaException(int row, int col) {
            super(String.format("Row: %d, Col: %d is out of the game boundary.", row, col ));
        }
    }

}
