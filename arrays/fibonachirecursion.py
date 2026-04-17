def fibonacci(n):
    """Return the nth Fibonacci number using recursion."""
    if n < 0:
        raise ValueError("n must be a non-negative integer")
    if n == 0:
        return 0
    if n == 1:
        return 1
    return fibonacci(n - 1) + fibonacci(n - 2)


if __name__ == "__main__":
    n = 10
    print(f"The {n}th Fibonacci number is: {fibonacci(n)}")
