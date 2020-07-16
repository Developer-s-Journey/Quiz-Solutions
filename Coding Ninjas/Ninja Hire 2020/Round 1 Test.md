# Round 1 Test (Ninja Hire 2020)
## by Coding Ninjas

***All questions carry 10 Points each.***

1. Which of the following is incorrect?
- [ ] The number of edges in an MST(minimum spanning tree) is `N-1` where `N` is the number of vertices in the graph.
- [x] There is a unique MST for every undirected and connected graph. 
- [ ] We can find MST in `O(E(log(V))` using Kruskal’s algorithm.
- [ ] In every MST there is a unique path between any pair of the vertex `(u,v)`.

2. What is the output of the following pseudocode?
```cpp
for(int i=0;i<5;i++){
    int a=0;
    for(int j=0;j<4;j++){
        a++;
    }
}
print(a)
```
- [x] Error
- [ ] 20
- [ ] 4
- [ ] 1

3. Consider the following pseudocode?
```cpp
int fun(int a,int b ){ 
    if( !b ) return 1
    int ans= fun(a,b/2)
    ans=ans*ans
    if( b%2 ) ans=(ans * a)
    return ans
}
```
What is output for `fun(2,10)`?
- [ ] 20
- [ ] 12
- [x] 1024 
- [ ] 100

4. Which of the following is/are correct?
```
1) The worst-case time complexity of quicksort is O(n^2).
2) The time complexity of counting-sort is O(N + K) where N is the number of elements in the array and K is the maximum element in the array.
3) The time complexity of counting-sort is O(N*K) where N is the number of elements in the array and K is the maximum element of the array.
4) The space complexity of the counting-sort is O(K) where K is the maximum element of the array.
```
- [ ] 1,3,4
- [ ] 1,3
- [ ] 3,4
- [x] 1,2,4 

5. How many times `“coding ninja”` will be printed in the following code
```cpp
int t=5
while( t&1 ){
    print("coding ninja")
            t=t/2
}
```
- [ ] 5
- [ ] 3
- [ ] 4
- [x] 1

6. What is the time complexity of the below-written code?
```cpp
for(int i=1;i<=n;i++){
    for(int j=1;j*j<=i;j++){
        print("coding ninja is best")
    }
}
```
- [ ] n*(log(n))
- [x] n*sqrt(n) 
- [ ] n*n
- [ ] n

7. Minimum number of swaps required to sort the given array in increasing order.
```
array= { 6, 3, 4, 5, 2, 1 }
```
Swap means interchanging the position of two elements.
- [x] 4 
- [ ] 3
- [ ] 6
- [ ] 5

8. Which of the following is/are true for a sorted array
```
a) Using a sorted array, we can construct a balanced binary search tree at best in O(n*(log(n)) time.
b) Using a sorted array, we can construct a balanced binary search tree at best in O(n) time.
c) The array can be an inorder traversal of the binary search tree.
d) The array can be a preorder traversal of the binary search tree.
```
- [ ] a and c
- [x] b and c 
- [ ] a and d
- [ ] b and d

9. Which of the following are true for DAG (directed acyclic graphs )?
```
1) We can always find a topological sort in a DAG. 
2) DAG can’t have any strongly connected component in it.
3) We can find the shortest path from a given vertex to all other vertices in O(E+V) time complexity. (Note: Only the lengths of the paths, not the actual paths).
4) DAG can contain strongly connected components in it.
```
- [x] 1,2,3 
- [ ] 1,2
- [ ] 1,4
- [ ] 1,3,4

10. You are given two integers `a` and `b` such that `a>b` so which of the following is/are true.
```
1) gcd(a,b) and gcd( b,a%b) are equal.
2) gcd(b,a%b) and gcd (a,a-b) are equal 
3) gcd(a,b) and gcd ( a,a/b ) are equal
4) gcd(a,b) and gcd (a,b+a) are equal
```
- [x] 1,2 
- [ ] 1,3
- [ ] 1,4
- [ ] none of them

11. Which of the following is/are true about bipartite graph
```
1) Any tree is a bipartite graph.
2) The bipartite graph may contain an even length cycle.
3) If there is a cycle in a bipartite graph it must be of odd length.
4) Its chromatic number can be greater than 2.
```
- [ ] 1,2,4
- [x] 1,2 
- [ ] 1,3
- [ ] 2,4

12. Which of the following are always true for modulo operations

Note: modulo operation return the value between `[0,m-1]`
```
1) (a + b + c )%m is equal to ( a %m +b%m +c%m) for any a,b,c and m.
2) (a*b)%m is equal to ( (a%m)*(b%m) )%m for all a,b and m.
3) (a/b) %m is equal to ((a%m)/(b%m))%m for all a,b and m where a is a multiple of b.
4) ( a-b )%m is equal to (a%m - b%m ) %m for all a,b and m.
```
- [ ] 1,2,3,4
- [x] 2 
- [ ] 1,2,3
- [ ] 1,2

13. What is the output of the following pseudocode?

Note: `n` is always a non-negative integer
```cpp
int fun(int n){
    int ans=n
    if(n-1>=0){
        ans*=fun(n-1)
    }
    return ans
}
```
- [x] 0 
- [ ] Product of first n natural numbers
- [ ] Runtime error
- [ ] Garbage value

14. What is the output of the following pseudocode if we call `fun(6,80)`?
```cpp
int fun(int a,int b){
    if(a>=b) return ans+a
    else return ans+b
 }
```
- [ ] 6
- [ ] 86
- [x] Compilation error 
- [ ] Runtime error

15. You are given a complete undirected graph (every pair of the vertex is connected with an edge). Which of the following is /are true for that?
```
1) For this graph, the adjacency list and matrix representation will take the same amount of space (memory to store the graph).
2) Dijkstra algorithm for the shortest path will have better time complexity in list representation
3) Dijkstra algorithm for the shortest path will have a better complexity in matrix representation.
4) List representation has better space and time complexity than matrix representation for the Dijkstra algorithm.
```
- [x] 1,3 
- [ ] 1,2
- [ ] 2,4
- [ ] 3

16. How many times `“coding ninja”` will be printed in the following pseudocode.
```cpp
void fun(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++)
            print("coding ninja")
    }
}
```
- [ ] 0
- [ ] n
- [x] n*n 
- [ ] 1

17. What is the best time complexity of creating a max heap from an array of size `N`?
- [x] O(n) 
- [ ] O(n(log(n))
- [ ] O(n^2)
- [ ] O(n*(sqrt(n))

18. Which is the best algorithm in terms of time complexity to sort a string that contains only keyboard characters (ASCII value between 0 to 255)?
- [ ] Merge sort
- [ ] Selection sort
- [ ] Insertion sort
- [x] Counting sort 

19. What is the output of the following code?
Note: this is an actual function not a pseudo code
```cpp
int fun(int n){
    int a=n/2;
    int ans=0;
    for(int i=0;i<n;i++){
        while(a=n){
            ans++;
        }
    }
    return ans;
}
```
- [ ] 0
- [ ] n
- [ ] 2*n
- [x] Will never return any value 

20. You are given an array `arr={1,-2,3,4,5,6}`. What is the output of the following pseudocode?
```cpp
void fun(int arr[],int n){
    int dp[n]
    for(int i=0;i<n;i++)dp[i]=0
    dp[0]=arr[0]
    int ans=max(0,arr[0]);
    for(int i=1;i<n;i++){
        dp[i]=Max(dp[i-1]+arr[i],arr[i])
        ans=max(ans,dp[i])
    }
    print(ans);
}
```
`fun(arr,6)` output is ?
- [x] 18 
- [ ] 19
- [ ] 17
- [ ] 20

21. Which of the following is/are true about stacks?
```
1) Stack can be represented using an array
2) Stack can be represented using linked list
3) Both push and pop operations can be done in O(1) time in array representation.
4) Both push and pop operations can be done in O(1) time in linked list representation.
```
- [x] 1,2,3,4 
- [ ] 1,2
- [ ] 1,2,3
- [ ] 1,2,4

22. Which of the following is true about the binary search tree (BST)?
```
1) The worst-case time complexity for inserting and deletion of an element is O(n)
2) The inorder traversal of BST gives a sorted array.
3) The preorder traversal of BST gives a sorted array.
4) The worst time complexity for inserting and deleting an element from BST is O(log(n).
```
- [ ] 1,3
- [x] 1,2 
- [ ] 2,4
- [ ] 3,4

23. Which of the following is/are true about tree data structure?
```
1) The maximum number of leaves can be N-1.
2) The number of edges required is N
3) The number of edges required are N-1
4) The minimum number of leaves can be floor(N/2)
```
- [ ] 1,2
- [ ] 1,4
- [x] 1,3 
- [ ] 1,3,4

24. Runtime error can occur in which conditions?
```
1) When the syntax of the code is not correct.
2) If we try to access the element out of the array size 
3) When we divide by zero at some part in our code
4) If we use the same variable name for local and global variables.
```
- [x] 2,3 
- [ ] 1,2,3,4
- [ ] 2,3,4
- [ ] 1,4

25. Which of the following can be done using simple DFS of an undirected weighted graph.
```
1) To detect whether a cycle exists or not in the graph.
2) To check whether a bridge exists in the graph or not.
3) To find the shortest path from a given vertex to every other vertex.
4) To find the number of connected components in the graph.
```
- [x] 1,2,4 
- [ ] 1,2,3,4
- [ ] 1,4
- [ ] 1

26. Which of the following is/are true for a tree consisting of `N` vertices and `N-1` edges.
```
1) LCA (lowest common ancestor) is defined only for the rooted tree only.
2) If we know the LCA of two-nodes then the distance between them is (distance of u from root + distance of v from the root - 2*distance of LCA(u,v) from the root).
3) If we know the LCA of two-nodes the distance between them is ( Distance of u from root + distance of v from the root - distance of LCA(u,v) from the root ).
4) LCA can be defined for any general tree(can be unrooted).
```
- [ ] 1,3
- [ ] 2,4
- [x] 1,2 
- [ ] 3,4

27. Consider the following pseudocode for this questions
```cpp
int arr[n] //creating an array of n size and its values are all 0
for(int i=1;i<n;i++){
    for(int j=i;j<n;j+=i){
        arr[j]++;
    }
}
```
What is the time complexity of the above code?
- [x] n*(log(n) 
- [ ] n*(sqrt(n)
- [ ] n*n
- [ ] n

28. Consider the following pseudocode for this questions
```cpp
int arr[n] //creating an array of n size and its values are all 0
for(int i=1;i<n;i++){
    for(int j=i;j<n;j+=i){
        arr[j]++;
    }
}
```
What does the above code do?
- [ ] It's making the value of arr[i] for each i from 1 to N equal to N.
- [ ] arr[i] denotes the number of factors of I but excluding itself (i) and includes 1.
- [ ] arr[i] denotes the number of factors of I but excluding both itself (i) and 1.
- [x] arr[i] denotes the number of factors of I and this includes both itself (i) and 1.

29. What does the below pseudocode do?
```cpp
int fun(int a , int b){
    if (b<=0) return 0
    else return a+fun(a,b-1)
}
```
- [ ] a+b
- [ ] a+b*a
- [ ] a*a+b
- [x] a*b

30. Which of the following is/are true?
```
1) The adjacency list representation of a sparse graph is more memory-optimized than the adjacency matrix representation.
2) It’s better to use matrix representation for the complete graph if we want to find the MST of the given graph.
3) It’s better to use the adjacency list representation for the complete graph if we want to find the MST of the given graph.
4) The matrix representation of the graph is more memory-optimized than the list representation for a sparse graph.
```
- [x] 1,2 
- [ ] 1,3
- [ ] 4,3
- [ ] 4