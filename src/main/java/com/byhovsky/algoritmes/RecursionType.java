package com.byhovsky.algoritmes;

/**
 * Recursion function(factorial)
 *
 * @author Denis Byhovsky
 */
public class RecursionType {

    int calculateFactorial(int n) {
        int result;
        if (n == 1)
            return 1;
        result = calculateFactorial(n - 1) * n;
        return result;
    }
}
