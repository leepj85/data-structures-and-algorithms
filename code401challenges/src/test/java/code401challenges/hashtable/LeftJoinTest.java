package code401challenges.hashtable;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;

public class LeftJoinTest {

    @Test
    public void leftJoin() {
        HashMap<String, String> synonyms = new HashMap<>();
        HashMap<String, String> antonyms = new HashMap<>();

        synonyms.put("fond", "enamored");
        synonyms.put("wrath", "anger");
        synonyms.put("diligent", "employed");
        synonyms.put("outift", "garb");
        synonyms.put("guide", "usher");

        antonyms.put("fond", "averse");
        antonyms.put("wrath", "delight");
        antonyms.put("diligent", "idle");
        antonyms.put("guide", "follow");
        antonyms.put("flow", "jam");

        HashMap<String, String[]> results = LeftJoin.leftJoin(synonyms, antonyms);
//        System.out.println(results.toString());
        String resultString = "";
        for(String key : results.keySet()){
            resultString += key + " --> " + Arrays.toString(results.get(key)) + "\n";
        }

        String expected = "diligent --> [employed, idle]\n" +
                "wrath --> [anger, delight]\n" +
                "outift --> [garb, null]\n" +
                "guide --> [usher, follow]\n" +
                "fond --> [enamored, averse]\n";

        assertEquals(expected, resultString);
//        System.out.println(resultString);



    }
}