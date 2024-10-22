import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();

        // Добавляем несколько слов в словарь по умолчанию
        dictionary.addWord(new Word("cat", "кот"));
        dictionary.addWord(new Word("dog", "собака"));
        dictionary.addWord(new Word("book", "книга"));
        dictionary.addWord(new Word("apple", "яблоко"));

        boolean running = true;

        while (running) {
            System.out.println("\nМеню:");
            System.out.println("1 - Перевод с английского на русский");
            System.out.println("2 - Перевод с русского на английский");
            System.out.println("3 - Добавить новое слово");
            System.out.println("4 - Показать все слова");
            System.out.println("5 - Выйти");

            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Считываем оставшийся ввод

            switch (choice) {
                case 1:  // Перевод (англ -> рус)
                    System.out.print("Введите слово на английском: ");
                    String word = scanner.nextLine();
                    System.out.println("Перевод: " + dictionary.findByWord(word));
                    break;

                case 2:  // Перевод (рус -> англ)
                    System.out.print("Введите перевод на русском: ");
                    String meaning = scanner.nextLine();
                    System.out.println("Английское слово: " + dictionary.findByTranslation(meaning));
                    break;

                case 3:  // Добавление нового слова
                    System.out.print("Введите новое слово на английском: ");
                    String newWord = scanner.nextLine();
                    System.out.print("Введите перевод на русском: ");
                    String newTranslation = scanner.nextLine();
                    dictionary.addWord(new Word(newWord, newTranslation));
                    System.out.println("Слово добавлено в словарь.");
                    break;

                case 4:  // Показать все слова
                    System.out.println("Словарь:");
                    System.out.println(dictionary);
                    break;

                case 5:  // Выход из программы
                    running = false;
                    System.out.println("Выход из программы...");
                    break;

                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
                    break;
            }
        }
    }
}
