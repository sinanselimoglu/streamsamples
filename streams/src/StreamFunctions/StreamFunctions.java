package StreamFunctions;

import entity.Address;
import entity.Personnel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFunctions {

    public static void main(String[] args) {

        Personnel p1 = new Personnel("sinan", 33);
        Personnel p2 = new Personnel("metin2", 62);
        Personnel p3 = new Personnel("semih", 43);
        Personnel p4 = new Personnel("ali", 9);

        p1.setAddressList(Arrays.asList(new Address("Istanbul", "Levent"), new Address("Istanbul", "Sisli")));
        p2.setAddressList(Arrays.asList(new Address("Istanbul", "Kadikoy"), new Address("Istanbul", "Bebek")));
        p3.setAddressList(Arrays.asList(new Address("Istanbul", "Levent"), new Address("Istanbul", "Kadikoy")));
        p4.setAddressList(Arrays.asList(new Address("Istanbul", "Beykoz"), new Address("Istanbul", "Kadikoy")));

        List<Personnel> personnelList = Arrays.asList(p1, p2, p3, p4);

        List<String> cityNames = findCityNames(personnelList);

        cityNames.forEach(System.out::println);
    }

    private static List<String> findCityNames(List<Personnel> personnelList) {

        return personnelList.stream()
                .filter(p -> p.getAge() > 30)
                .flatMap(personnel -> personnel.getAddressList().stream())
                .map(Address::getDistrict)
                .distinct()
                .collect(Collectors.toList());

    }

}
