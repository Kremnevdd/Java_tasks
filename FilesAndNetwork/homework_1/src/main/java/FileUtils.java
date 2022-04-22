import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtils {

    public static long calculateFolderSize(String path) {

        long space = 0;
        try {
            File folder = new File(path);
            File[] files = folder.listFiles();
            int count = files.length;
            for (int i = 0; i < count; i++) {
                if (files[i].isFile()) {
                    space = space + files[i].length();
                } else {
                    space = space + calculateFolderSize(String.valueOf(files[i]));
                }

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return space;
    }

}
