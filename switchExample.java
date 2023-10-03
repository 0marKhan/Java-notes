public class switchExample {
    public static void main(String[] args){
        String day = "Friday";

        switch(day){
            case "Monday":
                System.out.println("Its Monday");
                break;
            case "Tuesday":
                System.out.println("Its Tuesday");
                break;
            case "Wednesday":
                System.out.println("Its Wednesday");
                break;
            case "Thursday":
                System.out.println("Its Thursday");
                break;
            case "Friday":
                System.out.println("Its Friday");
                break;
            case "Saturday":
                System.out.println("Its Saturday");
                break;
            case "Sunday":
                System.out.println("Its Sunday");
                break;
            default:
                System.out.println("That is not a day");
        }
    }
}
