package Introduction;

import entity.Personnel;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class StreamMap {
    public static void main(String[] args) {

        List<Personnel> personnelList = Arrays.asList(new Personnel("sinan", 27), new Personnel("metin", 62));

        new StreamMap().sumOfPersonnelAges(personnelList);

    }

    public int sumOfPersonnelAges(List<Personnel> personnelList) {

        final int[] i = {0};

        personnelList.stream().mapToInt(new ToIntFunction<Personnel>() {
            @Override
            public int applyAsInt(Personnel personnel) {
                return personnel.getAge();
            }
        });

        System.out.println("Age sum " + i[0]);

        return i[0];

    }
}
