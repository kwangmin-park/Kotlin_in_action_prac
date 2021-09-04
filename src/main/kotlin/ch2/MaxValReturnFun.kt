package ch2

class MaxValReturnFun {
}


//블록이 본문인 함수
//fun: 함수 선언 , max: 함수이름 , a, b: 함수 파라미터 , 파라미터 괄호 뒤에 Return type이 온다.
//fun max(a: Int, b: Int): Int{
//   return if (a>b) a else b;
//}

//식이 본문이 함수
//같은 표현. 내용이 한줄일 경우 이렇게 표현 가능
fun max(a: Int, b: Int): Int = if(a>b) a else b


//식이 본문인 함수의 경우 반환타입을 명시하지 않아도된다.(컴파일러가 본문 추론 -> 타입 추론)
//fun max(a: Int, b: Int) = if(a>b) a else b

fun main(){
    println(max(1,2))
}
