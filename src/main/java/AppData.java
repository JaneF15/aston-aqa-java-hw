import java.util.Arrays;

public class AppData {

    private String[] header;

    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(Arrays.toString(header) + "\n");
        for (var line : data) {
            result.append(Arrays.toString(line)).append("\n");
        }
        return String.valueOf(result);
    }
}
