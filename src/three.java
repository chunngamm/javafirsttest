public class three {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        System.out.println("시작!");
        while (a+b < 20) {
            a = (int) (Math.random() * 7);
            b = (int) (Math.random() * 7);

            System.out.println("(" + a + "," + b + ")");
            if (a+b==5){
                System.out.println("끝!");
                break;
            }
        }
    }
}
