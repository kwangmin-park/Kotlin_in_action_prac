package ch2

class ValVar {
}

fun main(){
//    val은 변경불가능(immutable)참조를 저장하는 변수. java의 final 변수이다.
//    기본적으로 모든 변수를 val 키워드를 사용해 불변 변수로 선언하고, 나중에 필요할 때에만 var로 사용하는 것이 원칙. -> 부수효과를 없애기 위함
    val a = 3
//    아래 코드는 불가능
//    a = 4

//    var은 변경가능한 mutable 참조. 단, 값은 바뀌더라도 변수 타입은 고정되어 바뀌지 않는다.
    var b = 3
//    var는 값 변경 가능
    b = 4
//    단 아래와같이 타입이 변할수는 없음. type mismatch error
//    b = "asdf"
}