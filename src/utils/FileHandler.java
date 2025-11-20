package utils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class FileHandler {

    public static List<String> readLines(String path) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {

            String line;
            while ((line = br.readLine()) != null)
                lines.add(line);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static void writeLines(String path, List<String> lines) {
        try (BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(path), StandardCharsets.UTF_8))) {

            for (String s : lines)
                bw.write(s + System.lineSeparator());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
