public class maths {
    public static void main(String[] args){
        double x =3.14;
        double y =-10;
        double num = 15;

        double minumum = Math.min(x, y);
        // square root
        double root = Math.sqrt(num);

        // rounded
        double rounded = Math.round(root);

        //ceiling val
        double ceiling = Math.ceil(root);

        //floor val
        double floor = Math.floor(root);

        System.out.println("minimum: " + minumum);
        System.out.println("ceiling: " +ceiling);
        System.out.println("floor: " +floor);
    }
}
