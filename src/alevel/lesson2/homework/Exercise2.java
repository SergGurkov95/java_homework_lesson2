package alevel.lesson2.homework;

public class Exercise2 {

    public static void main(String args[]) {

        double firstNumber = 38.13597;
        double secondNumber = -37.38599;
        double thirdNumber = -28.1234;
        double printResult;
        double firstNumberMod;
        double secondNumberMod;
        double thirdNumberMod;

        firstNumberMod = (firstNumber >= 0) ? firstNumber : -firstNumber;
        secondNumberMod = (secondNumber >= 0) ? secondNumber : -secondNumber;
        thirdNumberMod = (thirdNumber >= 0) ? thirdNumber : -thirdNumber;

        if (firstNumberMod < secondNumberMod) {
            if (firstNumberMod < thirdNumberMod) {
                printResult = firstNumber;
            } else
                printResult = thirdNumber;
        } else if (secondNumberMod < thirdNumberMod) {
            printResult = secondNumber;
        } else
            printResult = thirdNumber;

        System.out.println(printResult);
    }
}
