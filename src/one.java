public class one {

    public static void main(String[] args) {
        //처음에는 var1이 int로 받고 있었기에 int 나누기 int는 2.5가 아닌 2.0을 받게 된다. 따라서 이
        //문제를 해결하기 위해 먼저 var3의 값을 확인해 주었고 var3이 2로 나타난다는 것을 알게되어
        // var1의 값을 double로 바꿔준 후에 보니까 5로 찍히는 것을 확인 할수 있었다.
        //int var1=5;
        double var1=5;
        int var2=2;
        double var3=var1/var2;//2.5
        //System.out.println(var3); -- 2
        int var4=(int)(var3*var2);//2.5*2
        System.out.println(var4);
    }
}