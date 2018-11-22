# Java_HW2
## 참고
if(args.length != 1){<br>
System.out.println("사용법: java HW2_1 -10이상 10이하의 임의의 정수");<br>
return;<br>
= 사용자가 command line에 하나의 값을 입력하지 않은 경우 사용법을 알려주고, 프로그램을 종료시키는 코드<br><br>
int usr = Integer.parseInt(args[0]) : 사용자가 입력한 값 정수로 변환
## Casting(형변환)
int r = (int)(Math.random()*21-10) : -10이상 10이하의 임의의 정수형 난수를 생성
## Switch-case구문
switch(변수){ <br>
case 조건값: <br>
…  변수 조건값이 같으면 실행되는 영역<br>
default:<br>
.. 변수와 조건값이 한가지도 일치하지 않을 때 수행되는 영역 <br>
}<br>
