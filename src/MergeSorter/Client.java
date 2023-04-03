package MergeSorter;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arrayToSort = List.of(4,5,2,7,8,6,1,3);

        ExecutorService executorService = Executors.newCachedThreadPool();
        MergeSorter mergeSorter = new MergeSorter(arrayToSort, executorService);

        Future<List<Integer>> sortedArrayFuture = executorService.submit(mergeSorter);
        List<Integer> sortedArray = sortedArrayFuture.get();

        System.out.println(sortedArray);
    }
}
