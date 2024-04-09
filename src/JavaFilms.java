import java.util.*;

class Film {
    String name;
    int budget;

    Film(String name, int budget) {
        this.name = name;
        this.budget = budget;
    }
}

public class JavaFilms {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "cp1251");
        System.out.println("Vvedite kolichestvo filmov:");
        int kol = in.nextInt();
        Film[] films = new Film[kol];
        in.nextLine();
        for (int i = 0; i < kol; i++) {
            System.out.println("Vvedite nazvanie " + (i + 1) + " filma - ");
            String name = in.nextLine();
            System.out.println("Vvedite budjet " + (i + 1) + " filma - ");
            int budget = in.nextInt();
            in.nextLine();
            films[i] = new Film(name, budget);
        }

        // Adding a new film after the user has entered information about other films
        System.out.println("Vvedite nazvanie novogo filma - ");
        String newFilmName = in.nextLine();
        System.out.println("Vvedite budjet novogo filma - ");
        int newFilmBudget = in.nextInt();
        in.nextLine();
        Film newFilm = new Film(newFilmName, newFilmBudget);
        Film[] newFilmsArray = new Film[films.length + 1];
        System.arraycopy(films, 0, newFilmsArray, 0, films.length);
        newFilmsArray[films.length] = newFilm;
        films = newFilmsArray;

        // Printing the updated list of films
        for (int i = 0; i < films.length; i++) {
            System.out.println("Nazvanie filma " + (i + 1) + ": " + films[i].name);
            System.out.println("Budjet filma " + (i + 1) + ": " + films[i].budget);
        }
    }
}