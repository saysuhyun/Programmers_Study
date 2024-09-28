import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Seoul {
    public static void main(String[] args) {
        String[] seoul = { "Jane", "Kim" };

        ArrayList<String> strArr = new ArrayList<>(Arrays.asList(seoul));
        int idx = strArr.indexOf("Kim");
        String result = String.format("김서방은 %d에 있다", idx);
        System.out.println(result);
    }
}
