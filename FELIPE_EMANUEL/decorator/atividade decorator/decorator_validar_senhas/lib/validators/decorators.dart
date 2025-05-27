import 'validator.dart';

abstract class DecoradorValidador implements Validador {
  final Validador outro;

  DecoradorValidador(this.outro);

  @override
  String? validar(String input) {
    return outro.validar(input);
  }
}

class NaoVazio extends DecoradorValidador {
  NaoVazio(Validador outro) : super(outro);

  @override
  String? validar(String input) {
    final erro = super.validar(input);
    if (erro != null) return erro;
    return input.trim().isEmpty ? 'Campo obrigatório' : null;
  }
}

class Minimo5Caracteres extends DecoradorValidador {
  Minimo5Caracteres(Validador outro) : super(outro);

  @override
  String? validar(String input) {
    final erro = super.validar(input);
    if (erro != null) return erro;
    return input.length < 5 ? 'Mínimo 5 caracteres' : null;
  }
}

class SemPalavrasProibidas extends DecoradorValidador {
  SemPalavrasProibidas(Validador outro) : super(outro);

  @override
  String? validar(String input) {
    final erro = super.validar(input);
    if (erro != null) return erro;

    final proibidas = ['bobo', 'feio', '1234'];
    for (var palavra in proibidas) {
      if (input.toLowerCase().contains(palavra)) {
        return 'Palavra proibida: $palavra';
      }
    }
    return null;
  }
}
