public class three {
    public static void main(String[] args) {
        //a와 b를 정의한다
        int a = 0;
        int b = 0;

        //첫 시작이라는 메시지를 넣어 주었다.
        System.out.println("시작!");
        while (a+b < 20) {
            //while문 안의 math random을 1에서 6까지 해주어야 해서 기본인 0에서 +1해줘서 6까지 가도록 해주었다.
            a = (int) (Math.random() * 6+1);
            b = (int) (Math.random() * 6+1);
            //문장 양식에 맞게 a와 b 사이에 콤마 괄호를 넣어주었다.
            System.out.println("(" + a + "," + b + ")");
            //만약 a+b가 5면 끝나는 문구를 break로 그냥 빠져 나가도록 만들어주었다.
            if (a+b==5){
                System.out.println("끝!");
                break;
            }
        }
    }
}
