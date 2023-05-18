package mocking;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        SpartanRepository.addSpartan(new Spartan(1, "Manish", "Java", LocalDate.of(2022, 10, 10)));
        if (SpartanRepository.findSpartan(1).isPresent()) {
            System.out.println(SpartanRepository.findSpartan(1).get().getName());
        }
    }
}
