# Project ALG_On_Euler461

Euler 461: 
https://projecteuler.net/problem=461

Let f_n(k) = e^(k/n)-1. for all non-negative integers k.
Remarkably, f_200(6) + f_200(75) + f_200(89) + f_200(226) = 3.141592644529… ≈ π.

In fact, it is the best approximation of PI of the form f_n(a) + f_n(b) + f_n(c) + f_n(d) for n = 200.

Let g(n) = a^2 + b^2 + c^2 + d^2 for a, b, c, d that minimize the error: 
| fn(a) + fn(b) + fn(c) + fn(d) - PI|
(where |x| denotes the absolute value of x).

You are given g(200) = 6^2 + 75^2 + 89^2 + 226^2 = 64658.

Find g(10000).

---

Graph: https://www.desmos.com/calculator/mxrytxgtf8

Timing:

Using Naive algorithm:

n=10 	==>	 t=0
n=20 	==>	 t=1
n=30 	==>	 t=8
n=40 	==>	 t=26
n=50 	==>	 t=67
n=100 	==>	 t=1104
n=200 	==>	 t=17745
n=300 	==>	 t=90123

Doing best fit in desmos, gives us
t = 0.0000111262 n^4  - 9.01

n=10000  ==> ?!? 

Using faster scheme:
n=10 	==>	 t=0
n=20 	==>	 t=0
n=30 	==>	 t=0
n=40 	==>	 t=0
n=50 	==>	 t=0
n=100 	==>	 t=4
n=200 	==>	 t=18
n=300 	==>	 t=12
n=1000 	==>	 t=65
n=10000 	==>	 t=6957

Perfect y= ... n^2 + ...
