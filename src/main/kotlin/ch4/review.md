코틀린 인터페이스는 자바와 달리 프로퍼티 선언이 들어갈 수 있다. 
자바와 달리 코틀린은 기본적으로 public final. 
sealed: 클래스 상속 제한
object: 클래스와 인스턴스를 동시에 선언하면서 만든다.(Single tone, 동반객체(companion object), 객체식(object expression - 자바의 무명 클래스)))

코틀린 인터페이스는 자바와 달리 프로퍼티 선언이 가능하고, 추상메소드뿐 아니라 구현이 있는 메소드도 정의할 수 있다.//todo.(그럼 추상클래스와 다른점이 뭐지?)
<>인터페이스는 아무런 필드도 들어갈 수 없다.(//todo. 프로퍼티가 들어가면 필드가 들어간것이랑 같은 역할 아닌가?)

final : 오버라이드 불가. 클래스 멤버의 기본 변경자
open: 오버라이드 가능. 반드시 open을 명시해야 오버라이드 가능
abstract: 반드시 오버라이드 해야한다. 추상 클래스의 멤버에만 이 변경자를 붙일 수 있다. 추상 멤버에는 구현이 있으면 안된다.
override: 상위 클래스나 상위 인스터스의 멤버를 오버라이드 하는중. 오버라이드 멤버는 기본적으로 open. 하위 클래스의 오버라이드를 금지하려면 final을 명시해야한다.


