package AdditionalPractice;

public class FibTailRec {

    public static void main(String[] args) {
        int result = fibTailRec(7, 1, 1, 1);
        System.out.println(result);
    }

    public static int fibTailRec(int index, int counter, int temp1, int temp2) {
        if (index <= 0) return 0;

        else if (index == 1 || index == 2) return 1;
        else if (index == counter) return temp1 + temp2;
        else return fibTailRec(index, counter + 1, temp2, temp1 + temp2);
    }

}
