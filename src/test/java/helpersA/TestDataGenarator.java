package helpersA;

import org.apache.commons.lang3.RandomStringUtils;

public class TestDataGenarator {
    public static String getString(int length){
      boolean useLetters = true;
      boolean useNumbers = false;
      return RandomStringUtils.random(length,useLetters,useNumbers);
    }
}
