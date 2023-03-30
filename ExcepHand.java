public class ExcepHand {
    public static void main(String[] args) {

        try {
            int arr[] = { 1, 2, 3, 4 };
            System.out.println(arr[3]);
            System.out.println(Integer.parseInt("997"));
            System.out.println(arr[0]);

            System.out.println(100 + "5");
            System.out.println("kuch bhi banao");

        } catch (ArithmeticException e) {
            System.out.println(e + " " + " hello");
            System.out.println("fgnmfjg");
        } catch (ArrayIndexOutOfBoundsException t) {
            System.out.println(t + "\nojha ji");
        } catch (Exception r) {
            System.out.println(r);
            System.out.println("ojjjjj jiiii");

        }
    }
}
