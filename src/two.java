public class two {
    public static void main(String[] args) {
        //z의 코드를 실행 할때 31이 나오게 되는데 x랑 y를 실행해보면
        //19랑 11이 나오게 된다. 그렇게 되면 11+19는 30인데 왜 안되는 것이냐면
        //z의 값을 실행할때 x는 증감연산자 전위로 먼저 더해져서 11이 되었고
        //y는 실행할때 20으로 계산 후 다음 계산에서는 19로 나오기에 z에서의 값은
        //11+20으로 31이 나오게 된다.
        int x = 10;
        int y = 20;
        int z = (++x) + (y--);
        System.out.println(z);
    }
}
