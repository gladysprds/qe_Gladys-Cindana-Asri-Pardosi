
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

    public class Main {
        public static void main(String[] args) {
            String[] string1 = {"kazuya", "jin", "lee"};
            String[] string2 = {"kazuya", "jin", "lee", "feng"};
            String[] string3 = {"lee", "jin"};
            String[] string4 = {"kazuya", "panda"};
            List list = new ArrayList(Arrays.asList(string1));
            list.addAll(Arrays.asList(string2));
            list.addAll(Arrays.asList(string4));
            String[] result =
                    Stream.concat(
                                    Stream.of(string1),
                                    Stream.of(string2))
                            .distinct()
                            .toArray(String[]::new);
            System.out.println(Arrays.toString(result));
            System.out.println("");
            String[] result2 =
                    Stream.concat(
                                    Stream.of(string3),
                                    Stream.of(string4))
                            .distinct()
                            .toArray(String[]::new);
            System.out.println(Arrays.toString(result2));
        }
    }



