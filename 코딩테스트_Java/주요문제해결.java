// 문자열을 배열로 만들고 싶을 때
String str = "Hello World!";
String[] arr = str.split("");

// 대소문자 변경
String str = "Hello World!";
str = str.toUpperCase();  // 대문자로 변경.
str = str.toLowerCase();  // 소문자로 변경.

// Math 라이브러리
Math.max(10,2);   // 최댓값.
Math.min(10,2);   // 최솟값.

Math.abs();       // 절댓값.

Math.ceil(10.3);  // 올림.
Math.floor(10.3); // 내림.
Math.round(10.3); // 반올림.

Math.pow(2,2);    // 제곱.
Math.sqrt(3);     // 제곱근.

// format
double a = 1.2345;
String b = String.format("%.1f", a);

// 객체 변경
Integer.valueOf(String s)

// 정규식
my_string = my_string.replaceAll("[a-zA-Z]","");  // my_String에서 숫자만 추출.