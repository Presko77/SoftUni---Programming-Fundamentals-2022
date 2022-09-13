package Objects_and_Classes_Exercise;

import java.util.Scanner;

public class P02Article {

        private String title;
        private  String content;
        private  String author;

        public P02Article (String title, String content, String author) {

            this.title = title;
            this.content = content;
            this.author = author;

        }
        public void edit (String newContent) {
            this.content = newContent;
        }

        public void changeAuthor (String newAuthor) {
            this.author = newAuthor;
        }

        public void rename (String newTitle) {
            this.title = newTitle;
        }

        @Override
        public  String toString () {
            return this.title + " - " + this.content + ": " + this.author;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String articleDate = scanner.nextLine();

            String title = articleDate.split(", ")[0];
            String content = articleDate.split(", ")[1];
            String author = articleDate.split(", ")[2];

            P02Article article = new P02Article(title, content, author);

            int n = Integer.parseInt(scanner.nextLine());
            for (int i = 1; i <= n; i++) {
                String command = scanner.nextLine();

                String commandName = command.split("\\: ")[0];
                String newValue =  command.split("\\: ")[1];

                switch (commandName) {
                    case "Edit" :
                        article.edit(newValue);
                        break;
                    case "ChangeAuthor" :
                        article.changeAuthor(newValue);
                        break;
                    case "Rename" :
                        article.rename(newValue);
                        break;

                }
            }
            System.out.println(article.toString());
        }
    }


