import com.google.common.io.Files;

import java.io.*;
import java.nio.file.Path;

public class FileUtils {
    public static void copyFolder(String sourceDirectory, String destinationDirectory)
            throws IOException {
        // TODO: write code copy content of sourceDirectory to destinationDirectory
        File sourceFolder = new File(sourceDirectory);
        File destinationFolder = new File(destinationDirectory);
        if (sourceFolder.isDirectory()) {

            if (!destinationFolder.exists()) {
                if (destinationFolder.mkdir()) {
                    System.out.println("Directory was created");
                } else {
                    System.err.println("Directory was not created");
                }
            }
            String[] sourceFiles = sourceFolder.list();
            if (sourceFiles == null) {
                return;
            }
            for (String file : sourceFiles) {
                File srcFile = new File(sourceFolder, file);
                File destFile = new File(destinationFolder, file);
                copyFolder(srcFile.getPath(), destFile.getPath());
            }

        } else {
            InputStream in = null;
            OutputStream out = null;
            try {
                in = new FileInputStream(sourceFolder);
                out = new FileOutputStream(destinationFolder);

                byte[] buffer = new byte[1024];
                int size;
                while ((size = in.read(buffer)) > 0) {
                    out.write(buffer, 0, size);
                }
                System.out.println("File " + sourceFolder.getPath() + " was copied");
            } catch (IOException ex) {
                System.err.println("IOErrors : " + ex.getMessage());

            } finally {
                if (in != null){
                    in.close();
                }
                if (out != null){
                    out.close();
                }
            }
        }


    }
}
