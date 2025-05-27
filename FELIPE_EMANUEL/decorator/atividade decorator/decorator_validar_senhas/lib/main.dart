import 'package:flutter/material.dart';
import 'validators/validator.dart';
import 'validators/base_validator.dart';
import 'validators/decorators.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});
  @override
  Widget build(BuildContext context) {
    return const MaterialApp(home: ValidadorScreen());
  }
}

class ValidadorScreen extends StatefulWidget {
  const ValidadorScreen({super.key});

  @override
  State<ValidadorScreen> createState() => _ValidadorScreenState();
}

class _ValidadorScreenState extends State<ValidadorScreen> {
  final TextEditingController controller = TextEditingController();
  String? erro;

  late Validador validador;

  @override
  void initState() {
    super.initState();
    validador = NaoVazio(
      Minimo5Caracteres(SemPalavrasProibidas(ValidadorBase())),
    );
  }

  void validarCampo() {
    setState(() {
      erro = validador.validar(controller.text);
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text("Decorator - Validação")),
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
            Text(
              'palavras proibidas: bobo, feio, 1234!',
            ), //facilitar o entendimento do codigo
          ],
        ),
      ),
    );
  }
}
