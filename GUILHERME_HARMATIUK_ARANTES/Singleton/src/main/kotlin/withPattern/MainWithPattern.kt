package org.example.withPattern

import org.example.shared.LocaleEnum

class MainWithPattern {
    init {
        /** Sem atribuir a uma variável **/
        println("Aqui, printam com os default da aplicação, já que ainda não teve alteração.")
        ConfigManagerWPattern.localePrintable()
        ConfigManagerWPattern.themePrintable()
        println("\n")

        /** Atribuindo a uma variável, mudando o valor na variável, e printando o valor novo em ambos. **/
        val configManager1 = ConfigManagerWPattern
        configManager1.setLocale(LocaleEnum.EN_UK)
        println("Aqui, printamos a linguagem da aplicação após atribuir o manager a uma variável.")
        println("Foi atríbuido o valor novo somente para a variável, mas como utiliza o Singleton, a mudança irá afetar ambos.")
        println("ConfigManager1:")
        configManager1.localePrintable()
        println("Object:")
        ConfigManagerWPattern.localePrintable()
        println("\n")

        /** Atribuindo Singleton a uma segunda variável, e mudando o valor nessa segunda,
         * e comparando os prints de ambas.
         */
        println("Neste exemplo, criamos agora o configManager2, que também usa o manager.")
        println("Usando ele, alteramos a linguagem e o tema para pt-br e modo escuro.")
        println("Como ele utiliza do Singleton, então as alterações vão afetar o configManager1 também.")
        val configManager2 = ConfigManagerWPattern
        configManager2.setTheme(ThemeWPatternEnum.DARK_MODE)
        configManager2.setLocale(LocaleEnum.PT_BR)
        println("ConfigManager1:")
        configManager1.themePrintable()
        println("ConfigManager2:")
        configManager2.themePrintable()

    }
}