public class App {
    public static void main(String[] args) {

        Author strugatsky = new Author("Аркадий и Борис", "Стругацкие");
        Author irwinShaw = new Author("Ирвин", "Шоу");
        Book picnicRoadside = new Book("Пикник на обочине", strugatsky, 1972);
        Book porteNight  = new Book("Ночной портье", irwinShaw, 1975);

        System.out.println(picnicRoadside.getTitle());
        System.out.println(picnicRoadside.getAuthor().getFirstName() + " " + picnicRoadside.getAuthor().getLastName());
        System.out.println(picnicRoadside.getPublicationYear());
        System.out.println();
        System.out.println(porteNight.getTitle());
        System.out.println(porteNight.getAuthor().getFirstName() + " " + porteNight.getAuthor().getLastName());
        System.out.println(porteNight.getPublicationYear());
        picnicRoadside.setPublicationYear(1973);
        System.out.println(picnicRoadside.getPublicationYear());


    }

}
