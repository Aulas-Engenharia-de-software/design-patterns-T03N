package org.example.shared

enum class LocaleEnum(val str: String) {
    PT_BR("pt-br"),
    EN_US("en-us"),
    EN_UK("en-uk");

    fun printable() {
        when(this) {
            PT_BR -> "Linguagem: $str"
            else -> "Language: $str"
        }.let { println(it) }
    }
}