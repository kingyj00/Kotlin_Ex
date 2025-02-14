package com.ll

class User(val username: String, val age: Int) {
    init {
        // require()는 주어진 조건이 false면 IllegalArgumentException을 던짐
        require(username.length >= 3) { "사용자 이름은 최소 3글자 이상이어야 합니다." }
        require(age in 1..150) { "나이는 1 이상 150 이하이어야 합니다." }

        // check()는 주어진 조건이 false면 IllegalStateException을 던짐
        check(username.all { it.isLetterOrDigit() }) { "사용자 이름은 영문자와 숫자만 포함해야 합니다." }
    }

    override fun toString(): String {
        return "User(username='$username', age=$age)"
    }
}

fun main() {
    val user1 = User("Alice123", 25) // 정상
    println(user1)

    val user2 = User("Aaa", 30) // 예외 발생: 사용자 이름은 3글자 이상이어야 함
    val user3 = User("Bob", 10) // 예외 발생: 나이는 1 이상이어야 함
    val user4 = User("JohnDoe", 40) // 예외 발생: 영문자와 숫자만 포함해야 함
}