# 보고서 제목 : 시간복잡도 보고서
 
#### 작성자명 : 유예인

## 목차  
#### - 시간 복잡도의 정의와 필요성
#### - Big O 표기법의 개념과 상황별 예시
#### - 문제01 코드의 시간 복잡도 분석
#### - 문제02 코드의 시간 복잡도 분석
#### - 병목 현상 분석 및 최적화 방안



---
- ### 시간복잡도의 정의와 필요성
    시간복잡도란 연산 횟수에 따라 결과값을 구하는 데까지  
    얼마만큼 시간이 소요되는지를 의미한다  
    알고리즘을 효율적으로 짜기 위해서 필요하다 
    효율적으로 알고리즘을 짰다는 것은  
    입력값이 증가하더라도 시간의 증가를 최소화하여 프로그램을 짰다는 것이다.

---
- ### Big O 표기법의 개념과 상황별 예시
    Big O 표기법은 최악의 상황을 가정했을 때의 시간복잡도를 표현하는 방법이다.  
    표기법에는 크게 세가지가 있다
  - 최상의 경우 : 오메가 표기법 
  - 평균의 경우 : 세타 표기법
  - 최악의 경우 : 빅오 표기법  
보통 시간복잡도는 최악을 기준으로 빅오 표기법을 사용하여 성능을 판단한다
  
예시 1)
  ```
  def sum_array(arr):
    total = 0
    for num in arr:
        total += num
    return total
  ```
  위 코드는 배열을 한번 순회하므로 O(n)의 시간복잡도를 가진다  
  
예시 2)
```
def find_pairs(arr):
    for i in range(len(arr)):
        for j in range(len(arr)):
            print(arr[i], arr[j])
```
   위 코드는 중첩루프를 돌기 때문에 O(n^2)의 시간복잡도를 가진다

---
- ### 문제01 코드의 시간 복잡도 분석
main 부분
```
public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("값을 입력해주세요");
            return;
        }
        try {
            List<Integer> list = new ArrayList<Integer>();
            for (String i : args) {
                int value = Integer.parseInt(i.replace(",",""));
                if (value < 0 || value> 1000) {
                    System.out.println("입력된 값의 범위가 올바르지 않습니다. 0에서 1000까지의 값을 입력해주세요.");
                    return;
                } else {
                    list.add(value);
                }
            }
            /* 스트림 사용
            array= Arrays.stream(args)
                    .map(Integer::parseInt)
                    .toList();
            */
            System.out.println(cnt(list));
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력해주세요");
            return;
        }
```
main에서 for문을 도는 부분은 for (String i : args) 이 부분이다. 배열을 도는 부분이기 때문에  
빅오 표기법을 사용하면 O(n)이라고 표현할 수 있다.

cnt 함수 부분
```
public static List<Integer> cnt(List<Integer> list){
        List<Integer> number = new ArrayList<Integer>();
        List<Integer> count = new ArrayList<Integer>();
        for(int i=0;i<list.size()-1;i++)
        {
            int k = list.get(i);
            for(int j =i+1;j< list.size();j++)
            {
                if(k== list.get(j)){
                    count.add(list.get(i));
                }
            }
            if(!count.contains(list.get(i))){
                number.add(list.get(i));
            }
        }

        return number;
    }
```
이 부분에서는 for문을 중첩해서 사용하고 있다 따라서 빅오표기법으로 표현하면  
O(n^2)이라고 할 수 있다

따라서 이 코드의 총 시간 복잡도는 O(n^2)라고 할 수 있다

---
- ### 문제02 코드의 시간 복잡도 분석
main 부분
```
public static void main(String[] args) {
        if(args.length==0){
            System.out.println("입력된 메시지가 올바르지 않습니다. 다시 한번 확인해주세요.");
            return;
        }

        String str ="" ;
        String origin ="";
        for(int i=0;i<args.length;i++){
            origin = args[i];
            for(int j =0;j<args[i].length();j++) { //문자열 push
                push(String.valueOf(args[i].charAt(j)));
            }
            if(i!=args.length-1)
                push(" ");
        }
        while(top>0){
            str+=pop();
        }
        if(origin.equals(str)){
            System.out.println("회문입니다. : " + origin);
        }
        else {
            System.out.printf("%s", str);
        }
```
이 부분에서도 for문이 중첩되어 사용되고 있다는 것을 확인할 수 있다.
따라서 빅오표기법을 사용하면 O(n^2)이다.   

따라서 총 코드의 시간복잡도는 O(n^2)이라 할 수 있다  

---
- ### 병목 현상 분석 및 최적화 방안

1번 문제 코드 :  
병목현상이 있는 부분은 cnt 함수
중첩 for문을 돌아서 O(n^2)이라는 시간복잡도때문에 병목현상이 발생한다

최적화 방안 : Map을 사용하여서 count를 하기
HashMap을 사용하여서 카운팅을 하면 전체를 한 번만 순회(O(n))하면서 중복 여부를 판단할 수 있다



2번 문제 코드 :
병목 현상이 있는 부분은 str+=pop()  
Java에서 String은 immutable(불변) 이라 += 연산이 일어날 때마다   
새 문자열 객체가 매번 생성된다 이 연산이 k번 반복된다면, O(1 + 2 + 3 + ... + k) = O(k²) 만큼의 시간이 소요될 수 있다  
➡ 이건 시간복잡도상 병목이자 실행 속도 저하의 주요 원인이 될 수 있다

최적화 방안 : StringBuilder를 사용하는 것이다. StringBuilder는 가변배열이라  
append() 연산을 통해 시간복잡도를 O(n)으로 줄일 수 있다.


