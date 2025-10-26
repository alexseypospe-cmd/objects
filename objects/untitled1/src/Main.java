public class Main {
    public static void main(String[] args) {

        Author strugatsky = new Author("Аркадий и Борис", "Стругацкие");
        Author irwinShaw = new Author("Ирвин", "Шоу");
        Book picnicRoadside = new Book("Пикник на обочине", strugatsky, 1972);
        Book porteNight  = new Book("Ночной портье", irwinShaw, 1975);

        System.out.println("Книга 1: " + picnicRoadside.getTitle());
        System.out.println("Автор: " + picnicRoadside.getAuthor().getFirstName() + " " + picnicRoadside.getAuthor().getLastName());
        System.out.println("Год публикации: " + picnicRoadside.getPublicationYear());
        System.out.println();
        System.out.println("Книга 2: " + porteNight.getTitle());
        System.out.println("Автор: " + porteNight.getAuthor().getFirstName() + " " + porteNight.getAuthor().getLastName());
        System.out.println("Год публикации: " + porteNight.getPublicationYear());
        picnicRoadside.setPublicationYear(1973);
        System.out.println("Обновлённый год публикации " + picnicRoadside.getPublicationYear());


    }
}