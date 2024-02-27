package comp_programming;

public class SwapTwoNumberWithoutUsingThirdVarAndArithmeticOpera {
    public static void swapTwoNumbersWithThirdVariable(int a, int b){
        System.out.println("before swapping a:"+a+"b:"+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping a:"+a+"b:"+b);
    }

    public static void swapTwoNumbersWithArithmeticOperator(int a, int b){
        System.out.println("before swapping a:"+a+"b:"+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("after swapping a:"+a+"b:"+b);
    }

    public static void swapTwoNumbersWithBitwiseOperator(int a, int b){
        System.out.println("before swapping a:"+a+"b:"+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("after swapping a:"+a+"b:"+b);
    }

    public static void main(String[] args) {
        swapTwoNumbersWithThirdVariable(2,7);
        swapTwoNumbersWithArithmeticOperator(5,15);
        swapTwoNumbersWithBitwiseOperator(5,10);
    }
}
