package andersen.lesson7;

import java.util.ArrayList;

public class AppData {

    private String[] header;


    private int[][] data;

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (var head : this.header) {
            result.append(head + ";");
        }
        result.append("\n");
        for (var d : this.data) {
            for (var n : d) {
                result.append(n + ";");
            }
            result.append("\n");
        }

        return result.toString();
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

    public String getHeaderLine() {
        return joinWithDelimiter(header);
    }

    public String getDateRowLine(int[] dateRow) {
        String[] dateRowStr = new String[dateRow.length];
        for (int i = 0; i < dateRow.length; i++) {
            dateRowStr[i] = String.valueOf(dateRow[i]);
        }

        return joinWithDelimiter(dateRowStr);
    }

    private String joinWithDelimiter(String[] values) {
        return String.join(";", values);
    }

    public void addData(int[] data) {
        if (this.data == null) {
            this.data = new int[][]{data};
        } else {
            var tmp = new int[this.data.length + 1][data.length];
            for (int i = 0; i < this.data.length; i++) {
                tmp[i] = this.data[i];
            }

            tmp[this.data.length] = data;
            this.data = tmp;
        }
    }
}
