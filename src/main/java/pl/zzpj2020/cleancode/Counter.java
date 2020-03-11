package pl.zzpj2020.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Counter {

    Map<Integer, Integer> map = new HashMap<>();
    private int minValue = Integer.MAX_VALUE;
    private int maxValue = Integer.MIN_VALUE;

    Counter(List<Integer> integerList) {
        countOccurrencesForEveryValueInList(integerList);
    }

    private void countOccurrencesForEveryValueInList(List<Integer> integerList) {
        for (Integer integer : integerList) {
            countOccurrencesForEachValue(integer);
        }
    }

    private void countOccurrencesForEachValue(Integer value) {
        if (map.containsKey(value)) {
            Integer counter = map.get(value);
            map.put(value, counter + 1);
        } else {
            map.put(value, 1);
        }

        setMinValue(value);

        setMaxValue(value);
    }

    private void setMaxValue(Integer value) {
        if (value > maxValue) {
            maxValue = value;
        }
    }

    private void setMinValue(Integer value) {
        if (value < minValue) {
            minValue = value;
        }
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getOccurrences(Integer value) {
        return map.getOrDefault(value, 0);
    }
}