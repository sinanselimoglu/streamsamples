package StreamFunctions;

import entity.Address;
import entity.Personnel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Problem with spaghetti code
 */
public class Problem {

    public static void main(String[] args) {

        Personnel p1 = new Personnel("sinan", 33);
        Personnel p2 = new Personnel("metin", 62);
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

        List<String> districtNames = new ArrayList<>();

        for (Personnel personnel : personnelList) {                         // foreach

            if (personnel.getAge() > 30) {                                  // filter

                for (Address address : personnel.getAddressList()) {        // map

                    String district = address.getDistrict();

                    if (!districtNames.contains(district)) {                // distinct

                        districtNames.add(district);                        // collect

                    }

                }

            }

        }

        return districtNames;
    }

}
