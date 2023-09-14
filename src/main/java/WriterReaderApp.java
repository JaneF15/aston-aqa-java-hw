import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterReaderApp {

    public static void main(String[] args) throws IOException {

        String fileName = "data.csv";

        String[] header = {"value1", "value2", "value3"};
        int[][] data = {{100, 200, 123}, {300, 400, 500}};

        AppData appData = new AppData(header, data);

        CsvFileWriter writer = new CsvFileWriter(new FileWriter(fileName));
        writer.save(appData);

        CsvFileReader reader = new CsvFileReader(new FileReader(fileName));
        AppData readAppData = reader.read();

        System.out.println(readAppData);
    }

}
