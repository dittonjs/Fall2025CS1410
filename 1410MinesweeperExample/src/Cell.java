public class Cell {
    public enum Type {
        Mine,
        Empty,
        Number,
    }

    private boolean isFlagged = false;
    private boolean isActive = false;
    private Type type = Type.Empty;
    private int mineNeighbors = 0;


    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public boolean isFlagged() {
        return isFlagged;
    }

    public void setFlagged(boolean flagged) {
        if (isActive) return;
        isFlagged = flagged;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isFlagged = false;
        isActive = active;
    }

    public boolean isMine() {
        return type == Type.Mine;
    }

    @Override
    public String toString() {
        if (isFlagged) {
            return "\u2005f";
        }
        if (!isActive){
            return "◼";
        } else if (type == Type.Empty) {
            return "◻";
        } else if (type == Type.Mine) {
            return "X";
        }
        else {
            return "" + mineNeighbors;
        }
    }

    public void setMineNeighbors(int mineNeighbors) {
        this.mineNeighbors = mineNeighbors;
    }
}
