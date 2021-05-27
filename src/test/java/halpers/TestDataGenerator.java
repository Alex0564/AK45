package halpers;

import org.apache.commons.lang3.RandomStringUtils;

public class TestDataGenerator {
    public static String getString (int lenght) {
        boolean useLetters = true;
        boolean useNumbers = false;
        int length = 7;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }


}
