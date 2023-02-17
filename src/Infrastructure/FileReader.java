package Infrastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileReader {

    public List<Integer> readNumbersInFile(String fileName) {
        List<String> lines = new ArrayList<>();

        try {
            java.io.FileReader fileReader = new java.io.FileReader(fileName);
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error while reading file: " + e.getMessage());
        }

        return lines.stream().map(Integer::parseInt).collect(Collectors.toList());
    }
}
