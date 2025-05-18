package org.example.withoutPattern

import org.example.shared.LocaleEnum
import org.example.withPattern.ConfigManagerWPattern
import org.example.withPattern.ThemeWPatternEnum

class MainWithoutPattern {
    init {
        /** Sem atribuir a uma variável **/
        println("Aqui, printam com os default da aplicação, já que ainda não teve alteração.")
        ConfigManagerWoPattern().localePrintable()
        ConfigManagerWoPattern().themePrintable()
        println("\n")

        /** Atribuindo a uma variável, mudando o valor na variável, e printando o valor novo em ambos. **/
        val configManager1 = ConfigManagerWoPattern()
        configManager1.setLocale(LocaleEnum.EN_UK)
        println("Aqui, já que o Singleton não é usado, as configurações do configManager1 " +
                "vão estar diferentes da do ConfigManager2:")
        println("ConfigManager1:")
        configManager1.localePrintable()
        println("Object:")
        ConfigManagerWoPattern().localePrintable()
        println("\n")

        /** Atribuindo Singleton a uma segunda variável, e mudando o valor nessa segunda,
         * e comparando os prints de ambas
         */
        val configManager2 = ConfigManagerWoPattern()
        configManager2.setTheme(ThemeWoPatternEnum.DARK_MODE)
        configManager2.setLocale(LocaleEnum.PT_BR)
        println("Aqui, mudamos o valor do tema e linguagem no configManager2.")
        println("Igual ao último exemplo, já que não fazemos uso do Singleton, ")
        println("as configurações do configManager1 serão diferentes")

        println("Config Manager 1:")
        configManager1.themePrintable()
        println("Config Manager 2:")
        configManager2.themePrintable()


        println("\n")
        println("O Singleton, além de outras coisas, serve para resolver esses" +
                " problemas de divergências de dados, ao criar uma instância global e única.")
    }
}