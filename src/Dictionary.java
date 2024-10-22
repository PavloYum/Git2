import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    private final List<Word> words;

    // Конструктор без параметров, инициализируем пустой список слов
    public Dictionary() {
        words = new ArrayList<>();
    }

    // Конструктор с исходным списком слов
    public Dictionary(List<Word> words) {
        this.words = words;
    }

    // Метод добавления нового слова в словарь
    public void addWord(Word word) {
        words.add(word);  // Добавляем новое слово в список
    }

    // Метод для поиска слова по его значению (переводу)
    public String findByTranslation(String translation) {
        for (int i = 0; i < words.size(); i++) {
            Word word = words.get(i);
            if (word.getTranslation().equalsIgnoreCase(translation)) {
                return word.getWord();
            }
        }
        return "Слово с переводом '%s' не найдено.".formatted(translation);
    }

    // Метод для поиска перевода по слову
    public String findByWord(String word) {
        for (int i = 0; i < words.size(); i++) {
            Word currentWord = words.get(i);
            if (currentWord.getWord().equalsIgnoreCase(word)) {
                return currentWord.getTranslation();
            }
        }
        return "Перевод слова '" + word + "' не найден.";
    }

    // Метод для вывода всех слов
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            Word word = words.get(i);
            result.append(word).append(System.lineSeparator());
        }
        return result.toString();
    }
}
