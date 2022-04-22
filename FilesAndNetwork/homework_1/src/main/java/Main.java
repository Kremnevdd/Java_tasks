import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;

public class Main {
    private static final double BYTE_IN_GIGABYTE = 1073741824;
    private static final double BYTE_IN_MEGABYTE = 1048576;
    private static final double BYTE_IN_KILOBYTE = 1024;

    public static void main(String[] args) {

        boolean stop = false;

        while (!stop) {
            System.out.println("Введите путь до папки :");
            Scanner scanner = new Scanner(System.in);
            String path = scanner.nextLine();
            // Вывод в мегабайтах
            if (FileUtils.calculateFolderSize(path) < BYTE_IN_GIGABYTE
                    && FileUtils.calculateFolderSize(path) > BYTE_IN_MEGABYTE) {
                System.out.printf("%.2f", (FileUtils.calculateFolderSize(path) / BYTE_IN_MEGABYTE));
                System.out.println(" MiB");
            }
            //Вывод В гигабайтах
            if (FileUtils.calculateFolderSize(path) > BYTE_IN_GIGABYTE) {
                System.out.printf("%.2f", (FileUtils.calculateFolderSize(path) / BYTE_IN_GIGABYTE));
                System.out.println(" GiB");
            }
            //Вывод в килобайтах
            if (FileUtils.calculateFolderSize(path) < BYTE_IN_MEGABYTE
                    && FileUtils.calculateFolderSize(path) > BYTE_IN_KILOBYTE) {
                System.out.printf("%.2f", (FileUtils.calculateFolderSize(path) / BYTE_IN_KILOBYTE));
                System.out.println(" KiB");
            }
            /*else {
                System.out.println((FileUtils.calculateFolderSize(path)) + "Bytes");
            }*/

        }


    }
}
