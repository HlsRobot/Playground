package ransom;

import java.util.HashMap;
import java.util.Map;

public class MagazineRansomService {

    public boolean checkIfRansomIsInMagazine(final String magazine, final String ransom) {
        final Map<Character, Integer> magazineMap = this.createMap(magazine);
        for (char character : ransom.toCharArray()) {
            if (magazineMap.containsKey(character) && magazineMap.get(character) > 0) {
                magazineMap.merge(character, 1, Integer::min);
            } else {
                return false;
            }
        }
        return true;
    }

    private HashMap<Character, Integer> createMap(final String magazine) {

        final HashMap<Character, Integer> map = new HashMap<>();
        for (char character : magazine.toCharArray()) {
            map.merge(character, 1, Integer::sum);
        }
        return map;
    }
}