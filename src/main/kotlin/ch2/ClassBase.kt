package ch2

class ClassBase {
}

//kotlin의 기본 가시성은 public이므로 생략
//아래와같이 코드없이 데이터만 저장하는 클래스를 값객체(value object)라 칭함.
//java와 달리 생성자, getter를 만들어주지 않는다. 특히 getter를 필드와 함께 묶어서 만들지 않는 것인데 이를 '프로퍼티'라고 함
class Person(val name: String)