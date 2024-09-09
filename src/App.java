public class App {
    int aux = 0;
    int target = 0;

    public static void main(String[] args) throws Exception {

        String genericResponse = " faz parte da sequência de Fibonacci";

        int target = 5;

        var res = Fibonacci(target) ? target + genericResponse : target + " não" + genericResponse;

        System.out.println(res);
        
    }

    public static boolean Fibonacci(int number) {

        int currentNumber = 0;
        int next = 1;

        if (number < 0) {
            return false;
        } 

        while (currentNumber < number) {
            int aux = currentNumber;
            currentNumber = next;
            next = aux + next;
        }
        return currentNumber == number;
    }
}
