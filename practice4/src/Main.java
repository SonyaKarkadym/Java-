import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Product> map = new HashMap<>();
        map.put("cat",new Product(2,"middle"));
        map.put("dog",new Product(1,"small"));
        map.put("chubaka",new Product());
//        Set<Map.Entry<String,Product>> entries = map.entrySet();
//        Iterator<Map.Entry<String, Product>> iterator = entries.iterator();
//        while(iterator.hasNext()){
//            System.out.println(map);
//        }

        map.entrySet().forEach(entry -> System.out.println(entry.getKey()+entry.getValue()));
        map.keySet().forEach(System.out::println);
        map.values().forEach(value -> System.out.println(value));
        map.keySet().stream().filter(s -> s.startsWith("c")).forEach(System.out::println);

        List<String> list = new ArrayList<>(map.keySet());
        System.out.println(list);
        List<Product> list2 = new ArrayList<>();
        List<Integer> collect = map.values().stream().map(v -> v.getAge()).collect(Collectors.toList());
//        List<Integer> list3 = new ArrayList<>(map.values().forEach(value -> value.getAge()));

    }
}
