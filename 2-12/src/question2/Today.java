package question2;

public class Today extends Routine {

    @Override
    void breakfast() {
        System.out.println("目玉焼きを食べた");

    }

    @Override
    void dentifrice() {
        System.out.println("歯を磨いた");

    }

    @Override
    void training() {
        System.out.println("腹筋を３０回した");

    }

    public static void main(String[] args) {

        Today today = new Today();

        today.breakfast();
        today.dentifrice();
        today.training();
    }
}
