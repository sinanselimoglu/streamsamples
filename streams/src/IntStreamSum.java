import entity.Personnel;

import java.util.Arrays;
import java.util.List;

public class IntStreamSum {

    public static void main(String[] args) {

        List<Personnel> personnelList = Arrays.asList(new Personnel("sinan", 27), new Personnel("metin", 62));

        int sum = new IntStreamSum().sumOfPersonnelAges(personnelList);

        System.out.println("Sum of ages : " + sum);

    }

    public int sumOfPersonnelAges(List<Personnel> personnelList) {

        return personnelList.stream().mapToInt(Personnel::getAge).sum();

    }
}
