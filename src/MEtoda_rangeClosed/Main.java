package MEtoda_rangeClosed;

import java.util.stream.*;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Long> liczby = LongStream.rangeClosed(10, 15)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(liczby);
    }
}
