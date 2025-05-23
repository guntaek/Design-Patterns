package factory;

public class Helicopter implements Transportation {

    @Override
    public void move() {
        System.out.println("헬리콥더가 날아갑니다.");
    }
}
