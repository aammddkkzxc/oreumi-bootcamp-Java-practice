package _0220;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        members.add(new Member("김부장","black", 50));
        members.add(new Member("정대리","white", 32));
        members.add(new Member("권사원","green", 28));

        List<Person> people = members.stream().map(member -> new Person(member.getName(), member.getAge())).toList();
        people.forEach(System.out::println);
    }
}
