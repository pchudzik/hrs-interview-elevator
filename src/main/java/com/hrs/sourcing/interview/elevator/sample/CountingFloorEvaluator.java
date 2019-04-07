package com.hrs.sourcing.interview.elevator.sample;

import com.hrs.sourcing.interview.elevator.FloorEvaluator;

public class CountingFloorEvaluator implements FloorEvaluator {
    @Override
    public int findFloorNumber(String floorExpression) {
        int start = 0;
        for (char ch : floorExpression.toCharArray()) {
            if (ch == '(') {
                start += 1;
            } else {
                start -= 1;
            }
        }
        return start;
    }
}
