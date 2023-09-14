import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvFileReader {

    private FileReader fileReader;

    public CsvFileReader(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public FileReader getFileReader() {
        return fileReader;
    }

    public void setFileReader(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public AppData read() {
        String[] header = null;
        int[][] data = null;

        try (BufferedReader reader = new BufferedReader(fileReader)) {
            int numOfLines = Integer.parseInt(reader.readLine());
            String headerLine, dataLine;

            if ((headerLine = reader.readLine()) != null) {
                header = headerLine.split(";");
            }

            int i = 0;
            data = new int[numOfLines][header.length];
            while ((dataLine = reader.readLine()) != null) {
                var arr = dataLine.split(";");

                for (int j = 0; j < arr.length; j++) {
                    data[i][j] = Integer.parseInt(arr[j]);
                }
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new AppData(header, data);
    }

}
