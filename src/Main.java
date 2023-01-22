public class Main {
    public static void main(String[] args) {
        String x = "1";
        String y = "1";
        System.out.println(x==y);

        String z = new String("1");
        String n = new String("1");
        System.out.println(z==n);
        System.out.println(x==n);

        char a = 'F';
        int num = (int)a;
        System.out.println(num);


        Integer i = new Integer(2);
        System.out.println(i);

        switch(i) {
            case 0: // i==0
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            default:
                System.out.println("default");
        }
    }
}

