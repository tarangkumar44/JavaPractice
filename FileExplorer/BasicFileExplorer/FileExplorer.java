import java.io.File;

public class FileExplorer {
    public static void main(String[] args) {
        File path;

        // Handle no arguments → open current directory
        if (args.length == 0) {
            path = new File(System.getProperty("user.dir"));
            System.out.println("No folder provided. Showing current directory: " + path.getAbsolutePath());
        } else {
            path = new File(args[0]);
        }

        // Check if path exists
        if (!path.exists()) {
            System.out.println("Path does not exist: " + path.getAbsolutePath());
            return;
        }

        // Check if it's a directory
        if (!path.isDirectory()) {
            System.out.println("Not a directory: " + path.getAbsolutePath());
            return;
        }

        // List contents
        File[] contents = path.listFiles();
        System.out.println("Contents of: " + path.getAbsolutePath());
        System.out.println("----------------------------------");

        if (contents == null || contents.length == 0) {
            System.out.println("Folder is empty.");
            return;
        }

        for (File f : contents) {
            if (f.isDirectory()) {
                System.out.println("[DIR]  " + f.getName());
            } else {
                System.out.println("       " + f.getName());
            }
        }
    }
}

