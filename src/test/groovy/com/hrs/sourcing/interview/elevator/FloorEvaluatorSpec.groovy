package com.hrs.sourcing.interview.elevator


import spock.lang.Specification

class FloorEvaluatorSpec extends Specification {
    FloorEvaluator floorEvaluator = null

    def "evaluates ground floor"() {
        expect:
        floorEvaluator.findFloorNumber(expression) == 0

        where:
        expression << ["(())", "()()"]
    }

    def "evaluates third floor"() {
        expect:
        floorEvaluator.findFloorNumber(expression) == 3

        where:
        expression << ["(((", "(()(()(", "))((((("]
    }

    def "first basement level"() {
        expect:
        floorEvaluator.findFloorNumber(expression) == -1

        where:
        expression << ["())", "))("]
    }

    def "third basement level"() {
        expect:
        floorEvaluator.findFloorNumber(expression) == -3

        where:
        expression << [")))", ")())())"]
    }
}
