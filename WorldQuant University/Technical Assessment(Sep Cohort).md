# Technical Assessment for Introduction to Data Science module(July Cohort)
## by WorldQuant University

1. Let `f(w) = 2w^3 - 5`. What is `f(4)`?

    Substituting `w = 4` in `f(w) = 2w^3 - 5` we get, `f(4) = 2(4^3) - 5 = 123`

2. Let `f(w) = 2w^3 - 5`. Let `z = 2`. What is `f(z)`?

    Replacing `w` by `z` in `f(w) = 2w^3 - 5` we get, `f(z) = 2z^3 - 5`

    Now, substituting `z = 2` in `f(z) = 2z^3 - 5` we get, `f(w) = 2(2^3) - 5 = 11`
    
3. Let `g(x) = cos(x/2) - 3x`. Let `f(x) = 2x + 5`. What is `g(f(x))`?
- [x] `cos(x + 5/2) - 6x - 15`
- [ ] `cos(x/2) - 6x - 15`
- [ ] `cos(x/2) - 15x`
- [ ] `6x + 15cos(x/2)`

4. Let `f(x) = tan(x) - 2/x`. Let `g(x) = x^2 + 8`. What is `f(x)*g(y)`?
- [ ] `(x^2 + 8)tan(x) - 2x - 16/x`
- [ ] `2x/y + 8tan(y)`
- [x] `-16/x - 2y^2/x + (8 + y^2)tan(x)`
- [ ] `tan(x) + 2y - 16x`

5. What is the derivative of `x^2 - x + 3` at the point `x = 5`?

    Differentiating `x^2 - x + 3` we get, `2x - 1`

    Now, substituting `x = 5` in `2x - 1` we get, `2(5) - 1 = 9`

6. What is the value of `x` where `x^2 - x + 3` is a minimum?

    For `x^2 - x + 3` to be minimum, it's derivative should be `0`

    We have to find the value of `x` at which the derivative will be `0`

    So, differentiating `x^2 - x + 3` we get, `2x - 1`

    Now, equating `2x - 1` to `0` we get, `x = 1/2 or 0.5`

7. In Python, what is returned when evaluating
```py
[n for n in range(10) if n % 2]
```

A list of odd numbers from `0` upto `10` excluding `10` i.e., `[1, 3, 5, 7, 9]`
    
8. In Python, what kind of error is returned by the following code? (e.g. NameError, ValueError, IOError, etc.) 
```py
def my_func(n1, n2): return n1 + n2 my_func(1, 2, 3)
```

`TypeError`. Due to the difference in number of arguments in function definition and function call.

9. What is returned by 
```py
datetime(1970, 1, 1).strftime('%Y-%d-%B')
```
in Python?

A string. `'1970-01-January'`


