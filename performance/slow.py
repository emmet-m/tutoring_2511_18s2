#!/usr/bin/env python3

def fib(n):
    if (n <= 0): return 0
    if (n == 1): return 1

    return fib(n-1) + fib(n-2)

i = int(input("Enter a number: "))

print(fib(i))
