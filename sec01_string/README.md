# Section 1. String (문자열) 핵심 요약

코딩 테스트에서 자주 사용되는 자바 문자열 관련 주요 메서드와 테크닉 정리.

## 1. String 기본 메서드

| 메서드                            | 설명                                              | 예시                           |
| :-------------------------------- | :------------------------------------------------ | :----------------------------- |
| `charAt(int index)`               | 특정 인덱스의 문자를 반환                         | `str.charAt(0)`                |
| `toUpperCase()` / `toLowerCase()` | 대문자/소문자로 변환                              | `str.toUpperCase()`            |
| `toCharArray()`                   | 문자열을 문자 배열(`char[]`)로 변환               | `char[] c = str.toCharArray()` |
| `indexOf(String s)`               | 특정 문자가 처음 등장하는 인덱스 반환 (없으면 -1) | `str.indexOf("e")`             |
| `substring(int begin, int end)`   | 문자열 자르기 (**end 인덱스 미포함**)             | `str.substring(0, 7)`          |
| `replace(char old, char new)`     | 특정 문자를 다른 문자로 치환                      | `str.replace('#', '1')`        |
| `split(String regex)`             | 구분자를 기준으로 문자열 분리                     | `str.split(" ")`               |

<br>

## 2. StringBuilder (문자열 수정/조작)

String은 불변(Immutable) 객체라 수정 시 메모리 낭비가 발생하므로, 수정이 잦을 땐 `StringBuilder`를 사용한다.

- **생성**: `StringBuilder sb = new StringBuilder(str);`
- **뒤집기**: `sb.reverse().toString()` (회문 문자열 문제 필수!)
- **추가하기**: `sb.append("abc")`

<br>

## 3. Character 클래스 (문자 판별)

`char` 타입 문자를 다룰 때 유용한 정적 메서드 모음.

- `Character.isUpperCase(char c)`: 대문자 여부 확인
- `Character.isLowerCase(char c)`: 소문자 여부 확인
- `Character.isDigit(char c)`: 숫자 여부 확인
- `Character.isAlphabetic(char c)`: 알파벳 여부 확인 (특수문자 제외 시 유용)

<br>

## 4. 진수 변환 및 형변환

- **2진수 String → 10진수 int**: `Integer.parseInt("1011", 2)`
- **10진수 int → 2진수 String**: `Integer.toBinaryString(10)`
- **char → int (아스키코드)**: `(int) 'A'` (결과: 65)
- **int → char (문자)**: `(char) 65` (결과: 'A')

<br>

## 5. 꿀팁 & 주의사항 (Troubleshooting)

- **substring 사용 시 주의**: `substring(0, 5)`는 0, 1, 2, 3, **4**번 인덱스까지만 가져온다. (5번 포함 X)
- **문자열 비교**: `==` 연산자가 아닌 `.equals()` 메서드를 사용해야 한다.
