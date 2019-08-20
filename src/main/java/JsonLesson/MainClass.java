package JsonLesson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.util.Arrays;

public class MainClass {
    private static final Gson gson = new Gson();

    public static void main(String[] args) {
        User user = new User("Andrew", 2854, Arrays.asList("Lviv", "Kyiv", "Warshawa"),
                new UserAddress("Lukashe stt.", 4));
        String json = "{'userName':'Andrew','id':2854,'geoHistory':['Lviv','Kyiv','Warshawa'], 'userAddress':{'street':'Lukashe stt.','houseNumber':4}}";

        User user1 = gson.fromJson(json, User.class);

        System.out.println(user1);
    }

}
