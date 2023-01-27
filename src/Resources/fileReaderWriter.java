package Resources;

import java.io.*;

public class fileReaderWriter {

    public static String askUserInput(String msg) {

        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);

        BufferedReader pathToFile = new BufferedReader(reader);
        System.out.println(msg);
        String userInput;

        {
            try {
                userInput = pathToFile.readLine(); ///Blocking method
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return userInput;

    }

    public static void writeToFile(String newMSG) {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);

        FileOutputStream output;

        BufferedReader writeToFile = new BufferedReader(reader);
        System.out.println(newMSG);

        String nameDirectory;

        try {
            nameDirectory = writeToFile.readLine();

            // Create a file object
            File f = new File(nameDirectory);

            output = new FileOutputStream("/output.txt");

            // Get all the names of the files present in the given directory
            String[] files = f.list();

            System.out.println("Files are:");

            // Display the names of the files
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i]);
                output.write(files[i].getBytes());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

