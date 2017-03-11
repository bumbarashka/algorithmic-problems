package by.bogdan.leetcode;

import java.util.*;

/**
 * Solution for 'Freedom Trail' algorithmic problem.
 * @see <a href="https://leetcode.com/problems/freedom-trail">514. Freedom Trail (on leetcode.com)</a>
 */
public class Solution514 {
    /**
     * Solution using dynamic programming. O(n * m) efficiency and O(n * m) memory usage where <code>n = ring.length()</code>
     * and <code>m = key.length()</code>
     * @param ring
     *          a string, which represents the code engraved on the outer ring
     * @param key
     *          string key, which represents the keyword needs to be spelled
     * @return the minimum number of steps in order to spell all the characters in the keyword
     */
    public int findRotateSteps(String ring, String key) {
        int ringLength = ring.length();
        int keyLength = key.length();
        int[][] dp = new int[keyLength + 1][ringLength];
        Map<Character, List<Integer>> characterPositions = getCharacterPositions(ring);
        for (int i = keyLength - 1; i >= 0; i--) {
            char keyChar = key.charAt(i);
            for (int j = 0; j < ring.length(); j++) {
                int minSteps = Integer.MAX_VALUE;
                for(Integer pos: characterPositions.get(keyChar)) {
                    int steps = Math.abs(pos - j);
                    steps = Math.min(steps, ringLength - steps) + dp[i + 1][pos];
                    if (steps < minSteps) {
                        minSteps = steps;
                    }
                }
                dp[i][j] = minSteps;
            }
        }
        return dp[0][0] + keyLength;
    }

    /**
     * Recursive solution with memoization. O(n * m) efficiency and O(n * m) memory usage where <code>n = ring.length()</code>
     * and <code>m = key.length()</code>
     * @param ring
     *          a string, which represents the code engraved on the outer ring
     * @param key
     *          string key, which represents the keyword needs to be spelled
     * @return the minimum number of steps in order to spell all the characters in the keyword
     */
    public int findRotateSteps2(String ring, String key) {
        Map<Character, List<Integer>> characterPositions = getCharacterPositions(ring);
        return getMinSteps(ring.length(), characterPositions, 0, key, 0, new HashMap<>());
    }

    private Map<Character, List<Integer>> getCharacterPositions(String ring) {
        Map<Character, List<Integer>> characterPositions = new HashMap<>();
        for (int i = 0; i < ring.length(); i++) {
            Character c = ring.charAt(i);
            List<Integer> positions = characterPositions.get(c);
            if (positions == null) {
                positions = new ArrayList<>();
                characterPositions.put(c, positions);
            }
            positions.add(i);
        }
        return characterPositions;
    }

    private int getMinSteps(Integer length, Map<Character, List<Integer>> characterPositions, Integer position,
                            String key, int keyPosition, Map<Integer, Integer> results) {
        Integer resultKey = position * 100 + keyPosition;
        if (results.containsKey(resultKey)) {
            return results.get(resultKey);
        }
        if (keyPosition == key.length()) {
            return 0;
        }
        List<Integer> positions = characterPositions.get(key.charAt(keyPosition));
        if (positions.size() == 1) {
            Integer newPosition = positions.get(0);
            Integer distance = Math.abs(position - newPosition);
            Integer result = 1 + Math.min(distance, length - distance)
                    + getMinSteps(length, characterPositions, newPosition, key, keyPosition + 1, results);
            results.put(resultKey, result);
            return result;
        } else {
            Integer searchResult = Collections.binarySearch(positions, position);
            if (searchResult < 0) {
                searchResult = -searchResult - 1;
            } else if (position == positions.get(searchResult)) {
                Integer result = 1 + getMinSteps(length, characterPositions, position, key, keyPosition + 1, results);
                results.put(resultKey, result);
                return result;
            }
            Integer positionLeft;
            if (searchResult == 0) {
                positionLeft = positions.get(positions.size() - 1);
            } else {
                positionLeft = positions.get(searchResult - 1);
            }
            Integer positionRight;
            if (searchResult == positions.size()) {
                positionRight = positions.get(0);
            } else {
                positionRight = positions.get(searchResult);
            }
            Integer distanceLeft = Math.abs(position - positionLeft);
            Integer distanceRight = Math.abs(position - positionRight);
            Integer result = 1 + Math.min(Math.min(distanceLeft, length - distanceLeft) + getMinSteps(length, characterPositions, positionLeft, key, keyPosition + 1, results),
                    Math.min(distanceRight, length - distanceRight) + getMinSteps(length, characterPositions, positionRight, key, keyPosition + 1, results));
            results.put(resultKey, result);
            return result;
        }
    }
}
