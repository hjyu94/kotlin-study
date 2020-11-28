/*
    # 함수형 프로그래밍
    - 자바 언어는 완벽한 객체 지향 프로그래밍 언어
    - 따라서 객체를 특정 객체를 사용하는 목적 자체가 특정 매체에 대한 데이터와 기능을 관리하는기 위함인데
    자바는 그러한 목적이 아니라고 하더라도 모든 코드는 다 클래스르 만들어서 객체를 만들어야 사용 할 수 있다.
    - 코틀린 같은 경우는 객체 지향과 동시에 함수형 프로그래밍 언어를 지원하고
    코틀린 같은 경우는 정말 클래스의 객체를 사용하는 그 목적 자체가 특정 매개체에 대한 데이터와 그 기능
    을 관리하기 위해서만 사용하고 그 외에 작성하는 코드는 다 함수로 만들어서 사용하는게 일반적이다.
    - 따라서 코틀린은 함수를 보다 편안하게 사용할 수 있도록 보다 다양한 개념들을 제공해준다.

*/

// # 함수를 간략하게 작성하기
// 내부 코드가 단 한 줄이고 어떤 값을 반환하는 형태임 -> 이 경우 한줄로 작성 가능
fun fun36_1(a1: Int, a2: Int): Int {
    return a1 + a2
}
fun fun36_1_1(a1: Int, a2: Int): Int = a1 + a2
fun fun36_1_2(a1: Int, a2: Int) = a1 + a2 // return type 이 추론 가능하므로 반환 타입 생략 가능

// # 람다식
// 특정 함수 내에서만 사용하는 연산 코드를 사용할 때 사용한다
fun lambdaTest() {
    val lambda: (Int, Int) -> Int = { a1: Int, a2: Int -> a1 + a2 }
    // data type 이 추론 가능하므로 생략
    val lambda2 = { a1: Int, a2: Int -> a1 + a2 }
    val lambda3: (Int, Int) -> Int = { a1, a2 -> a1 + a2 }
    val rv = lambda(100, 200)

    // 함수 vs 람다식
    fun fun36_2(a1: Int, a2: Int): Int {
        val r1 = a1 + a2
        val r2 = a1 - a2
        val r3 = r1 * r2
        return r3
    }
    val lambda4 = {a1: Int, a2: Int ->
        val r1 = a1 + a2
        val r2 = a1 - a2
        r1 * r2 // return 키워드 없이 마지막 줄에 그냥 값을 써 주면 된다.
    }
}
