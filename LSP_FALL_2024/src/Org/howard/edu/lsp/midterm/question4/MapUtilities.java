package Org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;
import java.util.Map;

public class MapUtilities {
	public static int commonKeyValuePairs(
			HashMap<String, String> map1,
            HashMap<String, String> map2) {

        if (map1.isEmpty() || map2.isEmpty()) {
            return 0; // Return 0 if either map is empty
        }

        int count = 0;
        for (Map.Entry<String, String> entry1 : map1.entrySet()) {
            if (map2.containsKey(entry1.getKey()) &&
                    map2.get(entry1.getKey()).equals(entry1.getValue())) {
                count++;
            }
        }
        return count;
    }
}