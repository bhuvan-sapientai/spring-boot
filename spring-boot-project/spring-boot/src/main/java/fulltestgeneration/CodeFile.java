package fulltestgeneration;

import lombok.extern.slf4j.Slf4j;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Slf4j
public class CodeFile {

    private final String filePath;
    private final String fileName;
    private final String packageName;
    private final String codeContent;

    private final String importPath;

    public CodeFile(String filePath, String fileName, String packageName, String codeContent, String importPath) {
        this.filePath = filePath;
        this.fileName = fileName;
        this.packageName = packageName;
        this.codeContent = codeContent;
        this.importPath = importPath;
    }

    public void saveToFile() {
        try {
            Path directoryPath = Paths.get(this.filePath);
            if (!Files.exists(directoryPath)) {
                Files.createDirectories(directoryPath);
            }

            String fullFilePath = Paths.get(this.filePath, this.fileName + ".java").toString();
            try (FileWriter writer = new FileWriter(fullFilePath)) {
                if (this.packageName != null && !this.packageName.isEmpty()) {
                    writer.write("package " + this.packageName + ";\n\n");
                }
                if (this.importPath !=null && !this.importPath.isEmpty()) {
                    writer.write("import " + this.importPath + ";\n\n");
                }
                writer.write(this.codeContent);
            }
            //log.info("File saved successfully: {}", fullFilePath);
        } catch (IOException e) {
            //log.error("An error occurred while saving the file: {}", e.getMessage());
        }
    }
}
