package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        while (true) {
            List<Integer> computer = generateComputerNumbers();
            System.out.println("숫자 야구 게임을 시작합니다.");
            while (true) {
                System.out.print("숫자를 입력해주세요 : ");
                String userInput = Console.readLine();

                if (userInput.length() != 3) {
                    throw new IllegalArgumentException();
                }
            }
        }
    }
    private static List<Integer> generateComputerNumbers() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }
}
