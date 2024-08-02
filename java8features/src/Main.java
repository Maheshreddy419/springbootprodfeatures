import com.app.java8.parameters.Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        Integer[] arr  = {6,2,4,10,6,2,4,6,19,27,19};
//
//       List<Integer> all = Arrays.stream(arr).distinct().sorted().collect(Collectors.toList());
//        System.out.println(all);
//        System.out.println(all.get(all.size()-2));

        String name ="MaheshReddy";

     Map<String,Long> values =  Arrays.stream(name.split(""))
                  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

         values.forEach((k,v)->{
             System.out.println(k+":"+v);
         });
    }
}