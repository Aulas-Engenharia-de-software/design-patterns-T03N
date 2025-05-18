package org.example.withoutPattern

import org.example.shared.LocaleEnum
import org.example.withoutPattern.ThemeWoPatternEnum

class ConfigManagerWoPattern {
    private var locale = LocaleEnum.PT_BR
    private var theme = ThemeWoPatternEnum.LIGHT_MODE

    fun setLocale(new: LocaleEnum) { locale = new }
    fun getLocale(): LocaleEnum = locale

    fun setTheme(new: ThemeWoPatternEnum) { theme = new }
    fun getTheme(): ThemeWoPatternEnum = theme

    fun localePrintable() { locale.printable() }
    fun themePrintable() { theme.printable(locale) }
}