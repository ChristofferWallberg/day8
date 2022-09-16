public class Main {
    public static void main(String[] args) {
        String sayHello = "Hej och god morgon!";
        System.out.println(sayHello);

        Animal horse1 = new Animal(4,"Loke", "horse");
        Animal horse2 = new Animal(4);

        System.out.println(horse1.getAge());
    }
}
