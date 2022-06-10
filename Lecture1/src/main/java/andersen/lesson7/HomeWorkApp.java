package andersen.lesson7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) throws IOException {
        WriteToCsvFile();
        ReadCsvFileAndPrint();
    }

    private static void ReadCsvFileAndPrint() throws IOException {

        String line = null;
        Scanner scanner = null;
        int index = 0;
        List<AppData> empList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(
                "testFile.csv"));

        AppData emp = new AppData();

        while ((line = reader.readLine()) != null) {

            scanner = new Scanner(line);
            scanner.useDelimiter(";");

            ArrayList<String> dataLine = new ArrayList<>();
            while (scanner.hasNext()) {
                String data = scanner.next();
                dataLine.add(data);
            }

            if(index == 0){
                String[] header1 = new String[dataLine.size()];
                emp.setHeader(dataLine.toArray(header1));
            } else {
                int[] data = new int[dataLine.size()];
                for (int i = 0; i < dataLine.size(); i++) {
                    data[i] = Integer.parseInt(dataLine.get(i));
                }

                emp.addData(data);
            }

            index++;
        }

        reader.close();

        System.out.println(emp);
    }

    private static void WriteToCsvFile() throws FileNotFoundException {
        AppData appData = new AppData();
        var data = new int[][]{
                {100,200,123},
                {300,400,500},
                {777,666,333}
        };

        appData.setData(data);
        appData.setHeader(new String[]{
                "Value 1",
                "Value 2",
                "Value 3"
        });

        File file = new File("testFile.csv");
        PrintWriter pw = new PrintWriter(file);

        String headerLine = appData.getHeaderLine();
        pw.println(headerLine);

        for (int[] row : appData.getData()) {
            String dataLine = appData.getDateRowLine(row);
            pw.println(dataLine);
        }

        pw.close();
    }
}




