import 'package:flutter/material.dart';
import 'score_manager_nosingleton.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});
  @override
  Widget build(BuildContext context) {
    return MaterialApp(home: GameScreen());
  }
}

class GameScreen extends StatefulWidget {
  @override
  State<GameScreen> createState() => _GameScreenState();
}

class _GameScreenState extends State<GameScreen> {
  final SimpleScoreManager scoreManager =
      SimpleScoreManager(); // CADA tela teráadas o seu

  void _addPoints() {
    scoreManager.increaseScore(10);
    setState(() {});
  }

  void _resetGame() {
    scoreManager.resetScore();
    setState(() {});
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text("Jogo - Sem Singleton")),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text(
              "Pontuação: ${scoreManager.score}",
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
