package Introduction;

import entity.Personnel;

import java.util.Arrays;
import java.util.List;

public class AfterStreamsLambda {

    public static void main(String[] args) {

        List<Personnel> personnelList = Arrays.asList(new Personnel("sinan", 21), new Personnel("metin", 62));

        new AfterStreamsLambda().sumOfPersonnelAges(personnelList);

    }

    public int sumOfPersonnelAges(List<Personnel> personnelList) {

        final int[] i = {0};

        personnelList.stream().forEach(personnel -> i[0] += personnel.getAge());

        System.out.println("Age sum " + i[0]);

        return i[0];

    }

}
