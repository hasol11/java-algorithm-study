# 7. 회문 문자열

-> 회문 문자열이면 "YES", 회문 문자열이 아니면 "NO"를 출력하는 프로그램 작성

### 1) 로직 흐름

1. 인덱스 직접 비교 방식(Answer.java)

- 문자열의 앞쪽(i)과 뒤쪽(len-i-1) 문자를 한 쌍씩 비교하며 안쪽으로 좁혀 들어간다. 문자열 길이의 절반(len/2)까지만 검사하면 된다.
- `str.charAt(i)` vs `str.charAt(len-1-i)`
- 하나라도 다르면 바로 NO 리턴
  -i가 0일 때 ↔ len-1 (맨 끝)
  -i가 1일 때 ↔ len-2 (끝에서 두 번째)

2. StringBuilder 활용 (Answer2.java)

- "뒤집은 문자열"을 새로 만들어서 원본과 똑같은지 비교한다.
- `new StringBuilder(str).reverse().toString()`으로 뒤집은 문자열 생성
- `equalsIgnoreCase()`를 사용하여 대소문자 무시하고 원본과 비교

---

### 2) 핵심 개념
