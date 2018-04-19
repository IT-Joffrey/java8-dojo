package exercice1;

import org.junit.Test;

import exercice1.LambdaExamples;
import exercice1.LambdaExamplesSolved;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.function.*;

public class LambdaExamplesTest {

    @Test
    public void should_add_one_to_value() {
        //Given
        Integer value = 1;

        Function<Integer, Integer> function = LambdaExamples.plusOneFunction();

        //When //Then
        assertEquals((Integer)2, function.apply(value));
    }

    @Test
    public void should_return_true_if_number_is_pair() {
        // Given
        Predicate<Integer> predicate = LambdaExamples.pairNumberPredicate();

        // When Then
        assertTrue(predicate.test(2));
        assertTrue(predicate.test(4));

        assertFalse(predicate.test(1));
        assertFalse(predicate.test(5));
    }

    @Test
    public void should_increment_int_array_values() {
        // Given
        int[] values = {1, 2, 3, 4, 5};
        int[] returnValues = {2, 3, 4, 5, 6};

        Consumer<int[]> consumer = LambdaExamples.incrementArrayValueConsumer();

        // When
        consumer.accept(values);

        // Then
        assertArrayEquals(values, returnValues);
    }

    @Test
    public void should_return_day_of_month() {
        // When
        Supplier<Integer> supplier = LambdaExamples.todaySupplier();

        // Then
        assertEquals((int)supplier.get(), Calendar.getInstance().get(Calendar.DAY_OF_MONTH));        
    }

    @Test
    public void should_contact_values() {
        // Given
        String name = "Java";
        Integer version = 8;

        BiFunction<String, Integer, String> function = LambdaExamples.concatAsStringFunction();

        // when
        String result = function.apply(name, version);

        // Then
        assertEquals(result, "Java 8");
    }

    @Test
    public void should_sum_values() {
        // Given
        Integer firstNumber = 3;
        Integer secondNumber = 4;

        BinaryOperator<Integer> function = LambdaExamples.sumFunction();

        // When
        Integer result = function.apply(firstNumber, secondNumber);

        // Then
        assertEquals((int)result, 7);
    }

    @Test
    public void should_add_string_to_list() {
        // Given
        List<String> list = new ArrayList<>();
        Consumer<String> consumer = LambdaExamplesSolved.addToListConsumer(list);

        // When
        consumer.accept("abc");
        consumer.accept("def");
        consumer.accept("ghi");

        // Then
        assertEquals(list, Arrays.asList(new String[]{"abc", "def", "ghi"}));
    }

    @Test
    public void should_convert_string_to_big_decimal() {
        // Given
        String value = "1.246";

        // When
        BigDecimal result = LambdaExamples.stringToBiDecimalFunction().apply(value);

        // Then
        assertEquals(result, BigDecimal.valueOf(1.246));
    }

    @Test
    public void should_compare_by_string_size() {
        // Given
        String[] value = {"a", "bcde", "fg", "h", "ijklmn"};

        // When
        Arrays.sort(value, LambdaExamples.byStringLengthComparator());

        // Then
        assertEquals(value, new String[]{"a", "h", "fg", "bcde", "ijklmn"});
    }
}