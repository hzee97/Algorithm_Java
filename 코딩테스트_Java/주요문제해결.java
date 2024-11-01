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
Integer.valueOf(String s) // Integer 객체 반환

// 기본 자료형 'int' 로 변경
Integer.parseInt(str);  // int 반환

// 진법 변환
// n진법 -> 10진법
String str = "1011";
Integer.parseInt(str, n);
// 10진법 -> N진법
int number = 10;
Integer.toBinaryString(number); // 2진법
Integer.toOctalString(number); // 8진법
Integer.toHexString(number); // 16진법

// 정규식
my_string = my_string.replaceAll("[a-zA-Z]","");  // my_String에서 숫자만 추출.

// 복잡한 정렬
// ex. 첫 번째 원소 기준 오름차순, 두 번째 원소 기준 내림차순
// python code : arr.sort(key=lambda x: (x[0], -x[1]))

// 정렬: 첫 번째 원소 기준 오름차순, 두 번째 원소 기준 내림차순
Arrays.sort(arr, new Comparator<Integer[]>() {
    @Override
    public int compare(Integer[] a, Integer[] b) {
        if (a[0].equals(b[0])) {
            return b[1].compareTo(a[1]);  // 두 번째 원소 내림차순
        }
        return a[0].compareTo(b[0]);  // 첫 번째 원소 오름차순
    }
});