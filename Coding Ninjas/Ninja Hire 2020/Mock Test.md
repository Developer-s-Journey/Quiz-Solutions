# Mock Test (Ninja Hire 2020)
## by Coding Ninjas

***All questions carry 20 Points each.***

### **What will be the output?**
1. What will be the output:
```cpp
#include<iostream> 
using namespace std; 
void fun(int *ptr) {
    *ptr = 30;
}
int main() {
    int y = 20;
    fun(&y);
    cout<<y++ + 10<<endl;
    return 0;
}
```
- [ ] 41
- [ ] 20
- [x] 40 
- [ ] 30
- [ ] 31

2. What will be the output:
```cpp
#include <iostream>
using namespace std;
int main()
{
    float arr[5] = {12.5, 10.0, 13.5, 90.5, 0.5};
    float *ptr1 = &arr[0];
    float *ptr2 = ptr1 + 3;
    cout<<*ptr2<<” ”;
    cout<<ptr2 - ptr1<<endl;
    return 0;
}
```
- [x] 90.5 3 
- [ ] 90.5 12
- [ ] 10.0 12
- [ ] 0.5 3

3. What will be the output of following piece of code:
```cpp
#include <iostream>
using namespace std;
int main()
{
    static int i=5;
    if(--i) {
        main();
        cout<<i<<" ";
    }
}
```
- [ ] 4 3 2 1
- [x] 0 0 0 0 
- [ ] 1 2 3 4
- [ ] Compiler Error

***All questions carry 10 Points each.***

### **What will be the output for following piece of code?**
4. Code:
```cpp
#include<iostream>
using namespace std; 
class Item{
private:
    static int count;
public:
    Item(){
        count++;
    }
    int getCount(){
        return count;
    }
    int* getCountAddress(){
        int* p=&count;
        return p;
    }
};
int Item::count=0;
int main(){
    Item objItem1;
    Item objItem2;
    cout<<objItem1.getCount()<<' ';
    cout<<objItem2.getCount()<<' ';
}
```
- [ ] 0 0
- [ ] 3 3
- [x] 2 2 
- [ ] None of these

5. Code:
```cpp
#include<iostream>
using namespace std;
class staticFunction{
    static int count;
public:
    static void setCount(){
        count++;
    }
    void displayCount(){
        cout<<count;
    }
};
int staticFunction::count=10;
int main(){
    staticFunction obj1;
    obj1.setCount();
    staticFunction::setCount();
    obj1.displayCount();
    return 0;
}
```
- [ ] 14
- [ ] 10
- [x] 12 
- [ ] None of these

6. Code:
```cpp
#include<iostream>
using namespace std;
class Room;
void Area(){
    int width, height;
    class Room{
        int width, height;
    public:
        void setValue(int w, int h){
            width=w;
            height=h;
        }
        void displayValues(){
            cout<<(float)width<<' '<<(float)height;
        }
    };
    Room objRoom1;
    objRoom1.setValue(12, 8);
    objRoom1.displayValues();
}
int main(){
    Area();
}
```
- [x] 12 8 
- [ ] 14 6
- [ ] 15 5
- [ ] None of these

***All questions carry 20 Points each.***

### **What will be the output?**
7. What will be the output of following piece of code:
```cpp
#include <stdio.h>
int main()
{
    int i = 0;
    switch (i)
    {
        case '0': printf("Hey!");
            break;
        case '1': printf("Aman");
            break;
        default: printf("How are you?");
    }
    return 0;
} 
```
- [ ] Hey!
- [ ] Aman
- [x] How are you? 
- [ ] Compile-Time Error

8. Predict the output for following code?
```cpp
#include <iostream>
using namespace std;
class Test
{
    static int x;
public:
    Test() { x++; }
    static int getX() {return x;}
};
int Test::x = 0;
int main()
{
    cout << Test::getX() << " ";
    Test t[5];
    cout << Test::getX();
}
```
- [ ] 0 0
- [ ] 5 5
- [x] 0 5 
- [ ] Compile Error

***Solution Description:***
Initially, before any object of the class Test has been created, the value of x is 0. So the first cout statement will print 0. 
Before the next cout, an array of 5 objects of class Test is created, which means that the default constructor is get called 5 times, increasing the value of x from 0 to 5.

9. Predict the output for following code?
```cpp
#include <iostream>
using namespace std;
class Player
{
private:
    int id;
    static int next_id;
public:
    int getID() { return id; }
    Player()  {  id = next_id++; }
};
int Player::next_id = 1;
int main()
{
  Player p1;
  Player p2;
  Player p3;
  cout << p1.getID() << " ";
  cout << p2.getID() << " ";
  cout << p3.getID();
  return 0;
}
```
- [ ] Compilation Error
- [x] 1 2 3 
- [ ] 1 1 1
- [ ] 3 3 3
- [ ] 0 0 0

***Solution Description:***
When we declare a member of a class as static, it doesn't matter how many objects we create, there will only be one copy of the static member. A static member is shared by all objects of the class. Hence the value of next_id increases by 1 for every invocation of the constructor which is responsible for the increment.

10. Predict the output for following code?
```cpp
#include <iostream>
using namespace std;
int main()
{
    char array[3] = "abc";
    cout << array;  
    return 0;
}
```
- [x] Error 
- [ ] abc
- [ ] a
- [ ] None of these

***Solution Description:***
Character arrays have the last element as NULL (\0) element. ie. each character array will have one reserve element. So in case one wants to save a string of 3 character a character array of 4 elements will be required. One may also use, 
char *arr = “abc”

11. Predict the output for following code?
```cpp
#include <iostream>
using namespace std;
int main()
{
    cout << sizeof('x');
    cout << sizeof(char);   
    return 0;
}
```
- [ ] 1 4
- [ ] 2 4
- [x] 1 1 
- [ ] None of these

***Solution Description:***
‘Sizeof’ returns the size in bytes of the data passed in the function. In both the case of char and x, the answer is 1 byte.

12. Predict the output of following C++ program
```cpp
#include<iostream>
using namespace std;
class Empty {};
int main()
{
  cout << sizeof(Empty);
  return 0;
}
```
- [x] A non-zero value 
- [ ] 0
- [ ] Compiler Error
- [ ] Runtime Error

***Solution Description:***
Size of an empty class is generally 1 byte. It is nonzero to ensure that any two different objects don’t have save addresses.

13. Predict the output of following C++ program
```cpp
class Test {
    int x;
};
int main()
{
  Test t;
  cout << t.x;
  return 0;
}
```
- [ ] 0
- [ ] Garbage Value
- [x] Compiler Error 
- [ ] None of these

***Solution Description:***
By default the members of any class are under the private access specifier. Hence accessing ‘x’ ( a private member) from outside the class will result in error.

### **Choose the correct option**
14. Which of the following are TRUE:

A. calloc() takes two arguments, but malloc takes only 1 argument.

B. malloc() and memset() can be used to get the same effect as calloc().

C. alloc() allocates the memory and also initializes the allocates memory to zero, while memory allocated using malloc() has random data.

D. Both malloc() and calloc() return 'void *' pointer.

E. All of the above
- [x] E 
- [ ] D
- [ ] C
- [ ] B
- [ ] A

15. What will be the size of the object of the following class:
```cpp
 // Assume that integers take 4 bytes. 
 #include<iostream> 
 using namespace std; 
 class Test 
 { 
      static int i; 
      int j; 
 }; 
 int Test::i; 
 int main() 
 { 
      cout << sizeof(Test); 
      return 0; 
 } 
```
- [x] 4 bytes 
- [ ] 8 bytes
- [ ] 12 bytes
- [ ] None of these

***Solution Description:***
Static variables are properties of the class. They do not belong to objects.

16. For n=5, this code snippet print asterisks in 5 rows. How many asterisks will be there in third row of output:
```cpp
    int nsp=2;
    int nst=1;
    for(int i=1; i<=n; i++) {
        for(int j=1; j<=nsp; j++) {
            System.out.print(" ");
        }
        for(int j=1; j<=nst; j++) {
            System.out.print("*");
        }
        System.out.println();
        if(i<(n/2+1)) {
            nsp--;
            nst=nst+2;
        }else {
            nsp++;
            nst=nst-2;
        }
    }
```
- [ ] 4
- [x] 5 
- [ ] 3
- [ ] None of these

17. For n=5, following code snippet prints 5 rows. In each row, this code prints some spaces and some numbers. How many spaces does this code snippet prints for fourth row:
```cpp
    int sp=2, st=1;
    for(int i=1; i<=n; i++) {
        for(int j=1; j<=sp; j++) {
            System.out.print(" ");
        }
        int val=i;
        if(i> n/2) {
            val=n+1-i;
        }
        for(int j=1; j<=st; j++) {
            System.out.print(val);
            if(j<=st/2)
                val++;
            else
                val--;

        }
        System.out.println();
        if(i<(n/2 +1)) {
            st+=2;
            sp--;
        }else {
            st-=2;
            sp++;
        }
    }
```
- [x] 1 
- [ ] 2
- [ ] 0
- [ ] None of these

18. For n=5, following code snippet prints 5 rows. In each row, this code prints some spaces and some numbers. How many digits does this code snippet prints in fourth row:
```cpp
    int sp=2, st=1;
    for(int i=1; i<=n; i++) {
        for(int j=1; j<=sp; j++) {
            System.out.print(" ");
        }
        int val=i;
        if(i> n/2) {
            val=n+1-i;
        }
        for(int j=1; j<=st; j++) {
            System.out.print(val);
            if(j<=st/2)
                val++;
            else
                val--;

        }
        System.out.println();
        if(i<(n/2 +1)) {
            st+=2;
            sp--;
        }else {
            st-=2;
            sp++;
        }
    }
```
- [ ] 1
- [ ] 2
- [x] 3
- [ ] None of these

***This question carry 10 Points.***

19. Assume that an integer and a pointer each takes 4 bytes. Also, assume that there is no alignment in objects. Predict the output following program.
```cpp
#include<iostream>
using namespace std;
class Test
{
    static int x;
    int *ptr;
    int y;
};
int main()
{
    Test t;
    cout << sizeof(t) << " ";
    cout << sizeof(Test *);
}
```
- [ ] 12 4
- [ ] 12 12
- [x] 8 4 
- [ ] 8 8

***Solution Description:***
sizeof(t) will not include the size of static int x as static data members are not part of the objects of a class. While sizeof(Test*) will be 4 bytes as all pointers acquire the sizeof(int).

***All questions carry 20 Points each.***

### **Choose the correct statement**
20. Which of the following is true?
- [ ] Static methods cannot be overloaded.
- [ ] Static data members can only be accessed by static methods.
- [ ] Non-static data members can be accessed by static methods.
- [x] Static methods can only access static members (data and methods) 

21. What is the difference between struct and class in C++?
- [ ] All members of a structure are public and structures don't have constructors and destructors
- [x] Members of a class are private by default and members of struct are public by default. When deriving a struct from a class/struct, default access-specifier for a base class/struct is public and when deriving a class, default access specifier is private. 
- [ ] All members of a structure are public and structures don't have virtual functions
- [ ] All of the above

22. Which of the following is true?
- [ ] All objects of a class share all data members of class
- [ ] Objects of a class do not share non-static members. Every object has its own copy. 
- [ ] Objects of a class do not share codes of non-static methods, they have their own copy
- [ ] None of the above

***All questions carry 10 Points each.***

### **Find out the error in following piece of code?**
23. Code:
```cpp
#include<iostream>
class Room{
    int width;
    int length;
  void setValue(int w, int l){
    width=w;
    length=l;
  }
};
int main(){
  Room objRoom;
  objRoom.width = 12;   
  return 0;
}
```
- [x] int Room::width is declared with private access specifier. 
- [ ] main should be declared void
- [ ] Both of these
- [ ] None of these

24. Code:
```cpp
#include<iostream>
  struct Room{
    int width;
    int length;
  void setValue(int w, int l){
    width=w;
    length=l;
  }
};
int main(){
  Room objRoom;
  objRoom.setValue(12, 1, 4);   
  return 0;
}
```
- [x] No matching fucntion for call to Room::setValue(int, int, int) 
- [ ] Access Specifier of setValue function is private.
- [ ] Both of these
- [ ] None of these

***All questions carry 20 Points each.***

### ***Compare C functions***
25. Consider the following three C functions:
```cpp
[P1] int * g (void) { 
    int x= 10; 
    return (&x); 
} 
[P2] int * g (void) { 
    int * px; 
    *px= 10; 
    return px; 
} 
[P3] int *g (void) { 
    int *px; 
    px = (int *) malloc (sizeof(int)); 
    *px= 10; 
    return px;  
}
```
Which of the above three functions are likely to cause problems with pointers?
- [ ] Only P3
- [ ] Only P1 and P3
- [x] Only P1 and P2 
- [ ] Only P2 and P3
- [ ] None of them

### **Inline functions**
26. Inline functions are useful when ______
- [ ] Function is large with many nested loops
- [ ] Function has many static variables
- [x] Function is small and we want to avoid function call overhead. 
- [ ] None of the above

***Solution Description:***
Inline functions are used to reduce the function call overhead. Inline function is a function that is expanded in line when it is called.

### **Default arguments**
27. Which of the following statement is correct?
- [ ] Only one parameter of a function can be a default parameter.
- [ ] Minimum one parameter of a function must be a default parameter.
- [x] All the parameters of a function can be default parameters. 
- [ ] No parameter of a function can be default.

### **What is the output**
28. 
```cpp
#include <iostream>
using namespace std;
int main(){
    int p = 5;
    int const *q = &p;
    p++;
    cout << p << endl;
    return 0;
}
```
- [ ] Error
- [ ] 5
- [x] 6 
- [ ] None

***Solution Description:***
Value of p can be increased or decreased as it is not a const value.

29. What is the output of the following program ?
```cpp
#include <iostream>
using namespace std;
int main(){
    int  const  p = 5;
    cout << ++p;
    return 0;
}
```
- [ ] 5
- [ ] 6
- [x] Error 
- [ ] Garbage

***Solution Description:***
Values of constant variables cannot be altered

30. What is the output of the following program ?
```cpp
#include<iostream>
using namespace std;

int getValue(int x = 0, int y = 0, int z){  
    return (x + y + z); 
}

int main(){
   cout << getValue(10);
   return 0;
}
```
- [ ] 10
- [ ] 0
- [ ] 20
- [x] Compilation Error 

***Solution Description:***
Default parameters must be added last in C++ functions

***All questions carry 40 Points each.***

### **Pattern: Closed Box**

31. Print the given pattern for the given number of rows.
**Pattern for N=4**
```
####
*  *
*  *
####
```
**Input format:**
```
N (Total number of rows).
```
Constraints:
```
N lies between [3,40]
```
**Output format:**
```
Pattern in N lines
```
**Sample Input 1:**
```
5
```
**Sample Output 1:**
```
#####
*   *
*   *
*   *
#####
```

***[Solution](https://github.com/Developer-s-Journey/Test-Solutions/blob/master/Coding%20Ninjas/Ninja%20Hire%202020/solution_31.cpp)***

### **F7 Championship**

32. The fictional World Championship of Formula 7 Drivers 2019 was characterized by exciting races and frequent shifts of driver positions on the leaderboard. Pradeep has missed most of it because he was training for olympiads in informatics. Now, looking at the leaderboard, Pradeep has a simple question for you: "How many drivers participating in this Championship still had a chance to become Formula 7 World Champion at the start of the final race?” The World Champion is, of course, the driver with the largest point total at the end (after the final race).
There are N drivers participating in the Championship. They are all assigned points after each race, including the final one. The winner of the race is awarded N points, the runner-up gets N - 1 points, and so on until the last driver, who gets 1 point. Two drivers cannot finish a race in the same spot.
Write a program to calculate, based on the total number of points that each driver has earned before the final race, how many drivers still have a chance to have the largest total after the final race and thus win the Championship. If more than one driver has the same maximum point total, they are all awarded the World Champion title

**Input Format:**
```
The first line of input contains the positive integer N, the number of drivers participating in the Championship.
Each of the following N lines contains a single integer Bi, the number of points that a driver has before the final race.
```
**Constraints:**
```
3 ≤ N ≤ 300000
0 ≤ Bi ≤ 2000000 (i = 1, ..., N)
```
**Output Format:**
```
The first and only line of output should contain the requested number of drivers that can still win
```
**Sample Input 1:**
```
3
8
10
9 
```
**Sample Output 1:**
```
3
```
**Sample Input 2:**
```
5
15
14
15
12
14
```
**Sample Output 2:**
```
4
```

***[Solution](https://github.com/Developer-s-Journey/Test-Solutions/blob/master/Coding%20Ninjas/Ninja%20Hire%202020/solution_32.cpp)***