package com.example.quickMaths;

public class Series {

    private int userNum;

    public Series(){

    }

    public int sumOfNumbers(int n){
        if(n < 0){
            return -1;
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += i;
        }

        return sum;
    }

    public int factorial(int n){
        if(n <= 0){
            return -1;
        }
        int product = 1;
        for(int i = 1; i < n; i++){
            product *= i;
        }

        return product;
    }

    public int fibonacci(int n){
        if(n <= 1) {
            return n;
        }else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
