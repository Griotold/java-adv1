package thread.start;

public class BadThreadMain {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + ": main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
        // start() 대신 run()을 호출
        helloThread.run();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 후");

        System.out.println(thread.getName() + ": main() end");
    }
}
