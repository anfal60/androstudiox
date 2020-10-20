package id.go.kemenkeu.githubusers;

import java.util.ArrayList;

public class UserData {
    
    private static String[] userNameUser = {
        "JakeWharton",
        "amitshekhariitbhu",
        "romainguy",
        "chrisbanes",
        "tipsy",
        "ravi8x",
        "jasoet",
        "budioktaviyan",
        "hendisantika",
        "sidiqpermana"
    };

    private static String[] nameUser = {
    "Jake Wharton",
    "Amit Shekhar",
    "Romain Guy",
    "Chris Banes",
    "David",
    "Ravi Tamada",
    "Deny Prasetyo",
    "Budi Oktaviyan",
    "Hendi Santika",
    "Sidiq Permana"
    };

    private static String[] locationUser = {
        "Pittsburgh, PA, USA",
        "New Delhi, India",
        "California",
        "Sydney, Australia",
        "Trondheim, Norway",
        "India",
        "Kotagede, Yogyakarta, Indonesia",
        "Jakarta, Indonesia",
        "Bojongsoang - Bandung Jawa Barat",
        "Jakarta Indonesia"
    };

    private static String[] repositoryUser = {
        "102",
        "37",
        "9",
        "30",
        "56",
        "28",
        "44",
        "110",
        "1064",
        "65"
    };

    private static String[] companyUser = {
        "Google, Inc.",
        "MindOrksOpenSource",
        "Google",
        "Google working on @android",
        "Working Group Two",
        "AndroidHive | Droid5",
        "gojek-engineering",
        "KotlinID",
        "JVMDeveloperID @KotlinID @IDDevOps",
        "Nusantara Beta Studio"
    };

    private static String[] followersUser = {
        "56995",
        "5153",
        "7972",
        "14725",
        "788",
        "18628",
        "277",
        "178",
        "428",
        "465"
    };

    private static String[] followingUser = {
        "12",
        "2",
        "0",
        "1",
        "0",
        "3",
        "39",
        "23",
        "61",
        "10"
    };

    private static int[] avatarUser = {
        R.drawable.user1,
        R.drawable.user2,
        R.drawable.user3,
        R.drawable.user4,
        R.drawable.user5,
        R.drawable.user6,
        R.drawable.user7,
        R.drawable.user8,
        R.drawable.user9,
        R.drawable.user10
    };

    static ArrayList<User> getListData() {
        ArrayList<User> list = new ArrayList<>();
        for (int position = 0; position < userNameUser.length; position++){
            User user = new User();
            user.setName(nameUser[position]);
            user.setUsername(userNameUser[position]);
            user.setLocation(locationUser[position]);
            user.setCompany(companyUser[position]);
            user.setRepository(repositoryUser[position]);
            user.setFollower(followersUser[position]);
            user.setFollowing(followingUser[position]);
            user.setPhoto(avatarUser[position]);

            list.add(user);
        }
        return list;
    }
}
