// 라이브러리
import java.util.*;
import java.io.*;

// 출력
System.out.print();
System.out.println();

// 배열 출력
String[] arrCar = { "사과", "오렌지", "파인애플", "체리", "포도"};

System.out.print( Arrays.toString(arrCar));

// 변수 선언
String[] arr = new String[5];
int[] arr1 = {1,2,3};

int n=3;
int[] arr2 = new int[n];

// array_sort
int arr[] = {1,2,3,4,5};

Arrays.sort(arr); // 오름차순
Arrays.sort(arr, Collections.reverseOrder()); // 내림차순

Arrays.sort(arr,0,3); // 부분정렬 (특정 범위만 정렬하면 그 범위 외의 부분은 원래 배열 그대로 유지)
Arrays.binarySearch(arr,2); // 이진탐색 : binarySearch(탐색배열, 찾는 값) , 이진 탐색은 배열이 정렬된 상태에서만 정확하게 동작

// 길이
int[] arr = new int[3];
arr.length;

String my_string = "ABC";
my_String.length();        // 문자열의 길이를 구할 때는 메서드로 호출

// String
String str = "Hello World!";

str.split(" ");
str.substring(0,5);

// replaceAll 
// replaceAll("찾을 문자열", "바꿀 문자열")
new_string = string.replaceAll("[a-zA-Z]","");

// startsWith
// string : 검사를 수행할 문자열, prefix : 이 문자열로 시작하는지 확인하려는 접두사 문자열.
// 반환값은 true , false
boolean result = string.startsWith(String prefix);

boolean result = string.startsWith(String prefix, int toffset)  // 문자열의 특정 위치에서부터 해당 접두사로 시작하는지 여부를 확인

// HashMap
HashMap<String, Integer> hash = new HashMap<>();

hash.put("java",0); // key, value 넣기.
hast.get("java");   // 키로 값 가져오기.

hash.containsKey("java");  // "java" 가 hash 안에 있는지 판별.

// ArrayList
ArrayList<String> list = new ArrayList<>();  // 선언.

list.add("java");         // "java" 삽입.
list.add(0,"java");       // 0 번째 인덱스에 "java" 삽입.

list.set(1,"python");     // 1 번째 인덱스의 값을 "python"으로 변경.

list.remove(1);           // 1번째 인덱스의 값 삭제.

list.contians("java");    // 값 "java"가 list 안에 있는지 존재유무 확인.

list.indexOf("java");     // list 안에서 "java"를 찾아 그 인덱스를 리턴.

// Iterator
Iterator it = list.Iterator();

it.hasNext()              // 오름차순 순회.
it.hasPrevious()          // 내림차순 순회.

// Queue
Queue<Integer> q = new LinkedList<>();

q.add(10);    // q 에 10 삽입.
q.offer(7);   // q 에 7 삽입.

q.remove();   // 삭제.
q.poll();     // 삭제.

q.clear();    // 초기화.

q.isEmpty();  // q가 비어있는지 확인.

// PriorityQueue
PriorityQueue<Integer> pq = PriorityQueue<Integer>(); // 최소힙.
PriorityQueue<Integer> pq = PriorityQueue<Integer>(Collections.reverseOrder()); // 최대힙.

pq.add(3);    // 삽입.

pq.remove();  // 삭제.

pq.peek();    // root 값 추출.
