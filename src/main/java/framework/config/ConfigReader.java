package framework.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    public static void populateSettings() throws IOException {

        ConfigReader reader = new ConfigReader();
        reader.readProperty();
    }

    private void readProperty() throws IOException {

        Properties p = new Properties( );
        InputStream fis = new FileInputStream( "src\\main\\java\\framework\\config\\global.properties" );

        p.load(fis);
       Settings.engbKyowakirinHubUrl = p.getProperty( "engbKyowakirinHubUrl" );

    }
}
