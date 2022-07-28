package com.epam.rd.autotasks.max;

import java.util.OptionalInt;

public class MaxMethod {
    public static OptionalInt max(int[] values) {
        int max;
        OptionalInt maxVal;
        if (values != null && values.length > 0) {
            max = values[0];
            for (int value : values)
                if (max < value)
                    max = value;
            maxVal = OptionalInt.of(max);
        } else {
            maxVal = OptionalInt.empty();
        }
        return maxVal;
    }
}
