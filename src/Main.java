/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Tiger Du
*****************************************************************************************************
*/


public class Main {
    public static void main(String[] args) {
        int result1 = add(3,8);
        System.out.print(result1);
        int result2 = add(3,8,4,9);
        System.out.print(" " + result2);
        String S1 = afternoonGreeting("Mac Miller");
        System.out.println(S1);
        String S2 = morningGreeting("Toby Fox");
        System.out.println(S2);
        String S3 = triple("oohbaby");
        System.out.println(S3);
        double result3 = half(19);
        System.out.println(result3);
        int round = roundPositiveValueToNearestInteger(8.5);
        System.out.println(round);
        int round2 = roundPositiveValueToNearestInteger(8.49);
        System.out.println(round2);
        int round3 = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(round3);
        int round4 = roundNegativeValueToNearestInteger(-8.49);
        System.out.println(round4);
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    public static String morningGreeting(String a) {
        return "早上好, " + a + "!";
    }
    public static String afternoonGreeting(String b) {
        return "下午好, " + b + "!";
    }
    public static String triple(String c) {
        return c + c + c;
    }
    public static double half(int e) {
        return (double) e / 2.0;
    }
    public static int roundPositiveValueToNearestInteger(double a) {
        return (int) (a + 0.5);
    }
    public static int roundNegativeValueToNearestInteger(double b) {
        return (int) (b - 0.5);
    }
}
