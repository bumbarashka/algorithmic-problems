package by.bogdan.leetcode;

import java.util.*;

/**
 * Solution for https://leetcode.com/problems/freedom-trail
 */
public class Solution514 {
    // DP solution
    public int findRotateSteps(String ring, String key) {
        // TODO: implement me
        assert false;
        return 0;
    }

    // Recursive with memoization solution;
    public int findRotateSteps2(String ring, String key) {
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
        return getMinSteps(ring.length(), characterPositions, 0, key, 0, new HashMap<>());
    }

    private int getMinSteps(Integer length, Map<Character, List<Integer>> characterPositions, Integer position, String key, int keyPosition, Map<Integer, Integer> results) {
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
            Integer result = 1 + Math.min(distance, length - distance) + getMinSteps(length, characterPositions, newPosition, key, keyPosition + 1, results);
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
