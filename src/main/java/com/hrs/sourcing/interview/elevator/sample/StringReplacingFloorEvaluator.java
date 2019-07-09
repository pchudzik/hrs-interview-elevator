package com.hrs.sourcing.interview.elevator.sample;

import com.hrs.sourcing.interview.elevator.FloorEvaluator;

public class StringReplacingFloorEvaluator implements FloorEvaluator {

    @Override
    public int findFloorNumber(String floorExpression) {
        final int down = floorExpression.replace("(", "").length();
        final int up = floorExpression.replace(")", "").length();
        return up - down;
    }
}
