
//코틀린 interface는 자바8 인터페이스와 비슷하다.
//but, 코틀린 인터페이스는 추상메소드 뿐 아니라 구현이 있는 메소드도 정의할 수 있다.(//todo.그럼 자바와 추상클래스와 뭐가 다르지?)
//다만 인터페이스에는 아무런 상태(필드)도 들어갈 수 없다.
interface Clickable{
    fun click()
}


interface Clickable2{
    fun click()
//    interface에 디폴트 메소드를 구현
    fun showOff() = println("I'm clickable!")
}

interface Focusable{
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}

//Button 클래스는 Clickable 인터페이스를 상속했으므로 추상메소드인 click을 구현해야한다.
//Java에서는 extends와 implements 키워드를 사용하지만 코틀린에서는 : 뒤에 상속명을 쓰는것으로 클래스와 인터페이스 상속을 모두 대체한다.
//Java와 마찬가지로 인터페이스는 여러개 상속 가능, 클래스는 하나만 상속 가능
class Button: Clickable{
//    코틀린의 override 키워드는 자바의 @Override 어노테이션과 비슷한 역할.
//    차이점은 코틀린에선 override 키워드를 꼭 사용해야한다. 이 변경자를 통해 실수로 상위 클래스의 메소드를 오버라이드하는 것을 방지한다.
//    상위 클래스의 메소드와 시그니처가 같은 메소드를 우연히 하위 클래스에서 선언할 경우 컴파일이 안되므로 override로 오버라이딩하거나 메소드 이름을 바꿔야한다.
    override fun click() = println("I was clicked")
}

//만약 한 클래스가 Clickable2 와 Focusable 인터페이스 모두를 상속받으면 어느 showOff의 구현을 상속받을지 결정할 수 없다. -> 컴파일 오류 발생. 클래스 내부에서 오버라이딩이 요구된다.

class Button2: Clickable2, Focusable{
//    click은 인터페이스의 추상메소드이므로 구현 필요
    override fun click() = println("I was clicked")
//    showOff가 Clickable2, Focusable 모두에 구현되어있는 디폴트 메소드이므로 오버라이드 필요
    override fun showOff(){
//    상위 타입을 호출할 때 자바와 마찬가지로 super 키워드를 사용한다. 하지만 타입 지정 문법이 다름
//    자바에서는 Clickable2.super.showOff()
//    코틀린에서는 super<Clickable2>.showOff()
        super<Clickable2>.showOff()
        super<Focusable>.showOff()
    }
}

fun main(){
//    Button().click()
    val button = Button2()
    button.showOff()
    button.setFocus(true)
    button.click()
}
