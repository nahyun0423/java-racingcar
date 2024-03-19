import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public int inputData() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("유효하지 않은 입력입니다. 숫자만 입력하세요");
        }
    }
}