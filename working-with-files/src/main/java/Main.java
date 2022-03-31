import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    private static final Path filePath = Paths.get(System.getProperty("user.dir") + "\\resources\\sample_data.txt");
    private static final Path filePathForMac = Paths.get("C:\\FannieProject\\files-demo\\working-with-files\\resources\\sample_data.txt");

    public static void main(String[] args) throws IOException {
        String welcome = "Welcome to Files!";
        System.out.println(welcome);

        //Create
        System.out.println("\nCalling the create a file method.");
        createAFile();

        //Update
        System.out.println("\nCalling the update a file method.");
        writeToAFile();

        //Read
        System.out.println("\nCalling the read a file method.");
        readAFile();

        //Delete
        System.out.println("\nCalling the delete a file method.");
        deleteAFile();

    }

    //Create
    public static void createAFile() {
        try {
            Files.createFile(filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Read
    public static void readAFile() {
        String temp;
        try {
           temp = Files.readString(filePath);
           System.out.println(temp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Update
    public static void writeToAFile() {
        try {
            Files.writeString(filePath, "This is the end my Friend...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Delete
    public static void deleteAFile() throws IOException {
        System.out.println("Do you want to delete the file?");
        System.out.println("Please say yes or no...");
        Scanner scanner = new Scanner(System.in);
        String delete = scanner.next();
        if(delete.equals("yes")) {
            Files.delete(filePath);
        } else {
            System.out.println("Ok you chose not to delete. :)");
        }
    }
}
