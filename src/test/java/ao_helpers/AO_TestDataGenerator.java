package ao_helpers;

import ao_models.*;
import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class AO_TestDataGenerator {
    public static String getString(int length){
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }
    public static AO_Pet generateRandomPet() {
        Faker faker = new Faker();
        Random random = new Random();
        String name = faker.cat().name();
        AO_Category category = new AO_Category(random.nextInt(), faker.cat().breed());
        String[] photoUrls = {faker.internet().image()};
        AO_Tag tag = new AO_Tag(random.nextInt(), faker.animal().name());
        AO_Tag[] tags = {tag};

        return new AO_Pet(name, category, photoUrls, tags, AO_Status.pending);

    }
    public static AO_Store generateRandomOrder() {
        Faker faker = new Faker();
        Random random = new Random();
        int quantity = random.nextInt();
        String shipDate = "2000";
        return new AO_Store(quantity, shipDate, AO_Status.placed);
    }
}
