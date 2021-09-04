package ch2

class variable {
}

fun main(){
//    타입 명시
    val answer2: Int = 42

//    타입 추론
    val question = "string"
    val answer = 42

//    부동소수점 상수를 사용할 경우 변수 타입은 Double
    val yearsToCompute = 7.5e6

//    초기화식을 사용하지 않고 변수를 선언하려면 변수 타입을 반드시 명시해야함. 초기화식이 없다면 변수에 저장될 값에 대해 아무 정보가 없기 때문에
//    컴파일러가 타입을 추론할 수 없음
    val answer3: Int
    answer3 = 3


}