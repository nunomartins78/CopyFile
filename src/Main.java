import Resources.fileReaderWriter;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String pathName = fileReaderWriter.askUserInput("Please insert file path");
        File newFile = new File(pathName);
        String [] ArrayFileList = newFile.list();
        //String fileList = Arrays.toString(ArrayFileList);
        fileReaderWriter.writeToFile("Please insert the new file path");
    }

}