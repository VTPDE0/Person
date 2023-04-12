public class Main {
    private static String[] args;

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setAlter((int) 15f);
        System.out.println("Das Alter ist "+person1.getAlter());
    }
    /*public static void main(String[] args) {
        Main.args = args;
        Person person1 = new Person();
        person1.setVorname((string) "Teperyk");
        System.out.println("Die Vorname ist "+person1.getVorname());
    }*/
}