# interface 를 이해하자

### 주제 : 사용자가 sns를 이용한 로그인 기능

### 설계내용

MemberDTO.class : 사용자가 로그인을 하기 위한 정보를 담는다. id /pwd <br>
MemberService.class : MemberDTO 클래스를 매개변수로 받고
기존에 있는 사용자와 같은 값을 갖는지 확인한다.
login() / signUp()

SnsAuth.interface : login() 제공한다. 여유가 있는 사람은 signUp() 추가


sns 인증 방식은 총 3가지를 제공한다. <br>
아래의 클래스는 SnsAuth를 상속받아 구현한다.
1. googleAuth
2. kakaoAuth
3. naverAuth

### 프로그램 흐름
main 에서 scanner를 통해 값을 입력 받아 인증 방식을 입력 받는다. <br>
인증 방식이 결정되면 사용자에게 아이디 비밀번호를 입력 받는다. <br>
입력 받은 인증에 따라 사용자에게 sns 인증 방식을 제공한다. <br>

출력화면 예시 <br>
없는 회원의 경우 : 000 인증된 회원이 없습니다.
존재하는 회원의 경우 : 000에 인증된 id 님 환영합니다.