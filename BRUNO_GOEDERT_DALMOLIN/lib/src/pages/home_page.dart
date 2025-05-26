import 'package:flutter/material.dart';
import 'package:patterns/src/singleton/no_singleton/controllers/theme_controller_ns.dart';
import 'package:patterns/src/singleton/pure_singleton/controllers/theme_controller.dart';

class HomePage extends StatefulWidget {
  const HomePage({super.key});

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("BGD App")),
      body: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          Text("BGD App"),
          Row(
            children: [
              Expanded(
                child: ElevatedButton(
                  onPressed: () async {
                    final controller = ThemeControllerNS();
                    controller.toggleTheme();
                  },
                  child: Text("No Singleton"),
                ),
              ),
            ],
          ),
          Row(
            children: [
              Expanded(
                child: ElevatedButton(
                  onPressed: () async {
                    ThemeController.instance.toggleTheme();

                    bool isDark = ThemeController.instance.isDarkMode;
                  },
                  child: Text("Singleton"),
                ),
              ),
            ],
          ),
          Row(
            children: [
              Expanded(
                child: ElevatedButton(
                  onPressed: () async {
                    ThemeController.instance.toggleTheme();

                    bool isDark = ThemeController.instance.isDarkMode;
                  },
                  child: Text("No Adapter"),
                ),
              ),
            ],
          ),
        ],
      ),
    );
  }
}
