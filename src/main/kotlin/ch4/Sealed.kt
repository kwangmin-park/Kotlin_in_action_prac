package ch4

sealed class Expr{ //sealed class는 자동으로 open이다.
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun eval(e:Expr): Int =
    when(e){ //When case에서 Expr의 모든 하위 클래스(sealed로 묶인)를 처리한다면 디폴트 분기(else)가 필요없다.
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.right) + eval(e.left)
    }