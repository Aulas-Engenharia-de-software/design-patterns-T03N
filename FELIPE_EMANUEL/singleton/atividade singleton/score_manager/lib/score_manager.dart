class ScoreManager {
  static final ScoreManager _instance = ScoreManager._internal();

  ScoreManager._internal();

  factory ScoreManager() {
    return _instance;
  }

  int _score = 0;

  int get score => _score;

  void increaseScore(int value) {
    _score += value;
  }

  void resetScore() {
    _score = 0;
  }
}
