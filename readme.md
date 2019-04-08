# Interview coding task

You are trying to get to your room  in a large apartment building, but you can't find the right
floor - the directions given by a clerk are a little confusing. You start on the ground floor (floor
0) and then follows the instructions one character at a time.

An opening parenthesis `(` means you should go up one floor, and a closing parenthesis `)` means you
should go down one floor.

The apartment building is very tall, and the basement is very deep. You will never find the top or
bottom floors.

For example:

* (()) and ()() both result in floor 0.
* ((( and (()(()( both result in floor 3.
* ))((((( also results in floor 3.
* ()) and ))( both result in floor -1 (the first basement level).
* ))) and )())()) both result in floor -3.
 
On what floor is your room?

Inspired by [adventofcode.com](https://adventofcode.com/2015/day/1)
