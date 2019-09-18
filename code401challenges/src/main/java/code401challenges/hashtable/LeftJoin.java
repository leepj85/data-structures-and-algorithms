package code401challenges.hashtable;

import java.util.ArrayList;
import java.util.HashMap;

public class LeftJoin {

    public static HashMap<String, String[]> leftJoin(HashMap<String, String> synonyms, HashMap<String, String> antonyms) {
        HashMap<String, String[]> results = new HashMap<>();

        for (String key : synonyms.keySet()) {
            String[] values = new String[]{synonyms.get(key), null};
            results.put(key, values);
        }

        if(!synonyms.isEmpty() && !antonyms.isEmpty()) {
            for(String key : antonyms.keySet()){
                if(synonyms.containsKey(key)){
                    String[] values = new String[]{synonyms.get(key), antonyms.get(key)};
                    results.put(key, values);
                }
            }
        }
        return results;
    }
}
