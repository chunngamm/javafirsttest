# javafirsttest

one: 다음 코드를 실행하면 출력 결과로 5를 기대했는데 4가 출력되었습니다. 어디에서 잘못 작성된 것일까요?
    
    ```java
    int var1=5;
    int var2=2;
    double var3=var1/var2;
    int var4=(int)(var3*var2);
    System.out.println(var4);
    ```
    
two: 다음 코드를 실행했을 때 출력 결과는 무엇입니까? (증감연산자에 대해 알아보세요!)
    
    ```java
    int x=10;
    int y=20;
    int z = (++x) + (y--);
    System.out.println(z);
    ```
    
three: while문과 Math.random() 메소드를 이용해서 2개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요. 눈의 합이 5가 되는 조합은 (1,4), (4,1), (2,3), (3,2)입니다.
    
    - 출력 예시
    
    시작!
    (3,6)
    (2,6)
    (1,4)
    끝!
    
