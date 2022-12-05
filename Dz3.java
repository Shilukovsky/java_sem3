import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Dz3 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(4,64,13,74,424,567,3,46,45,86);
        IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println(stats);
    }
}            