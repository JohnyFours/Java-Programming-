

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne(int numbers) {
        for( int i = numbers; i >= 1; i--){
            System.out.println(i);
        }
    }

}
