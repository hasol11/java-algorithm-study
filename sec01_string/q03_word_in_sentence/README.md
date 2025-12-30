# 3. 문장 속 단어

-> 문장 중에서 젤 긴 단어 출력

### 1) 로직 흐름

내 로직

1. words라는 배열을 만들고 띄어쓰기 단위로 문장을 잘라서 배열에 저장한다.
2. 개선된 for문 `for(String word:words){}`를 통해 배열에서 하나씩 빼내어 `length()`를 통해 비교하고 더 크면 해당 값을 저장한다.

---

### 2) 핵심 개념

split 방식: str.split(" ")을 사용하면 공백을 기준으로 단어들을 쪼개서 바로 배열로 만들어준다.

indexOf + substring 방식:

- 위치 찾기 (indexOf): pos = str.indexOf(' ')로 첫 번째 공백의 인덱스 번호를 찾는다. (없으면 -1)

- 단어 자르기 (substring): str.substring(0, pos)로 공백 앞까지의 단어를 잘라낸다.

- 문자열 갱신 (substring): str = str.substring(pos + 1)로 처리한 앞 단어와 공백을 잘라내고 남은 뒷부분만 다시 저장한다.
