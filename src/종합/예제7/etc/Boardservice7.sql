#[1] 데이터베이스 생성
drop database if exists boardservice7;
create database boardservice7;
use boardservice7;

#[2] 테이블 생성
create table board(
		bno int unsigned auto_increment,
        constraint primary key(bno),
        bcontent longtext not null,
        bwriter varchar(30) not null,
        bdate datetime default now()
);

#[3] 테이블 샘플 데이터 10개 (AI 활용)
INSERT INTO board (bcontent, bwriter) VALUES 
('안녕하세요. 첫 번째 게시글입니다.', '홍길동'),
('오늘 날씨가 정말 좋네요!', '김철수'),
('데이터베이스 공부 중입니다.', '이영희'),
('MySQL에서 LONGTEXT 타입을 사용해봅니다.', '박민수'),
('이 게시판은 테스트용입니다.', '최지훈'),
('지피티 정말 유용하네요!', '한예슬'),
('다들 좋은 하루 되세요~', '장도연'),
('어제 본 영화 정말 감동이었어요.', '강하늘'),
('프로그래밍은 재밌지만 어려워요.', '서지수'),
('다음 주에 시험인데 걱정이네요ㅠㅠ', '윤하준');

select * from board;