package src.org.fasttrackid.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println(lastName("Alex Paltinean"));
        System.out.println(lastName("Alex"));

        String lastName = lastName("Alex");
        if (lastName != null) {
            if (lastName.length() > 3) {
                System.out.println("Last name is longer than 3 characters");
            } else {
                System.out.println("Last name is shorter than 3 characters");
            }
        } else {
            System.out.println("No last name was found");
        }

        // with optional
        Optional<String> lastNameOptional = lastNameOptional("Alex");
        if (lastNameOptional.isPresent()) {
            if (lastNameOptional.get().length() > 3) {
                System.out.println("Last name is longer than 3 characters");
            } else {
                System.out.println("Last name is shorter than 3 characters");
            }
        } else {
            System.out.println("No last name was found");
        }

        String lastNameNonOptional = lastNameOptional.orElse("");
        System.out.println(lastNameNonOptional.length());

        String name = "Alex Paltinean";
        lastNameOptional = lastNameOptional(name);
        String lastNameFound = lastNameOptional.orElseGet(() -> getFromServer(name));
        System.out.println(lastNameFound);
    }

    public static String getFromServer(String firstName) {
        return "LastNameFromServer";
    }

    public static String lastName(String fullName) {
        String[] s = fullName.split(" ");
        if (s.length > 1) {
            return s[s.length - 1];
        }
        return null;
    }

    public static Optional<String> lastNameOptional(String fullName) {
        String[] s = fullName.split(" ");
        if (s.length > 1) {
            return Optional.of(s[s.length - 1]);
        }
        return Optional.empty();
    }


}
