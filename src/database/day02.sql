create database mydb0203; -- db생성
use mydb0203; -- db활성화/선택/사용
-- [1] 테이블 생성 , create table 테이블명( 속성명 타입 제약조건 , 속성명 타입 제약조건 );
create table test1( 속성명 int );
-- [2] 테이블 목록 보기 , show tables;
show tables;
-- 2개 이상의 속성명 정의한 테이블
create table test2( 속성명1 int , 속성명2 double );
-- [3] 테이블 삭제 , drop table 테이블명; , drop table/database if exists 테이블/데이터베이스명
drop table if exists test1;
-- [4] 테이블 간단 조회 , select 속성명1, 속성명2 from 테이블명; , select * from 테이블명;
select * from test2;
-- [5] 다양한 데이터타입의 테이블 생성 
create table test3( 
	정수속성1 tinyint , 정수속성2 smallint , 정수속성3 mediumint ,
    정수속성4 int , 정수속성5 bigint , 정수속성6 int unsigned , -- signed부호있는(+-) unsigned(부호없음)
	실수속성1 float , 실수속성2 double , 실수속성3 decimal , -- decimal 문자타입으로 실수표현(오차x/부동소수점x)
    날짜속성 date , 시간속성 time , 날짜시간속성 datetime , 
    문자속성1 char(5) , -- 고정길이의 문자타입, char(5) -> "유재석" -> [유][재][석][ ] [ ] 2칸 이 남는다.
    문자속성2 varchar(5) , -- 가변길이의 문자타입, varchar(5) -> "유재석" -> [유][재][석] x x 남은 2칸은 삭제 한다.
    문자속성3 text , 문자속성4 longtext , -- 4G 대용량
    논리속성 bool -- true 또는 false , tinyint 취급 , 1 또는 0
);
select * from test3;

-- [*] 방문록 기록하는 테이블설계
create table comment( 
	content varchar(255) , -- 내용물 최대 255글자
	writer varchar(20) -- 작성자 최대 20글자 
);
select * from comment;
-- [*] 대기명단 기록하는 테이블설계
create table waiting( 
	count tinyint unsigned , -- 인원수 최대 정수 0~255 까지 , signed +-128
    phone char(13) -- 연락처 최대 13글자 까지 고정길이 문자
);
select * from waiting;

-- [6] 제약조건 : 테이블내 데이터들의 문제와 결함이 되는 입력 방지/해결 
create table test4( 
	# 속성명 타입 제약조건명
    속성명1 tinyint not null , 		-- not null : 해당 속성값들은 null 저장할 수 없다.
    속성명2 smallint unique , 		-- unique : 해당 속성값들은 중복이 불가능 하다.
    속성명3 int default 10 ,			-- default 자료 : 만일 해당 속성에 초기값이 생략되면 기본값 자료 사용한다.
    속성명4 bigint auto_increment , 	-- auto_increment : 만일 해당 속성에 초기값이 생략되면 자동번호 부여한다. + PK같이 사용
	constraint primary key(속성명4)	-- primary key : pk(식별/기본)키 , 식별가능한 고유한 값 가진 키
									-- 중복없음unique + 빈칸없음not null , 학번,사번,주민등록번호,제품번호 등등 
									-- 선언방법 : primary key vs constraint primary key( PK속성명 )
); 
create table test5( 
	속성명1 bigint , 
    constraint foreign key( 속성명1 ) references test4( 속성명4 ) on delete set null
    -- foreign key : fk(참조/외래)키, 다른 테이블의 기본키(pk)참조하는 키
    -- constraint foreign key( FK속성명 ) references 테이블명( pk필드명 )
    -- 중복가능 , 빈칸가능 , 
	-- pk(1) : fk(N) 관계에서 수강신청한학번, 휴가신청한사번,구매한제품번호 등등
    -- on update/delete restrict : pk가 삭제/수정 될때 fk가 *참조중*이면 삭제/수정 불가능 관계 < 자식이 있으면 부모 삭제 불가능 > , 기본값
					 -- cascade : pk가 삭제/수정 될때 fk도 같이 삭제 관계 , < 게시물삭제되면 댓글도 같이 삭제 >
                     -- set null : pk가 삭제/수정 될때 fk는 null 변경 관계 , < 게시물삭제되면 댓글 참조는 null >
);
select * from test4;
select * from test5;

-- [5] 회원제 제품 설계 -- 관례순서
drop database if exists boardservice6; -- 이미 존재할 수 있으므로 데이터베이스 삭제 
create database boardservice6; -- 데이터베이스 생성 
use boardservice6; -- 데이터베이스 활성화/사용
create table member( 
	mno int auto_increment , -- 회원번호 , 정수타입 , 자동번호 부여
    mid varchar(30) not null unique , -- 회원아이디 , 문자타입(~30) , 빈칸불가능 , 중복불가능
    mpw varchar(30) not null , -- 회원비밀번호 , 문자타입(~30) , 빈칸불가능
    mname varchar(10) , -- 회원닉네임 , 문자타입(~10) 
    mphone char(13) , -- 회원연락처 , 문자타입(13)
    constraint primary key( mno )  -- 회원번호 를 pk(식별키) 선정 
);
select * from member;
create table product( 
	pno int auto_increment , 
    pname varchar(100) not null unique , 
    pprice int unsigned default 0 , -- 가격이므로 음수는 필요없어서 unsigned , 초기값 생략시 0
    pcomment longtext , -- 최대 4G 가능한 문자타입
    pdate datetime default now() , -- 날짜/시간타입 , 기본값을 현재시스템 날짜/시간 자동 부여 
    mno int , -- FK로 사용할 필드명의 타입은 PK 필드명과 일치 , 필드/속성 명 일치 권장   -- on delete cascade 회원이 탈퇴하면 그회원의 제품도 삭제
    constraint primary key( pno ) , -- pno속성에 pk 설정
    constraint foreign key( mno ) references member( mno ) on delete cascade
);
select * from product;
-- ER 다이어그램 : 여러 객체 들 간의 관계 시각적 , ERD 다이어그램 : 데이터베이스 테이블 간의 관계 시각적