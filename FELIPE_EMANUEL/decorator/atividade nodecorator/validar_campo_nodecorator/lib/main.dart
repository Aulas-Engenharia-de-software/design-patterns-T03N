import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(home: ValidadorIngenuoScreen());
  }
}

class ValidadorIngenuoScreen extends StatefulWidget {
  const ValidadorIngenuoScreen({super.key});

  @override
  State<ValidadorIngenuoScreen> createState() => _ValidadorIngenuoScreenState();
}

class _ValidadorIngenuoScreenState extends State<ValidadorIngenuoScreen> {
  final TextEditingController controller = TextEditingController();
  String? erro;

  // Validação direta sem os decoradores
  String? validarInput(String input) {
    if (input.trim().isEmpty) {
      return 'Campo obrigatório';
    }

    if (input.length < 5) {
      return 'Mínimo 5 caracteres';
    }

    final proibidas = ['bobo', 'feio', '1234'];
    for (var palavra in proibidas) {
      if (input.toLowerCase().contains(palavra)) {
        return 'Palavra proibida: $palavra';
      }
    }

    return null;
  }

  void validarCampo() {
    setState(() {
      erro = validarInput(controller.text);
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text("Validação Ingênua")),
      body: Padding(
        padding: const EdgeInsets.all(20),
        child: Column(
          children: [
            TextField(
              controller: controller,
              decoration: InputDecoration(
                labelText: "Digite algo",
                errorText: erro,
              ),
            ),
            const SizedBox(height: 20),
            ElevatedButton(
              onPressed: validarCampo,
              child: const Text("Validar"),
            ),
            Text('Palavaras Proibidas: bobo feio 1234'),
          ],
        ),
      ),
    );
  }
}
