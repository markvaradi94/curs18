package ro.fasttrackit.mvnbase.curs18.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.ofNullable("salut");
        System.out.println(stringOptional.get());

        Optional<String> emptyOptional = Optional.ofNullable(null);
        if (emptyOptional.isPresent()) {
            System.out.println(emptyOptional.get());
        } else {
            System.out.println("is empty");
        }

        String value = emptyOptional.orElse("altceva");
        System.out.println(value);

        emptyOptional = Optional.of("ceva");
        value = emptyOptional.orElse("altceva");
        System.out.println(value);
        System.out.println();

        Optional<String> result = find("nu");
        String message = result.orElse("nu am gasit");
        System.out.println(message);

        System.out.println(find("da").orElse("nu am gasit"));

        System.out.println();

        PersonService service = new PersonService(null);
        service.addPerson(new Person("Mihai", 25));
        service.addPerson(new Person("Stefan", 30));
        service.addPerson(new Person("Maria", 17));
        System.out.println(service.getPersonList());
        System.out.println();
        System.out.println(service.getByName("mark"));
        System.out.println(service.getByName("maria"));
        System.out.println();
        System.out.println(service.getByAge(14));
        System.out.println(service.getByAge(30));

    }

    public static Optional<String> find(String name) {
        if ("da".equalsIgnoreCase(name)) {
            return Optional.of("gasit");
        } else {
            return Optional.empty();
        }
    }
}
