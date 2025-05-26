import 'package:flutter/material.dart';
import 'package:patterns/src/pages/home_page.dart';

class BGDApp extends StatelessWidget {
  const BGDApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(title: "BGD App", home: HomePage());
  }
}
