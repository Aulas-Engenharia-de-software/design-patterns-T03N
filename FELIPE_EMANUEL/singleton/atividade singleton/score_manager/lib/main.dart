import 'package:flutter/material.dart';
import 'score_manager.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});
  @override
  Widget build(BuildContext context) {
    return MaterialApp(home: const GameScreen());
  }
}

class GameScreen extends StatefulWidget {
  const GameScreen({super.key});
  @override
  State<GameScreen> createState() => _GameScreenState();
}

class _GameScreenState extends State<GameScreen> {
  void _addPoints() {
    ScoreManager().increaseScore(10);
    setState(() {});
  } //Singleton sendo utilizado

  void _resetGame() {
    ScoreManager().resetScore();
    setState(() {});
  }

  @override
  Widget build(BuildContext context) {
    int currentScore = ScoreManager().score;
    return Scaffold(
      appBar: AppBar(title: const Text("Jogo - Singleton")),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text(
              "Pontuação: $currentScore", // aqui tambem
              style: const TextStyle(fontSize: 24),
            ),
            const SizedBox(height: 20),
            ElevatedButton(
              onPressed: _addPoints,
              child: const Text("Ganhar 10 Pontos"),
            ),
            ElevatedButton(
              onPressed: _resetGame,
              child: const Text("Reiniciar Jogo"),
            ),
          ],
        ),
      ),
    );
  }
}
