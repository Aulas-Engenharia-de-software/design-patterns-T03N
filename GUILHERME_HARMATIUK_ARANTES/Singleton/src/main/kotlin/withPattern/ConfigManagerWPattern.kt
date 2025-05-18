package org.example.withPattern

import org.example.shared.LocaleEnum
import org.example.withoutPattern.ThemeWoPatternEnum

object ConfigManagerWPattern {
    private var locale = LocaleEnum.PT_BR
    private var theme = ThemeWPatternEnum.LIGHT_MODE

    fun setLocale(new: LocaleEnum) { locale = new }
    fun getLocale(): LocaleEnum = locale

    fun setTheme(new: ThemeWPatternEnum) { theme = new }
    fun getTheme(): ThemeWPatternEnum = theme

    fun localePrintable() = locale.printable()
    fun themePrintable() = theme.printable()
}