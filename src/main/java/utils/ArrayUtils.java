package utils;

import java.util.Arrays;

public class ArrayUtils {
    public <T> void print(T[] array) {
        String output = Arrays.stream(array)
                .collect(StringBuilder::new, (x, y) -> x.append(y).append(" "), StringBuilder::append)
                .toString()
                .trim();

        System.out.println(output);
    }
}
