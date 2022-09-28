/*
 * Input:
 *  asf5g5g66
 *  gh5n0rh5e
 *  d9d10d0
 *  oo9etyd1c3dfg4
 *  abc999l0j
 *  dsf1sf5sd9l0
 *  l0l02Ol0l
 *  asf5g5g6O
 *  ee8OidXXI0l
 *  d9dI0dl0
 * 
 * Output:
 *  asf5g5g66
 *  d9d10d0
 *  abc999l0j
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Create a Main class
public class Main {

    // Create a run() method
    public static void run(String name) throws IOException {
        String TextFileName = name;
        File file = new File(TextFileName + ".txt");
        FileReader fileReader = new FileReader(file);
        try (BufferedReader bufferReader = new BufferedReader(fileReader)) {
            String line = null;
            while ((line = bufferReader.readLine()) != null) {
                Pattern pattern = Pattern.compile("\\d+");
                Matcher match = pattern.matcher(line);
                while (match.find()) {
                    if (Integer.parseInt(match.group()) >= 10) {
                        System.out.println(line);
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        run("text"); // Call the static method
    }
}
