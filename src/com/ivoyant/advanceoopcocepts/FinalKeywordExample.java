package com.ivoyant.advanceoopcocepts;

final class FinalExample { //Final class cannot be extended to subclass
    final int Max_VALUE = 20; //Final variable cannot be reinitialized

    final void add() { //Final method cannot be overridden by subclass
        System.out.println(10 + 20);
    }
}

public class FinalKeywordExample {
    public static void main(String[] args) {

        FinalExample finalExample = new FinalExample();
        System.out.println(finalExample.Max_VALUE);

        finalExample.add();

    }
}
