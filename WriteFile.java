import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
//writer file
public class WriteFile
{
    private String path;
    private boolean appendToFile = false;
    private PrintWriter printLine;

    public WriteFile(String filePath)
    {
        path = filePath;

    }

    public WriteFile(String filePath, boolean appendValue)
    {
        path = filePath;
        appendToFile = appendValue;
    }
    public void openFile() throws IOException
    {
        FileWriter write = new FileWriter(path, appendToFile);
        printLine = new PrintWriter(write);
    }
    public void closeFile()
    {
        if(printLine != null)
        {
            printLine.close();
        }
    }
    public void writeToFile(String textLine)
    {
        printLine.printf("%s%n", textLine);
    }





}
