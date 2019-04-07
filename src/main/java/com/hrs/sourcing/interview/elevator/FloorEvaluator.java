package com.hrs.sourcing.interview.elevator;

/**
 * <p>
 * You are trying to get to your room  in a large apartment building, but you can't find the right floor - the directions
 * given by a clerk are a little confusing. You start on the ground floor (floor 0) and then follows the instructions
 * one character at a time.
 *
 * <p>
 * An opening parenthesis, (, means he should go up one floor,
 * and a closing parenthesis, ), means he should go down one floor.
 *
 * <p>
 * The apartment building is very tall, and the basement is very deep; he will never find the top or bottom floors.
 *
 * <p>
 * For example:
 * <ul>
 * <li>(()) and ()() both result in floor 0.</li>
 * <li>((( and (()(()( both result in floor 3.</li>
 * <li>))((((( also results in floor 3.</li>
 * <li>()) and ))( both result in floor -1 (the first basement level).</li>
 * <li>))) and )())()) both result in floor -3.</li>
 * </ul>
 *
 * <p>
 * On what floor is your room?
 */
public interface FloorEvaluator {
    int findFloorNumber(String floorExpression);
}
