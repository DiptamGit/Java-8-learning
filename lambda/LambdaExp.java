package lambda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class LambdaExp {

    public static void main(String[] args) {

        ArrayList<Developer> developers = getDeveloperList();

       /* System.out.println("Sorting with Comparator -->>");

        System.out.println("Before Sort");
        for(Developer developer : developers){
            System.out.println(developer);
        }

        System.out.println("After Sort");
        Collections.sort(developers, new Comparator <Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getSalary().compareTo(o2.getSalary());
            }
        });

        for(Developer developer : developers){
            System.out.println(developer);
        }*/


       //https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
        System.out.println("Sorting with Lambda -->>");

        System.out.println("Before Sort");
        for(Developer developer : developers){
            System.out.println(developer);
        }

        System.out.println("After Sort");
        developers.sort((Developer d1, Developer d2) -> d1.getSalary().compareTo(d2.getSalary()));
        developers.forEach((developer -> System.out.println(developer)));

        System.out.println("Reverse sort");
        Comparator<Developer> salaryComparator = (Developer d1, Developer d2) -> d1.getSalary().compareTo(d2.getSalary());
        developers.sort(salaryComparator.reversed());
        developers.forEach((developer -> System.out.println(developer)));

    }

    private static ArrayList<Developer> getDeveloperList() {

        ArrayList<Developer> list = new ArrayList <>();
        list.add(new Developer("Rob","Architect",new BigDecimal("7000")));
        list.add(new Developer("Tom","Tester",new BigDecimal("3000")));
        list.add(new Developer("Jack","Coder",new BigDecimal("5000")));

        return list;
    }
}
