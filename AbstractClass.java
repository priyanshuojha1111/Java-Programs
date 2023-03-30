abstract class abs {
    abstract void run();

    void fast() {
        System.out.println("ojha ji fast");
    }
}

class AbstractClass extends abs {
      void run() {
        System.out.println("runnin");
        
    }
    void fast() {
        System.out.println("ojha ji greatt");
    }

    public static void main(String[] args) {
        AbstractClass ab = new AbstractClass();

        ab.fast();
        ab.run();
    }

}
