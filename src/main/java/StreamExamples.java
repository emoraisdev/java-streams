import java.util.Comparator;
import java.util.stream.Stream;

public class StreamExamples {

    public static void main(String[] args) {

        Double[] notas = {5.5, 5.5, 7.3, 7.2};

        // MAP
        Stream.of(notas).map(d -> d + 2).map(d -> d - 1).forEach(System.out::println);

        System.out.println();

        // FILTER
        Stream.of(notas).filter(d -> d >= 7).map(d -> "Você foi aprovado com a nota: " + d).forEach(System.out::println);

        // REDUCE
        System.out.println("Média: "+ Stream.of(notas).reduce(Double::sum).map(s -> s/notas.length).get());

        // MATCH

        System.out.println("Não Teve nenhuma Aprovação: "+ Stream.of(notas).noneMatch(s -> s> 7));

        System.out.println("Houve alguma Aprovação: "+ Stream.of(notas).anyMatch(s -> s> 7));

        // MIN - MAX

        System.out.println("Menor nota: "+ Stream.of(notas).min(Comparator.naturalOrder()).get());

        System.out.println("Maior nota: "+ Stream.of(notas).max(Comparator.naturalOrder()).get());
    }
}
