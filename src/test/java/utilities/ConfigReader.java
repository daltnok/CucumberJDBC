package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    // todo : properties türünde database connection'ının  bilgileri
    // todo configruration.properties'den çağırılmıştır.
    // todo private olmasının nedeni database bağlantılarının sadece bu Class'dan erişilebilir
    //todo  olması sağlanır.
    // Aynı zamanda static bloktan da erişilebilir olmasını sağlar.
    static {
        String path = "configuration.properties";
        try {
            FileInputStream file = new FileInputStream(path);
            properties = new Properties();
            properties.load(file);
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } // static blok: sınıfın yüklenmesi sürecinde yalnızca birkez çalışır görevi tamamlanır.

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
