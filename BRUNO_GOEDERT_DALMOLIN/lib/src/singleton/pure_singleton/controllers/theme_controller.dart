class ThemeController {
  static final ThemeController _instance = ThemeController._internal();

  bool isDarkMode = false;

  ThemeController._internal();

  static ThemeController get instance => _instance;

  void toggleTheme() {
    isDarkMode = !isDarkMode;
  }
}