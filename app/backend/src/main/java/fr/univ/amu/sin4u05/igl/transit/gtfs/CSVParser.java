package fr.univ.amu.sin4u05.igl.transit.gtfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Consumer;

class CSVParser {

    public static void parse(InputStream inputStream, String[] columnNames, Consumer<String[]> handler) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        String header = reader.readLine();
        List<String> headers = Arrays.asList(header.split(","));

        int[] columnIndexes = new int[columnNames.length];
        for (int i = 0; i < columnNames.length; i++) {
            int index = headers.indexOf(columnNames[i]);
            if (index != -1) columnIndexes[i] = index;
        }

        String[] data = new String[columnIndexes.length];
        String line;
        while ((line = reader.readLine()) != null) {
            String[] elements = line.split(",");
            for (int i = 0; i < columnIndexes.length; i++) {
                String element = elements[columnIndexes[i]];
                if (element.startsWith("\"") && element.endsWith("\""))
                    element = element.substring(1, element.length() - 1);
                data[i] = element;
            }
            handler.accept(data);
        }
    }
}
