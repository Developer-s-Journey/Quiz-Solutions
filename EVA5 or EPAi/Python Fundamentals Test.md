# Python Fundamentals Test
## by THE SCHOOL OF AI

***Small fun Quiz with no marks***

1. Are booleans actually integers in Python? <br/>Or,<br/>what would this return: isinstance(True, int)
- [x] True
- [ ] Fasle
- [ ] No Idea

**<ins>Explanation</ins>** : In Python, Booleans are a subtype of Integers, which means that **isinstance(True, int)** returns **True**

2. Lists and strings are **mutable** in Python.<br/>Can we change the contents of a **list** or **string** variable?
- [ ] 😳 I don't know what is mutable or immutable
- [ ] No, both lists and strings are immutable
- [x] No, lists are mutable, but strings are immutable
- [ ] No, strings are mutable, but lists are immutable
- [ ] Yes, lists and strings are mutable

**<ins>Explanation</ins>** : Integers, floats, **strings**, tuples, bools, and frozensets, all are immutable objects!<br/>Byte arrays, **lists**, sets, and dictionaries are mutable objects.

3. What will be the output of the following Python Code?
```py
def myFunc(k):
    k = [0]
m = [1]
myFunc(m)
print(m)
```
- [ ] `[0]`
- [x] `[1]`
- [ ] `[0, 1]`
- [ ] `[1, 0]`

**<ins>Explanation</ins>** : The answer is `[1]`. A new list object is created in the function and the reference is lost.

4. What will be the output of the following Python Code?
```py
def myFunc(k):
    k[0] = 6
m = [1]
myFunc(m)
print(m)
```
- [ ] `[1]`
- [x] `[6]`
- [ ] `[1, 6]`
- [ ] `[6, 1]`

**<ins>Explanation</ins>** : The answer this time is `[6]`!<br/>Python uses a mechanism, which is known as **"Call-by-Object"**, sometimes also called **"Call by Object Reference"** or **"Call by Sharing"**

If you pass immutable arguments like integers, strings or tuples to a function, the passing acts like **Call-by-value**. It's different, if we pass mutable arguments.

All **parameters (arguments)** in the Python language are **passed by reference**. It means if you change what a parameter refers to within a function, the change also reflects back in the calling function.

5. What will be the output of the following Python code?
```py
>>> m = 'abc'
>>> n = 'abc'
>>> id(m) == id(n)
```
- [x] True
- [ ] False

**<ins>Explanation</ins>** : It is True! We are seeing something called **String Interning** here.

id(m) **is** equal to id(n)

**String interning** is the method of caching particular strings in memory as they are instantiated. The idea is that, since strings in Python are immutable objects, only one instance of a particular string is needed at a time. So both m and n are pointing to the same memory address.

6. **Python is an “interpreted” language.**<br/>***This means it uses an interpreter. An interpreter is very different from the compiler. An interpreter executes the statements of code “one-by-one” whereas the compiler executes the code entirely and lists all possible errors at a time.***<br/><br/>So, will the code below throw an error? 
```py
def func1():
    return func2()
```
In our code, we will never define func2 and never call func1.
- [ ] Yes, it will throw an error
- [x] Nopes! No error!

**<ins>Explanation</ins>** : No error! 😑

TLDR; only when **func1()** is called, Python's interpreter will evaluate the value it is returning. Since we never called **func1**, **func2** was never evaluated and Python never realized that it isn't defined!

7. Will this code ever print "I was executed"?
```py
a = 0
b = 2
while a < 4:
    a += 1
    b -= 1
    try:
        a/b
    except ZeroDivisionError:
        print('Division by {0}, {1}'.format(a, b))
        break
    finally:
        print('This alway executes')
    print("in main loop")
else:
    print("I was executed")
```
- [ ] Yes, it does.
- [x] No, it doesn't.
- [ ] While Loop does not support else clause

**<ins>Explanation</ins>** : No, it will never print "I was executed".

You see that **break** condition in the code! That will make it skip the else condition for the while loop. 

Did you know about the **while-loop-else** clause? 

😎 Cool right!

8. How many times this code prints "This always executes"?
```py
a = 0
b = 2
while a < 4:
    a += 1
    b -= 1
    try:
        a/b
    except ZeroDivisionError:
        print('Division by {0}, {1}'.format(a, b))
        break
    finally:
        print('This alway executes')
    print("in main loop")
else:
    print("I was executed")
```
- [ ] Once, as break condition takes it out of the loop completely.
- [x] Twice, because "This always executes"!

**<ins>Explanation</ins>** : You can't skip finally! It will always get executed in Python even if you have a break statement in there!

9. 
```py
>>> a = 256
>>> b = 256
>>> a is b
```
- [x] True
- [ ] False

**<ins>Explanation</ins>** : a **is** b

**Integer Interning**

Any time an integer is referenced, Python will use the cached version of that object. Therefore if we create two or more variables and assign to them the same integer value, Python stores that number in memory only once and assigns the reference of that memory location to those variables.

10. 
```py
>>> a = 257
>>> b = 257
>>> a is b
```
- [ ] True
- [x] False

**<ins>Explanation</ins>** : Integer Interning works only for the integers in the range **-5 to 256** (inclusive).

11. 
```py
>>> a = 10
>>> b = int(10)
>>> c = int('10')
>>> d = int('1010', 2)
>>> print(a is b is c is d)
```
This prints True or False?
- [x] True
- [ ]False

**<ins>Explanation</ins>** : They all are the same!

`c = int('10')` here we casted string to int<br/>`d = int('1010', 2)` here we cased 1010 to int, but told python to consider the contents of the strings as binary!

12. 
```py
>>> m = (13)%(-4)
>>> n = (-13)%(4)
```
m and n are equal to?
- [ ] -3 and -3, respectively.
- [x] -3 and 3, respectively.
- [ ] 3 and -3, respectively.
- [ ] 3 and 3, respectively.

**<ins>Explanation</ins>** : No again! Unlike C or C++, Python's modulo operator (%) always returns a number with the same sign as the denominator (divisor).

TLDR;
(13)/(- 4) = -3.25 = (-13)/4 and floor(-3.25) = -4

**Take note of the sign of the denominator.**

(13)%(- 4) = (-4x4 + 3)%4 = 3x(-1)= **-3**

(-13)%(4) = (-4x4 + 3)%4 = 3x(+1) = **3**

13. 
```py
math.floor(-3.0000000000000001) == math.floor(-3.000000000000001)
```
This evaluates to?
- [ ] True, obviously!
- [x] False

**<ins>Explanation</ins>** : `math.floor(-3.0000000000000001) = -3`, and `math.floor(-3.000000000000001) = -4`

that is the inbuilt python rounding off coming into the picture. If you work in the financial domain and are using python floats, you may need to **panic** now!

14. 
```py
>>> a = 0.1
>>> b = 0.4
>>> c = 0.3
>>> d = b - c
>>> print(a == d)
```
this prints True or False?
- [ ] True
- [ ] False

**<ins>Explanation</ins>** : Again, these are floats we are dealing with. 

In Python (or any other language for that matter), it is very hard to represent fractions. 

There is a slight difference between **d** and **a**, **1.734723475976807e-18** to be precise (on my machine!).

15. `a = 10, b = 20`

Can we swap the values of a and b without using any 3rd variable?
- [x] Yes
- [ ] No

**<ins>Explanation</ins>** : Just do this:
```py
>>> a, b = b, a
```
🤩 Python rocks!

TLDR; The right side is actually evaluated and stored someplace, and then later used for the left side evaluation.

16. Does this throw any error?
```py
>>> d = {'a': 1, 'b': 2, 'c': 3, 'd': 4}
>>> a, b, c, d = d
```
- [ ] Yes
- [x] No

**<ins>Explanation</ins>** : The right side is evaluated and stored someplace, so the contents of d are already extracted and then unpacked into a, b, c and d.

17. What would be **d** here?
```py
a, *b, (c, *d) = [1, 2, 3, 'python']
```
- [ ] This throws an error!
- [ ] 'ython'
- [ ] python
- [ ] `['p', 'y', 't', 'h', 'o', 'n']`
- [x] `['y', 't', 'h', 'o', 'n']`

**<ins>Explanation</ins>** : Unpacking at work!

There is no TLDR here, so read this when you get time: [Unpacking in Python: Beyond Parallel Assignment](https://stackabuse.com/unpacking-in-python-beyond-parallel-assignment/#:~:text=Unpacking%20in%20Python%20refers%20to,the%20iterable%20unpacking%20operator%2C%20*%20.) Right click and open in a new tab!

18. 
```py
>>> result = [str(number)+direction for number, direction in zip(range(1, 11), 'NSWE'*3)]
>>> print(result[3])
```
This prints?

- [ ] No clue!
- [x] I know, but I won't tell you!

**<ins>Explanation</ins>** : **`'4E'`**

So a lot going on here. Let's break it down.
```py
>>> 'NSWE'*3 
```
this will print **NSWENSWENSWE** and range(1, 11), you know already. 
```py
>>> zip(range(1, 11), 'NSWE'*3)
```
this has just zipped numbers from 1 to 10 with NSWENSWENSWE. 

So, the zip object above contains: **`[(1, 'N'), (2, 'S'), (3, 'W'), (4, 'E'), (5, 'N'), (6, 'S'), (7, 'W'), (8, 'E'), (9, 'N'), (10, 'S')]`**
```py
[str(number)+direction for number, direction in zip(range(1, 11), 'NSWE'*3)]
```
is called **List Comprehension**. See an example below:
```py
>>> h_letters = [ letter for letter in 'human' ]
>>> print( h_letters)
```
this prints **`['h', 'u', 'm', 'a', 'n']`**

Now, since our zip object stores tuples, we can **unpack** it into variables **number** and **direction**. `str(number)` casts the integer into a **string** so we can add it to the character. 

If you were to print **result** you'd get **`['1N', '2S', '3W', '4E', '5N', '6S', '7W', '8E', '9N', '10S']`**

Hence result[3] is **`'4E'`**

19. **`{1, 2, 3} == {3, 2, 1}`**
True or False?
- [x] True
- [ ] False

**<ins>Explanation</ins>** : As of Python 3.6, for the CPython implementation of Python, dictionaries remember the order of items inserted. But that order is not used for equality check!

20. Consider this
```py
def rstr(myStr):
    length = len(myStr)
    for i in range(length - 1, -1, -1):
        yield myStr[i]
res = rstr('hello')
next(res)
```
What is the output of the code above?
- [ ] Generator Object
- [ ] 'h'
- [ ] 'e'
- [x] 'o'

**<ins>Explanation</ins>** : We just saw a Generator Function. We can call **next** on **res** till it exhausts and gives us *StopIteration* exception.

In the function we are running a loop to reverse the passed string, but as soon as we execute **yield**, the function is paused and the control is transferred to the caller till the next time we call **`next(res)`**.

## **Python is incredible.**

Control over the language (programming in our context) is extremely important. It helps us express and execute our ideas. 

If you have spent or planning to spend a lot of time on deep learning, don't forget that unless you have control over Python, you'll not be able to unlock your true potential. 

Python is a beautiful and deep language. Spend some time to relish its beauty!

## **What next?**

If you skimmed through the questions without any trouble then you're already doing awesome. 😀 Stay awesome and teach others!!

If you had trouble, or wish to learn irrespective, 😁 then spend next month or two to learn about below listed things. Go slow, but make sure to spend at least 30 minutes every day. 

- [ ] Variable and memory references
- [ ] reference counting
- [ ] dynamic typing
- [ ] object mutability
- [ ] "everything is an object in Python"
- [ ] Interning
- [ ] float rounding
- [ ] decimals and fractions
- [ ] lambda expression
- [ ] map/filter/zip and list comprehensions
- [ ] partial functions
- [ ] memoization
- [ ] docstrings
- [ ] fstrings
- [ ] iterables and iterators
- [ ] yielding and generator functions
- [ ] context managers
- [ ] coroutines
- [ ] decorators
- [ ] data pipelines
- [ ] hash maps
- [ ] python sets
- [ ] serialization
- [ ] property decorators in Classes
- [ ] class and static methods
- [ ] methods vs functions
- [ ] overriding and extending inheritance
- [ ] descriptors
- [ ] strong and weak references
- [ ] creating custom exceptions
- [ ] dataclasses.

You can fork this repo and mark the topics you have completed to track you progress.

Best of Luck 👍