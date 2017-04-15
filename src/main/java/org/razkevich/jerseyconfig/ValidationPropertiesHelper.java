package org.razkevich.jerseyconfig;


import org.razkevich.model.ConstraintsViolatedResponseVO;
import org.apache.commons.lang3.text.StrSubstitutor;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class ValidationPropertiesHelper {


    private static Properties properties = new Properties();

    private ValidationPropertiesHelper() {
    }

    static {
        try {
            properties.load(new InputStreamReader(new FileInputStream(
                    ConstraintsViolatedResponseVO.class.getClassLoader().getResource("validation.properties").getFile())
                    , "UTF-8"));
        } catch (Exception ignored) {
        }
    }

    public static String interpolate(String message) {
        return StrSubstitutor.replace(message, properties);
    }
}
