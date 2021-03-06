# Challenge Summary
Implement a simplified LEFT JOIN for 2 Hashmaps.

## Challenge Description
* Write a function that LEFT JOINs two hashmaps into a single data structure.
* The first parameter is a hashmap that has word strings as keys, and a synonym of the key as values.
* The second parameter is a hashmap that has word strings as keys, and antonyms of the key as values.
* Combine the key and corresponding values (if they exist) into a new data structure according to LEFT JOIN logic.
* LEFT JOIN means all the values in the first hashmap are returned, and if values exist in the “right” hashmap, they are appended to the result row. If no values exist in the right hashmap, then some flavor of NULL should be appended to the result row.
* The returned data structure that holds the results is up to you. It doesn’t need to exactly match the output below, so long as it achieves the LEFT JOIN logic.
* Avoid utilizing any of the library methods available to your language.

## Approach & Efficiency
![Whiteboard](https://github.com/leepj85/data-structures-and-algorithms/blob/master/code401challenges/assets/left_join.JPG)

## Solution
[Source Code](https://github.com/leepj85/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/hashtable/LeftJoin.java)

[Test Code](https://github.com/leepj85/data-structures-and-algorithms/blob/master/code401challenges/src/test/java/code401challenges/hashtable/LeftJoinTest.java)
