# Project ALG_On_Euler461

The below is BASED on Euler problem 461. HOWEVER, the specifics things you need to submit
differ, as we will use this exercise to explore the O(n) subject.

Euler 461: 
https://projecteuler.net/problem=461

Let f_n(k) = e^(k/n)-1. for all non-negative integers k.
Remarkably, f_200(6) + f_200(75) + f_200(89) + f_200(226) = 3.141592644529… ≈ π.

In fact, it is the best approximation of PI of the form f_n(a) + f_n(b) + f_n(c) + f_n(d) for n = 200.

Let g(n) = a^2 + b^2 + c^2 + d^2 for a, b, c, d that minimize the error: 
| fn(a) + fn(b) + fn(c) + fn(d) - PI|
(where |x| denotes the absolute value of x).

You are given g(200) = 6^2 + 75^2 + 89^2 + 226^2 = 64658.

Find g(10000).  <== (you do not need to do this right away. See below)

---

1. Fill in the code in the file Euler461.java. All the places are denoted by ToDo.

I would highly recommend to try the 'test' utility to check your individual functions.


Some expected results to test your code:
n=10 ==>  12,6,0,0  g=180
n=20 ==>  19,13,7,4 g=595
n=50 ==>  46,44,10,0 g=4152

2. By changing the array nVals in Main, calculate the time required for the following
values of n:
n=10,20,30,40,50,100,200,300

===> You will need to submit the screen-shot of running these.

3. Using desmos (or other tool), graph the above values, and find the best match polynomial
(with lowest degree). Should probably be something like 
t=  ___ *n^4 + ___

====> You will need to submit this graph as a screen shot.
