import entity.Personnel;

import java.util.Arrays;
import java.util.List;

public class BeforeStreams {

    public static void main(String[] args) {

        List<Personnel> personnelList = Arrays.asList(new Personnel("sinan", 21), new Personnel("metin", 62));

        new BeforeStreams().sumOfPersonnelAges(personnelList);

    }

    public int sumOfPersonnelAges(List<Personnel> personnelList) {

        int ageSum = 0;

        for (Personnel personnel : personnelList) {

            ageSum += personnel.getAge();

        }

        System.out.println("Ages sum : " + ageSum);

        return ageSum;

    }
}
