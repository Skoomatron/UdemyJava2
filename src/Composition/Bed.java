package Composition;

public class Bed {
    private String style;
    private int pillows;
    private int quilts;
    private int sheets;
    private int height;

    public Bed(String style, int pillows, int quilts, int sheets, int height) {
        this.style = style;
        this.pillows = pillows;
        this.quilts = quilts;
        this.sheets = sheets;
        this.height = height;
    }

    public void make() {
        System.out.println("Bed is made.");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getQuilts() {
        return quilts;
    }

    public int getSheets() {
        return sheets;
    }

    public int getHeight() {
        return height;
    }
}
