import java.util.stream.Stream;

public class ConstrucaoStream {

    public static void main(String[] args) {
        Stream<Number> notas = Stream.of(5, 20, 20, 18, 48.2 , 7.9);
        notas.forEach(System.out::println);

        System.out.println();

        Number[] maisNotas = {7, 5.6, 9, 32.1};
        Stream.of(maisNotas).forEach(System.out::println);

        System.out.println();
        Stream.of(maisNotas).parallel().forEach(System.out::println);
    }
}
