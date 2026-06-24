public class About_Myself {

    class AboutMyself {
        public static void main(String[] args) {
            // Personal details
            String name = "Elijah Frimpong";
            int age = 22;
            String location = "Koforidua, Eastern Region, Ghana";
            String hobby = "Tech Enthusiast";
            String favoriteGame = "Grand Theft Auto V";

            //Nationality (boolean)
            boolean Ghanaian = true;// change to false if not Ghanaian


            // Displaying information
            System.out.println("*** About Myself ***");
            System.out.println("Name: " + name);

            //Nationality (boolean)
            if (Ghanaian) {
                System.out.println("Nationality: Ghanaian");
            }else {
                System.out.println("Nationality: Not Ghanaian");
            }

            System.out.println("Age: " + age);
            System.out.println("Location: " + location);
            System.out.println("Hobby: " + hobby);
            System.out.println("Favorite Game: " + favoriteGame);



            // Fun message
            System.out.println("\nNice to meet you!");
        }
    }
}
