package day31.Restaurant;

public class LocalRestaurant {
    public static void main(String[] args) {


        Server server1 = new Server("Kerem",1235,15,true);
        Server server2 = new Server("Muge",1256,16,false);
        Server server3 = new Server("Ufuk",1254, 1251, true);


        Server [] servers = {server1,server2,server3};


        Chef chef1 = new Chef("Sinan",2011,20,true);
        Chef chef2 = new Chef("Ayse", 2022,22,false);
        Chef chef3 = new Chef("Jon",2010,22,true);


        Chef [] chefs = {chef1,chef2,chef3};

        Restaurant restaurantInformation = new Restaurant("Ali","UES",5);

        restaurantInformation.hireServer(server1);
        restaurantInformation.hireServer(server2);
        restaurantInformation.hireServer(server3);
        restaurantInformation.hireChef(chefs);

        System.out.println(restaurantInformation);


        for (Server server : servers) {

            System.out.println(server.name + server.fullTime);

        }





    }
}





/*

	6.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set.
	        	 Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set.
	             Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information





 */
