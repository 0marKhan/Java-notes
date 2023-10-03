public class StringClass {
    public static void main(String[] args){
        String name = "Omar";

        boolean result = name.equals("omar");
        boolean result2 = name.equalsIgnoreCase("omar");
        System.out.println("Checking if names equal, case sensitive: "+ result);
        System.out.println("checking if names equal, not case sensitive: "+ result2);
        System.out.println("checking name length: "+name.length());
        System.out.println("first character of name: "+name.charAt(0));
        System.out.println("returns index of 'm' in Omar: "+name.indexOf("m"));
        System.out.println("checks if name var is empty: " + name.isEmpty());
        System.out.println("returns uppercase name: "+name.toUpperCase());
        System.out.println("returns lowercase name: "+name.toLowerCase());
        System.out.println("trims empty spaces: " + name.trim());
        System.out.println("replace r with t: " + name.replace('r' , 't'));

    }
}
