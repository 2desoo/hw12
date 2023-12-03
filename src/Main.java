public class Main {
    public static void main(String[] args) {
        Author gogol = new Author("Николай", "Гоголь");
        Book deadSouls = new Book("Мертвые души", 1842, gogol);
        deadSouls.setPublisherYear(2001);
        Author kiyosaki = new Author("Роберт", "Киосаки");
        Book richDad = new Book("Богатый и бедный папа", 1997, kiyosaki);
    }


}