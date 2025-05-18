package org.example.withoutPattern

import org.example.shared.LocaleEnum

enum class ThemeWoPatternEnum(
    val en: String,
    val pt: String
) {
    LIGHT_MODE(
        "Light Mode",
        "Modo claro"
    ),
    DARK_MODE(
        "Dark Mode",
        "Modo escuro"
    );

    fun printable(localeEnum: LocaleEnum) {
        when(localeEnum) {
            LocaleEnum.PT_BR -> pt
            else -> en
        }.let { println(it) }
    }
}