package baseball;

public class EndLine implements Line {

    @Override
    public String speak() {
        return "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요";
    }
}
