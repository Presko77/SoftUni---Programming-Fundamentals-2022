package Text_Processing_Exercise;

import java.util.Scanner;

public class P03Extract_File {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();
        String[] foldersName = path.split("\\\\");
        String fullFileName = foldersName[foldersName.length-1];


        String fileName = fullFileName.split("\\.")[0];
        String extension = fullFileName.split("\\.")[1];

        System.out.printf("File name: %s%n",fileName);
        System.out.printf("File extension: %s", extension);
    }
}
