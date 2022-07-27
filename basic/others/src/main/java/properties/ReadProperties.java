package properties;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * @author luzhonghe
 * @date 2022/7/27 23:31
 */
public class ReadProperties {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        try (InputStream in = Files.newInputStream(Paths.get("basic", "others", "src", "main", "resources", "database.properties"))) {
            // 但是打包之后resources中的文件会被放在jar的根目录，所以不用加那么多前缀
            properties.load(in);
        }
        System.out.println(properties.getProperty("jdbc.username"));

    }

}
