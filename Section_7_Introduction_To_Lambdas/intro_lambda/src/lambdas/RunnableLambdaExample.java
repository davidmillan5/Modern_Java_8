package lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();


        // java 8 lambda

        Runnable runnableLambda = () -> {
            System.out.println("Inside Runnable 2");
        };

        new Thread(runnableLambda).start();

        Runnable runnableLambda2 = () -> System.out.println("Inside Runnable 3");

        new Thread(runnableLambda2).start();
    }
}
