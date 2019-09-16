package code401challenges.repeatedword;

public class RepeatedWord {

    int[] hashArray = new int[1024];

    public String findWord(String str) {
        String[] words = str.split(" ");

        for (String element : words) {
            String word = element.toLowerCase().replace(",", "").replace(".", "");
            int index = hash(word);

            if (hashArray[index] == 0) {
                hashArray[index] = 1;
            } else {
                return word;
            }
        }
        return "No repeated words were in that String input.";
    }

    private int hash(String key) {
        int hashValue = 0;
        char[] letters = key.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            hashValue += letters[i];
        }
        hashValue = (hashValue * 599) % hashArray.length;
        return hashValue;
    }

}
