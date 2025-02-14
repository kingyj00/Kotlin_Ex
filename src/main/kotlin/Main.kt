package com.ll

class Person(
    private var _name: String
) {

    var name: String
        get() {
            if (_name.isEmpty()) {
                throw IllegalStateException("이름이 설정되지 않았습니다.")
            }
            return _name
        }
        set(value) {
            require(value.isNotEmpty()) { "이름은 비어 있을 수 없습니다." }
            _name = value
        }
}