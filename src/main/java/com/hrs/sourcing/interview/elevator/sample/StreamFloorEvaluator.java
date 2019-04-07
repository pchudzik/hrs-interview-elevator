package com.hrs.sourcing.interview.elevator.sample;

import com.hrs.sourcing.interview.elevator.FloorEvaluator;

public class StreamFloorEvaluator implements FloorEvaluator {
    @Override
    public int findFloorNumber(String floorExpression) {
        return floorExpression.chars()
                .map(this::resolveFloor)
                .sum();

    }

    private int resolveFloor(int floorCharacter) {
        return ((char) floorCharacter) == '(' ? 1 : -1;
    }
}
