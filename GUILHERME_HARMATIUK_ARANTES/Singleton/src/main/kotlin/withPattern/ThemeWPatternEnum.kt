package org.example.withPattern

import org.example.shared.LocaleEnum

enum class ThemeWPatternEnum(
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
    fun printable() {
        when(ConfigManagerWPattern.getLocale()) {
            LocaleEnum.PT_BR -> pt
            else -> en
        }.let { println(it) }
    }
}