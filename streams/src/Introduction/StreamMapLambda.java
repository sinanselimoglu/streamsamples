package Introduction;

import entity.Personnel;

import java.util.Arrays;
import java.util.List;

public class StreamMapLambda {

    public static void main(String[] args) {

        List<Personnel> personnelList = Arrays.asList(new Personnel("sinan", 27), new Personnel("metin", 62));

        new StreamMapLambda().sumOfPersonnelAges(personnelList);

    }

    public int sumOfPersonnelAges(List<Personnel> personnelList) {

        personnelList.stream().mapToInt(Personnel::getAge);

        return 0;

    }
}
