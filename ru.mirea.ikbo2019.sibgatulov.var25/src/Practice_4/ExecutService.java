package Practice_4;

import java.util.concurrent.*;

public class ExecutService {
    private ExecutorService executorService;

    public ExecutService(int num) throws ExecutionException, InterruptedException{
        executorService = Executors.newFixedThreadPool(num);

        Callable<String> name = () -> Thread.currentThread().getName();

        for (int i = 0; i < num; i++) {
            Future result = executorService.submit(name);
            System.out.println("Поток номер " + (i+1) + " называется " + result.get());
        }
        executorService.shutdown();
    }
}
