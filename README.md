# 🐳 미션 - 숫자 야구

---

### 📝 구현 요구 사항 명세

* Application의 main() 함수에서 시작
* indent depth < 3
* 3항 연산자 사용 금지
* TDD(JUnit5)
* Randoms.pickNumberInRange() 사용
* Console.readLine() 사용

---

### ☝️ 프로그램 흐름 순서

1. 컴퓨터가 1~9 범위의 서로 다른 랜덤한 수 3개 선택 및 게임 시작
2. 시작 문자열 출력
   > 숫자 야구 게임을 시작합니다. (개행)
3. 입력 받기 위한 문자열 출력
   > 숫자를 입력해주세요 :
4. 사용자에게 값을 입력 받음
    * 서로 다른 3자리 수 -> 3번 진행
    * 그 외의 값 -> IllegalArgumentException 발생 -> Application 종료
5. 입력한 값에 대한 결과 출력 (**모두 맞출 때까지 3~5 반복**)
    * 모두 맞은 경우
      > 3스트라이크 (개행)<br>
      3개의 숫자를 모두 맞히셨습니다! 게임 종료 (개행)
    * 모두 틀린 경우
      > 낫싱 (개행)
    * 볼 또는 스트라이크 (**볼 부터 출력, 둘 사이 1칸 공백**)
      > 1볼 1스트라이크 (개행)
6. 모두 맞힌 경우 재시작 문자열 출력
   > 게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요. (개행)
7. 값 입력 받기
    * 값==1: 랜덤 수 저장 후 3번 과정 진행
    * 값==2: Application 종료
    * 유효하지 않은 입력: IllegalArgumentException 발생 -> Application 종료

---

### 🍰 도메인 분석

* 사용자 (**_User_**)
    * 게임을 하는 사람
    * 숫자를 입력하고 결과를 받는다
* 상대 (**_Computer_**)
    * 사용자가 이겨야 할 상대방
    * 게임 시작 시 불변의 숫자를 가진다
* 야구 (**_Baseball_**)
    * 야구 게임
    * 두 값을 비교하는 행위를 한다

---

### ⚾️ 기능 목록

* User 엔티티
    * 사용자에게 입력 받는 필드 변수
    * 입력 받은 값이 유효한 지 검증하는 로직
        * 3자리 수 입력
        * 재시작 선택 입력
* Computer 엔티티
    * 불변의 3자리 값 필드 변수
    * 게임을 시작할 때 불변의 값 생성 로직
    * 불변의 값이 유효한 지 검증하는 로직
* Baseball 엔티티
    * 최근 결과값을 저장하는 필드 변수
    * 두 값을 비교하는 로직
    * 게임 시작 문자열을 출력하는 로직
    * 결과값을 출력하는 로직



