import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CsvFileWriter {

    private FileWriter fileWriter;

    public CsvFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public FileWriter getFileWriter() {
        return fileWriter;
    }

    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void save(AppData appData) {
        var header = appData.getHeader();
        var data = appData.getData();

        try (BufferedWriter writer = new BufferedWriter(fileWriter)) {
            writer.write(data.length + "\n");

            for (String str : header) {
                writer.write(str + ";");
            }
            writer.write("\n");

            for (int[] line : data) {
                for (int value : line) {
                    writer.write(value + ";");
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
