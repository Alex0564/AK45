package helpers;

import com.github.javafaker.Faker;
import myModels.Category;
import myModels.MyPet;
import myModels.Status;
import myModels.Tag;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class TestDataGenerator {
    public static String getString(int length){
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }
    public static MyPet generateRandomPet (){
        Faker faker = new Faker();
        Random random = new Random();
        String name = faker.cat().name();
        Category category = new Category (random.nextInt(), faker.cat().breed());
        String [] photoUrls = {faker.internet().image()};
        Tag tag = new Tag (random.nextInt(), faker.animal().name());
        Tag[] tags = {tag};

        return new MyPet(name, category, photoUrls, tags, Status.pending);
    };
}