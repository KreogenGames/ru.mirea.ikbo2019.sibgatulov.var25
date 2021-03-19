package ThirdPractice;

public class Test {
    static class thread extends Thread {
        @Override
        public void run() {
            SetSem setSem = new SetSem();
            setSem.add(43980);
            setSem.add(578);
            setSem.add(364);
            setSem.add(1);
            System.out.println("Тест конструкции Set с ключевым словом Semaphore {"+setSem+"}");
            System.out.println(setSem.size());
            System.out.println(setSem.contains(2));
            setSem.remove(43980);
        }
    }
    static class thread1 extends Thread {
        @Override
        public void run() {
            MapSynch ms = new MapSynch();
            //trying different methods
            ms.put(1, 5);
            ms.put(2, 4);
            ms.put(3, 3);
            ms.put(4, 2);
            ms.put(5, 1);
            System.out.println("Тест конструкции Map с synchronized {"+ms+"}");
            System.out.println(ms.size());
            System.out.println(ms.containsKey(2));
            ms.remove(3);
            System.out.println(ms.containsValue(3));
        }
    }
    public static void main(String[] args) {

        thread setSem = new thread();
        setSem.start();
        thread1 ms = new thread1();
        ms.start();
    }
}
