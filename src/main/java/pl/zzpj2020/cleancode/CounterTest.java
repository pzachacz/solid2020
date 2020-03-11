package pl.zzpj2020.cleancode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CounterTest {

    @Test
    public void shouldSetMaxValueTo4() {
        List<Integer> integerList = List.of(1, 2, 3, 4);
        Counter counter = new Counter(integerList);

        int maxValue = counter.getMaxValue();
        final int expectedMaxValue = 4;

        assertEquals(expectedMaxValue, maxValue);
    }

    @Test
    public void shouldSetMinValueTo1() {
        List<Integer> integerList = List.of(1, 2, 3, 4);
        Counter counter = new Counter(integerList);

        int minValue = counter.getMinValue();
        final int expectedMinValue = 1;

        assertEquals(expectedMinValue, minValue);
    }

    @Test
    public void shouldReturnExpectedOccurrencesValue() {
        List<Integer> integerList = List.of(1, 2, 3);
        Counter counter = new Counter(integerList);

        final int occurrencesOf1 = counter.getOccurrences(1);
        final int occurrencesOf2 = counter.getOccurrences(2);
        final int occurrencesOf3 = counter.getOccurrences(3);

        final int expectedOccurrences = 1;

        assertEquals(expectedOccurrences, occurrencesOf1);
        assertEquals(expectedOccurrences, occurrencesOf2);
        assertEquals(expectedOccurrences, occurrencesOf3);
    }

}