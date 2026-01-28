package day05;

// class 밖에서 또 다른 클래스 만들기 : 현재 코드 작성하는 파일은 class 파일이 아닌 .java파일이다.
// 즉] .java 파일에는 여러개 class 가 존재할 수 있다.
class Student{  // 1) class 클래스명{ }
    int studentID;      // '학생번호' 속성 , 2) 멤버변수 정의 = 객체의 본질/특징/성질/값
    String studentName; // '학생명' 속성
} // class end // 설계도 단점 : 복잡도 크다 , 장점 : 재사용이 빠르다.