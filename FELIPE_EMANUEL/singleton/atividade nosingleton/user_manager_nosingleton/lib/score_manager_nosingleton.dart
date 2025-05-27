class SimpleScoreManager {
  int _score = 0;

  int get score => _score;

  void increaseScore(int value) {
    _score += value;
  }

  void resetScore() {
    _score = 0;
  }
}
