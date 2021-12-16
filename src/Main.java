public class Main {
    public static void main(String[] args) {
        String text = "the age of the Pushinka is 2 years old and the weight is 2.5 kilograms.";
        TextDecoder textDecoder = new TextDecoder();


        Profile cat = textDecoder.decodeText(text);

        System.out.println("Name: " + cat.getName());
        System.out.println("Weight: " + cat.getWeight());
        System.out.println("Age: " + cat.getAge());

        System.out.println("We mast feed " + cat.getName());
        cat.feedCat();
        System.out.println("Cat's weight after feeding: " + cat.getWeight());


    }

}
