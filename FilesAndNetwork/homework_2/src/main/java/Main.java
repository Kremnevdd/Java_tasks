import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter source path :");
        String source = sc.nextLine();
        System.out.println("Please, enter destination path :");
        String destination = sc.nextLine();

        try {
            FileUtils.copyFolder(source, destination);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Done");
    }
}
