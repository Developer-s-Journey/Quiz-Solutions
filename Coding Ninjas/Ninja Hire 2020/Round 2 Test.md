# Round 2 Test (Ninja Hire 2020)
## by Coding Ninjas

***All questions carry 40 Points each.***

### **Modulo product**

1. Ninja got an easy assignment from his professor but he is unable to solve this. So he needs your help to complete the assignment.
In the assignment, he is given two integers `A` and `B` and he needs to output the product of all numbers from `1` to `A` modulo `B`, where `1` and `A` are inclusive.
For example, if `A=5` and `B=7`, the answer will be `( 1 * 2 * 3 * 4 * 5 ) % 7 = 1` so the final answer is `1`.

**Input Format:**
```
The first line of input will contain an integer T, that denote the number of test cases.
Every test case will consist of one single line and that line will contain two integers: A and B.
```
**Constraints:**
```
1<=T<=50
1<=A<=10^9
1<=B<=10^5
Time Limit: 1 second
```
**Output format:**
```
For every test case, print the output in a newline.
```
**Sample Input 1**
```
4
8 10
5 140
18 19
20 21
```
**Sample Output 1:**
```
0
120
18
0
```

***[Solution](https://github.com/Developer-s-Journey/Test-Solutions/blob/master/Coding%20Ninjas/Ninja%20Hire%202020/round_2_solution_1_Modulo_product.cpp)***

***All questions carry 80 Points each.***

### **Maximum Subarray of Ones**

2. Ninja was playing with a binary array. In his version, he has to delete any two consecutive elements once. He will only win if he can find the maximum length possible of non-empty subarray of only `1’s`, after the deleting any two consecutive elements once. If he is unable to find such a subarray, he has to return zero. He needs your help in winning this game. Can you solve it?

**Input format**
```
The first line of input contains an integer, that denotes the value of number of test cases. Let us denote it by the symbol t. 
Each of the following t test cases has two lines. The first line of each test case contains an integer, that denotes length of binary array. Let us denote the length of the array by N. The following line of each test case contains N space separated integers that denote the value of the elements of the binary array. 
```
**Constraints**
```
The value of t lies in the range: [1, 10]
The value of N lies in the range: [2, 100,000]
The elements of the binary array can either be 0 or 1.
Time Limit: 1 second
```
**Output format**
```
For each test case, the first and only line of output contains the length of the longest non-empty subarray of only 1’s, after deleting any two consecutive elements once.    
```
**Sample Input 1**
```
3
5
1 1 1 0 0
5
0 0 0 0 0
8
1 1 1  0 0 0 0 1
```
**Sample Output 1**
```
3
0
3   
```
**Explanation**
```
For the first test case: The maximum length subarray, as described in the task, is [1,1,1] and it can be formed by deleting the last two consecutive elements.     
For the second test case: Since, there is no 1 in this binary array, so it is impossible to form a non-empty subarray of all ones. Hence, the answer is zero.
For the third test case: The maximum length subarray, as described in the task, is [1,1,1] and it can be formed by deleting the two consecutive elements at fourth and fifth position.      
```

***[Solution](https://github.com/Developer-s-Journey/Test-Solutions/blob/master/Coding%20Ninjas/Ninja%20Hire%202020/round_2_solution_2_Maximum_Subarray_of_Ones.java)***

### **Form the Greatest String 1**

3. Ninja is playing with his alphabet toys. He has all the `26` lowercase alphabets. His granny wanted him to learn some maths as well.
So, she added a cost with each of the alphabets, gave him a cost array and gave him an integer. Let us denote the integer by symbol target. She asks Ninja to find the greatest word (with or without meaning) under the following constraints:
```
1. The cost array is 0 indexed and cost of using alphabet at index i is given by cost[i] (Note: ‘a’ is denoted by index 0, ‘b’ is denoted by index 1 and so on)
2. The total expenditure of characters used must be equal to target. 
```
You have to help Ninja to print the greatest word. If you are unable to form any word, under the given constraints, then print `“0”`.

*Note:* If two words are given to you, then the greater of the two will be the one which comes later in the dictionary. For example, `“hi”` is greater than `“hello”`.

**Input format:**
```
The first line of input contains 26 space separated integers. The first integer denotes the cost of selecting ‘a’, the second integer denotes the cost of selecting ‘b’ and so on. The following line contains an integer, that denotes the value of the target.
```
**Constraints:**
```
The length of the cost array is exactly equal to 26.
The value of cost[i] lies in the range: [1, 10000].
The value of the target lies in the range: [1, 10000].
Time Limit: 1 second
```
**Output format:**
```
Print the greatest word under the given constraints. Print “0”, if you are unable to form any word.
Sample Input 1:
4 3 2 5 6 7 2 5 5 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
9
```
**Sample Output 1:**
```
igg
Sample Input 2:
14 13 12 15 16 17 12 15 15 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
9
```
**Sample Output 2:**
```
0
```

***[Solution](https://github.com/Developer-s-Journey/Test-Solutions/blob/master/Coding%20Ninjas/Ninja%20Hire%202020/round_2_solution_3_Form_the_Greatest_String_1.cpp)***

***All questions carry 120 Points each.***

### **Prefix Suffix Queries**

4. Ninja has got a string `S`. He also has two toys: Prefix and Suffix. Toy prefix creates a prefix string out of the given input string and toy suffix creates a suffix string out of the given input string.
For each query string, it can be either prefix or suffix of `S`, Ninja wants to find out the count of distinct occurrences of the string `“ninjas”` as a subsequence in the query string. Since Ninja is busy playing with his prefix and suffix toys, therefore, you have to solve this problem.

**Input Format:**
```
The first line of input contains a string S. The following line of input contains a number of queries. Let the number of queries be denoted by Q. 
Each of the following Q lines contains a character and an integer. The character can either be ‘p’ or ‘s’. ‘p’ denotes that it is a prefix and ‘s’ denotes that it is a suffix. The integer denotes the number of characters of string S involved as prefix or suffix. For example: Let’s suppose that S= “namastefromninjas” and the query is p 8. This denotes that the query string is a prefix of length 8 of the given string S, i.e. “namastef”. Similarly, for query: s 6, the query string will be “ninjas”.
```
**Constraints:**
```
The length of string S will lie in the range: [7, 6000].
All the characters of the string S will be lowercase letters.
The value of Q will lie in the range: [1, 50].
The character in each query will either be ‘p’ or ‘s’.
The integer in each query will lie in the range: [1, length of S].
Time Limit: 1 second
```
**Output Format:**
```
For each query, you have to print the count of distinct occurrences of the string “ninjas” as a subsequence in the query string. 
```
**Sample Input 1:**
```
namasteninjas
3
p 8
s 10
```
**Sample Output 1:**
```
0
1
```
**Explanation:**
```
For the first query, the query string will be: “namasten”. Since there are no subsequences that will be same as “ninjas”, hence answer to this query is zero.
For the second query, the query string will be: “asterninjas”. There is one subsequences which is exactly same as “ninjas”. Those subsequences will be formed by characters
1. 5 6 7 8 9 10
```
**Sample Input 2:**
```
ninjasninjas
1
p 12
```
**Sample Output 2:**
```
9
```
**Explanation:**
```
The query string for query “p 12” will be: ninjasninjas. Assuming the first character has position 1, the second character has position 2 and so on, then the following nine subsequences of query strings are same as “ninjas” (here the characters are represented by their positions):
1. 1 2 3 4 5 6
2. 1 2 3 4 5 12 
3. 1 2 3 4 11 12
4. 1 2 3 10 11 12
5. 1 2 7 10 11 12
6. 1 2 9 10 11 12
7. 1 8 9 10 11 12
8. 3 8 9 10 11 12
9. 7 8 9 10 11 12
```

***[Solution](https://github.com/Developer-s-Journey/Test-Solutions/blob/master/Coding%20Ninjas/Ninja%20Hire%202020/round_2_solution_4_Prefix_Suffix_Queries.java)***