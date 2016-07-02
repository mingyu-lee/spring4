웹개발자를 위한 스프링4 프로그래밍 공부
=======
# 레파지토리 정보
- 웹개발자를 위한 스프링4.0 프로그래밍 책을 통해 예제를 실습한 소스 저장용 레파지토리
- 이클립스 프로젝트로 업로드 되지 않으니 메이븐 프로젝트 생성 후 소스를 복사할 것
- 이 후 하단의 설명은 [책 예제 소스 깃헙](https://github.com/madvirus/spring4)의 내용을 토대로 작성함.

# 책에 대한 정보

- 책에 대한 정보는 http://www.aladin.co.kr/shop/wproduct.aspx?ISBN=8980782713 에서 확인
- 책에 대한 질문 답변은 http://cafe.daum.net/javacan 카페나 저자 이메일로 가능

# 사전 준비
## 이클립스 설정
책의 예제는 메이븐 프로젝트이며 다음을 기준으로 작성되었다.

- **자바7** (11장 일부 예제가 자바8 람다 사용)
-- Window > Preferences > Java/Installed JREs 에서 추가
- **UTF-8**
-- Window > Preferences > General/Workspace 에서 Text file encoding을 UTF-8로 변경
-- 프로젝트를 임포트 한 뒤, 프로젝트 별로 Project > Properties > Resource 에서 Text file encoding을 UTF-8로 변경해도 됨
- **톰캣 7** (서블릿3)
-- Window > Preferences > Servers/Runtime Environments 에서 톰캣 7 설정 추가

이클립스에 자바7 JRE를 추가하지 않았다면, 자바7 JRE 설정을 추가한다. 자바8 예제를 실행해보고 싶다면 이클립스 Luna를 이용한다.

## 메이븐 설정
명령 프롬프트에서 메이븐을 이용해서 웹 프로젝트를 실행하려면 메이븐이 설치되어 있어야 한다. 메이븐에 대한 기초 지식이 필요하면 http://javacan.tistory.com/entry/MavenBasic 글을 읽어보기 바란다.

# 프로젝트 임포트
## 메이븐 프로젝트 임포트
이 화면의 우측에 있는 [Download Zip](https://github.com/mingyu-lee/spring4/archive/master.zip) 링크를 누르면 소스 코드를 다운로드 받는다.
이 파일의 압축을 풀면 /spring4-master 디렉토리 밑에 spring4-chapxx 형식의 메이븐 프로젝트가 존재한다.

File > Import ... > Maven/Existing Maven Projects 메뉴를 이용해서 메이븐 프로젝트를 임포트 한다.

# 프로젝트 목록
| 프로젝트 | 타입 | 설정 | 진행률 | 시작일 | 종료일 |
|---|---|---|---|---|---|
| spring4-chap01 | 어플리케이션 | 스프링 기초 예제 | 100% | 2016-06-30 | 2016-06-30 |
| spring4-chap02 | 어플리케이션 | 스프링 DI와 관련된 다양한 예제 코드 | 60% | 2016-07-01 | |
| spring4-chap03 | 어플리케이션 | 라이프사이클 범위와 관련된 예제 코드 | 0% | | |
| spring4-chap04 | 어플리케이션 | 프로퍼티, 프로필 등 예제 코드 | 0% | | |
| spring4-chap05 | 어플리케이션 | 컨테이너 확장 예제와 PropertyEditor/ConversionService 예제 | 0% | | |
| spring4-chap06 | 어플리케이션 | 스프링 AOP 예제 | 0% | | |
| spring4-chap07 | 웹 | 스프링 MVC의 컨트롤러, 커맨드 객체, 폼 검증 등의 예제 | 0% | | |
| spring4-chap08 | 웹 | JSP 연동 및 커스텀 태그, 파일 다운로드, 엑셀/PDF 생성 예제 | 0% | | |
| spring4-chap09 | 웹 | XML/JSON 응답, 파일 업로드 예제 | 0% | | |
| spring4-chap09-ws | 웹 | 웹 소켓과 SockJS 관련 서버 예제 | 0% | | |
| spring4-chap10 | 웹 | 서블릿3 기반 스프링 MVC 설정 예제 | 0% | | |
| spring4-chap11 | 어플리케이션 | DataSource 설정과 JDBC를 위한 템플릿 사용 예제 | 0% | | |
| spring4-chap11-j8 | 어플리케이션 | 자바8의 람다식을 이용한 JdbcTemplate 사용 예제 | 0% | | |
| spring4-chap12 | 어플리케이션 | 트랜잭션 설정 예제 | 0% | | |
| spring4-chap13-hib | 어플리케이션 | 하이버네이트 4 연동 예제 | 0% | | |
| spring4-chap13-hib3 | 어플리케이션 | 하이버네이트 3 연동 예제 | 0% | | |
| spring4-chap13-jpa | 어플리케이션 | JPA 연동 예제 | 0% | | |
| spring4-chap13-jpa-jta | 어플리케이션 | JPA에서 JTA 연동 예제 | 0% | | |
| spring4-chap13-mybatis | 어플리케이션 | MyBatis 연동 예제 | 0% | | |
| spring4-chap14 | 어플리케이션 | 스프링 데이터 JPA 사용 예제 | 0% | | |
| spring4-chap15-a1 | 웹 | 서비스-DAO 구조 예제 | 0% | | |
| spring4-chap15-a2 | 웹 | 어플리케이션-도메인-영속 | 0% | | |
| spring4-chap16 | 웹 | 스프링 시큐리티 기본 예제 | 0% | | |
| spring4-chap16-s1 | 웹 | JDBC를 이용한 인증 처리 예제 | 0% | | |
| spring4-chap16-s2 | 웹 | 쿠키를 사용해서 인증 상태 보관하는 처리 예제 | 0% | | |
| spring4-chap17 | 어플리케이션 | 메일 발송, 스케줄링, RestTemplate 예제 | 0% | | |
| spring4-chap17-s | 웹 | RestTemplate을 테스트하는데 사용된 웹 어플리케이션 | 0% | | |
| spring4-chap18 | 어플리케이션 | 스프링의 JUnit 테스트 지원 관련 예제 | 0% | | |
| spring4-chap18-m | 웹 | MVC 테스트를 위한 MockMvc 예제 | 0% | | |
| spring4-chap18-t | 어플리케이션 | 테스트 코드의 트랜잭션 처리 예제 | 0% | | |
| spring4-appa | 어플리케이션 | 로깅 모듈 설정 예제 | 0% | | |