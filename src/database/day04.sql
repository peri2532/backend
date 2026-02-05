# DB 생성
drop database if exists mydb0205;
create database mydb0205;
use mydb0205;

# 1. 회원 테이블 (member)
create table member(
 mid char(8) not null,   # 식별키 (최대 8자리)
    mname varchar(10) not null,  # 그룹명 (최대 10자리)
    mnumber int not null,   # 인원수
    maddr char(2) not null,   # 지역 (최대 2자리)
    mphone1 char(3),    # 지역번호
    mphone2 char(8),    # 전화번호
    mheight smallint,    # 평균키
 mdebut date,     # 데뷔일 (yyyy-mm-dd)
    constraint primary key (mid)
);

# 2. 구매 테이블 (buy)
create table buy(
 bnum int auto_increment,   # 구매번호 (자동증가)
    mid char(8),     # 구매자 (FK)
    bpname char(6) not null,  # 제품명
    bgname char(4),     # 분류명
    bprice int not null,   # 가격
    bamount smallint not null,  # 구매수량
    constraint primary key(bnum),
    constraint foreign key (mid) references member(mid)
);

# 샘플 데이터
INSERT INTO member VALUES
('TWC','트와이스',9,'서울','02','11111111',167,'2015-10-19'),('BLK','블랙핑크',4,'경남','055','22222222',163,'2016-08-08'),
('WMN','여자친구',6,'경기','031','33333333',166,'2015-01-15'),('OMY','오마이걸',7,'서울',NULL,NULL,160,'2015-04-21'),
('GRL','소녀시대',8,'서울','02','44444444',168,'2007-08-02'),('ITZ','잇지',5,'경남',NULL,NULL,167,'2019-02-12'),
('RED','레드벨벳',4,'경북','054','55555555',161,'2014-08-01'),('APN','에이핑크',6,'경기','031','77777777',164,'2011-02-10'),
('SPC','우주소녀',13,'서울','02','88888888',162,'2016-02-25'),('MMU','마마무',4,'전남','061','99999999',165,'2014-06-19');

INSERT INTO buy VALUES
(NULL,'BLK','지갑',NULL,30,2),(NULL,'BLK','맥북프로','디지털',1000,1),
(NULL,'APN','아이폰','디지털',200,1),(NULL,'MMU','아이폰','디지털',200,5),
(NULL,'BLK','청바지','패션',50,3),(NULL,'MMU','에어팟','디지털',80,10),
(NULL,'GRL','혼공SQL','서적',15,5),(NULL,'APN','혼공SQL','서적',15,2),
(NULL,'APN','청바지','패션',50,1),(NULL,'MMU','지갑',NULL,30,1),
(NULL,'APN','혼공SQL','서적',15,1),(NULL,'MMU','지갑',NULL,30,4);

# 샘플 확인
select * from member;
select * from buy;

#[1] 테이블에서 그룹절: group by 절 , ~~ 별로 , ~끼리
# select 속성명 from 테이블명 group by 그룹기준
#  주의할점 : 그룹 기준 외 다른 속성들의 대해 어떻게 보여줄지 정의 안됨 ( 조회 결과는 무조건 표/테이블)
select * from buy group by bpname; -- 불가능
select bpname, bprice from buy group by bpname; -- 불가능
select bpname from buy group by bpname; -- 가능

#[2] 집계 함수
select sum(bamount) from buy;  -- buy 테이블 내 bamount  속성값들의 전체 합계
select avg(bamount) from buy;  -- buy 테이블 내 bamount  속성값들의 전체 평균
select min(bamount) from buy;  -- buy 테이블 내 bamount  속성값들의 전체 중 최솟값
select max(bamount) from buy;  -- buy 테이블 내 bamount  속성값들의 전체 중 최댓값
select count(bamount) from buy;  -- buy 테이블 내 bamount  속성값들의 전체 레코드수 ( NULL 제외)
select count(*) from buy;  -- buy 테이블 내 bamount  속성값들의 전체 레코드수 ( NULL 포함)

#[3] 그룹절과 집계 함수
#1) 회원 아이디별 구매수량 합계 
select * from buy ;   					-- buy 테이블 전체 조회
select mid from buy group by mid;			-- buy 테이블 mid  기준으로 그룹
select mid , sum(bamount) from buy group by mid; -- buy 테이블 mid 기준으로 그룹하여 bamount 총합계 

#2) 회원아이디별 총 구매금액(구매수량 * 구매가격)
select mid,sum(bamount * bprice) from buy group by mid;

#3) 총 판매 횟수 , 회원아디디별로 판매 횟수
select count(*) from buy;
select mid,count(*) from buy group by mid;

# [4] having : 그룹절의 조건절, where : 그룹 전 조건 vs having : 그룹 후 조건
#1) 그룹 전 조건 where , 구매수량(그룸전에 존재하는 속성)이 3이상이면
select * from buy where bamount >3 ; 
#2) 그룹 후 조건  having , 총구매금액(그룹후에 존재하는 속성)이 1000이상인
select mid , sum(bamount * bprice) as 총구매금액
	from buy group by mid having 총구매금액 > 1000;
    -- select 속성명 from 테이븖ㄴ where 일반조건절 group by 그룹기준 having  그룹조건절

#[5] order by : 정렬 , asc 오름차순(기본값) ,desc 내림차순,
# 주의할점: 다중 정렬은 order by 1차정렬기준 , 2차정렬기준
	# -> 1차 정렬 후 동일한 값 끼리의 2차 정렬 실행 	
select * from member order by mdebut asc;
select * from member order by mdebut desc;
	# -> 1차 정렬에서 maddr(주소) 정렬 한 후 동일한 maddr(주소) 끼리 mdebut(날짜) 정렬한다.
SELECT * FROM member ORDER BY maddr desc, mdebut asc;

# [6] limit : 조회 결과 제한 , (검색/페이징) . limit 시작번호 ,개수
select * from member limit 2; -- 조회 결과 위에서 2개만 조회
select * from member limit 0,2; -- 조회 결과 0(첫번째 레코드)부터 2개 조회한다.
select * from member limit 0,5; -- 1페이지, 5개 조회(1페이지)
select * from member limit 5,5; -- 2페이지, 5개 조회(1페이지)

#select 작성 규칙/순서
# select 속성명 from 테이블명 where 일반 조건 group by 그룹기준 having 그룹조건 order by 정렬 기준 limit 개수
