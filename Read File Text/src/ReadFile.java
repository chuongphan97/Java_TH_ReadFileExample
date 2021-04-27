import java.io.*;
import java.util.*;

public class ReadFile {
    public void readFileText(String filePath){
        try {
            File file = new File(filePath);

            if (!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader bf = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bf.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            System.out.println("Total: " + sum);
            bf.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }


public static void main(String[] args) {
    File file = new File("text.txt");
    try {
        if (file.exists()) {
            System.out.println("File already exist.");
        } else {
            file.createNewFile();
        }
    } catch (IOException e){
        System.out.println(e.getMessage());
    }

    System.out.println("Input path: ");
    Scanner sc = new Scanner(System.in);
    String path = sc.nextLine();

    ReadFile readFile = new ReadFile();
    readFile.readFileText(path);
}
}
