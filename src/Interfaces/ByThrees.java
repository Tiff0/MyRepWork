package Interfaces;

public class ByThrees implements Series {
    private int start;
    private int val;

    ByThrees(){
        start = 0;
        val = 0;
    }

    @Override
    public int getNext(){
        val  += 3;
        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val = 0;
    }

    @Override
    public void setStart(int start) {
        this.start = start;
        this.val = start;
    }
}
