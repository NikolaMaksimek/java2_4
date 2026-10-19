
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      
            System.out.println("Wybierz operację:");
            System.out.println("1 – Suma (+)");
            System.out.println("2 – Różnica (-)");
            System.out.println("3 – Iloczyn (*)");
            System.out.println("4 – Iloraz (/)");
            System.out.print("Twój wybór (1-4): ");
            int wybor = scanner.nextInt();
            System.out.print("Podaj pierwszą liczbę: ");
            double liczba1 = scanner.nextDouble();

            System.out.print("Podaj drugą liczbę: ");
            double liczba2 = scanner.nextDouble();
            switch (wybor) {
                case 1:
                    System.out.println("Wynik sumy: " + (liczba1 + liczba2));
                    break;
                case 2:
                    System.out.println("Wynik różnicy: " + (liczba1 - liczba2));
                    break;
                case 3:
                    System.out.println("Wynik iloczynu: " + (liczba1 * liczba2));
                    break;
                case 4:
                    if (liczba2 == 0) {
                        System.out.println("Błąd: Nie można dzielić przez 0!");
                    } else {
                        System.out.println("Wynik ilorazu: " + (liczba1 / liczba2));
                    }
                    break;
                default:
                    System.out.println("Błąd: Wybrano nieprawidłową cyfrę z menu!");
                    break;
            }

            scanner.close();
        }
    }