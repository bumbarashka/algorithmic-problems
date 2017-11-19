package by.bogdan.leetcode;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.TreeMap;

/**
 * Given a chemical formula (given as a string), return the count of each atom.
 * <p>
 * An atomic element always starts with an uppercase character, then zero or more lowercase letters, representing the name.
 * <p>
 * 1 or more digits representing the count of that element may follow if the count is greater than 1. If the count is 1,no digits will follow. For example, H2O and H2O2 are possible, but H1O2 is impossible.
 * <p>
 * Two formulas concatenated together produce another formula. For example, H2O2He3Mg4 is also a formula.
 * <p>
 * A formula placed in parentheses, and a count (optionally added) is also a formula. For example, (H2O2) and (H2O2)3 are formulas.
 * <p>
 * Given a formula, output the count of all elements as a string in the following form: the first name (in sorted order), followed by its count (if that count is more than 1), followed by the second name (in sorted order), followed by its count (if that count is more than 1), and so on.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * formula = "H2O"
 * Output: "H2O"
 * Explanation:
 * The count of elements are {'H': 2, 'O': 1}.
 * <p>
 * Example 2:
 * <p>
 * Input:
 * formula = "Mg(OH)2"
 * Output: "H2MgO2"
 * Explanation:
 * The count of elements are {'H': 2, 'Mg': 1, 'O': 2}.
 * <p>
 * Example 3:
 * <p>
 * Input:
 * formula = "K4(ON(SO3)2)2"
 * Output: "K4N2O14S4"
 * Explanation:
 * The count of elements are {'K': 4, 'N': 2, 'O': 14, 'S': 4}.
 * <p>
 * Note:
 * All atom names consist of lowercase letters, except for the first character which is uppercase.
 * The length of formula will be in the range [1, 1000].
 * formula will only consist of letters, digits, and round parentheses, and is a valid formula as defined in the problem.
 *
 * @see <a href="https://leetcode.com/problems/number-of-atoms/description/">726. Number of Atoms (on leetcode.com)</a>
 */
public class Solution726 {

    /**
     * Time Complexity: O(N)​​), where N is the length of the formula.
     * <p>
     * Space Complexity: O(N)
     *
     * @param formula
     * @return
     */
    public String countOfAtoms(String formula) {
        char[] characters = formula.toCharArray();
        int i = characters.length - 1;

        Deque<Integer> multipliers = new ArrayDeque<>();
        multipliers.push(1);
        int multiplier = 1;

        Map<String, Integer> elementToNumber = new TreeMap<>();

        Integer nextDigitTimes = 1;
        Integer startedNumber = null;
        StringBuilder startedElement = null;
        while (i >= 0) {
            char character = characters[i];
            switch (character) {
                case '(':
                    multiplier = multiplier / multipliers.pop();
                    break;
                case ')':
                    if (startedNumber == null) {
                        multipliers.push(1);
                    } else {
                        multipliers.push(startedNumber);
                        multiplier *= startedNumber;
                        startedNumber = null;
                        nextDigitTimes = 1;
                    }
                    break;
                default:
                    if (Character.isDigit(character)) {
                        if (startedNumber == null) {
                            startedNumber = 0;
                        }
                        startedNumber += nextDigitTimes * Character.getNumericValue(character);
                        nextDigitTimes *= 10;
                    } else if (Character.isUpperCase(character)) {
                        Integer number = multiplier;
                        if (startedNumber != null) {
                            number = multiplier * startedNumber;
                        }
                        String element;
                        if (startedElement == null) {
                            element = String.valueOf(character);
                        } else {
                            startedElement.append(character);
                            element = startedElement.reverse().toString();
                        }
                        elementToNumber.put(element, elementToNumber.getOrDefault(element, 0) + number);

                        startedElement = null;
                        startedNumber = null;
                        nextDigitTimes = 1;
                    } else {
                        if (startedElement == null) {
                            startedElement = new StringBuilder();
                        }
                        startedElement.append(character);
                    }
                    break;
            }
            i--;
        }
        StringBuilder result = new StringBuilder();
        elementToNumber.forEach((key, value) -> {
            result.append(key);
            if (value > 1) {
                result.append(value);
            }
        });
        return result.toString();
    }
}
