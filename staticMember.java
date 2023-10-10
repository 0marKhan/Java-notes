public class staticMember {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");

        // can call this because numberOfFriends is static
        // System.out.println(Friend.numberOfFriends); 

        // we can call this function without craeting an instance
        // beacuse of the static method
        Friend.displayFriends();
    }
}

class Friend{
            String name;
            static int numberOfFriends;

            Friend(String name){
                this.name = name;
                numberOfFriends++;
            }

            static void displayFriends(){
                System.out.println("You have " + numberOfFriends + " friends");
            }
        }