import com.nhlstenden.company.Company;
import com.nhlstenden.destination.Destination;
import com.nhlstenden.route.Route;

public class Main
{
    public static void main (String[] args)
    {
        Company pizzaCompany = new Company();

        //=======ROUTE 1======//
        Route route1 = new Route();

        Destination destination1Route1 = new Destination("Grote Huis", "Stationplein 2", 5, 4);
        Destination destination1Route0 = new Destination("Grote Huis", "Stationplein 2", 5, 4);
        Destination destination2Route1 = new Destination("Kleine Huis", "Marktstraat 10", 3, 6);
        Destination destination3Route1 = new Destination("Midden Huis", "Dorpsstraat 5", 7, 8);
        Destination destination4Route1 = new Destination("Hoog Huis", "Bergweg 12", 2, 5);
        Destination destination5Route1 = new Destination("Laag Huis", "Valleiweg 3", 4, 7);
        Destination destination6Route1 = new Destination("Oud Huis", "Historischelaan 8", 6, 3);
        Destination destination7Route1 = new Destination("Nieuw Huis", "Moderneweg 15", 8, 9);

        route1.addDestination(destination1Route0);
        route1.addDestination(destination1Route1);
        route1.addDestination(destination2Route1);
        route1.addDestination(destination3Route1);
        route1.addDestination(destination4Route1);
        route1.addDestination(destination5Route1);
        route1.addDestination(destination6Route1);
        route1.addDestination(destination7Route1);
        //=======================================//

        //=======ROUTE 2======//
        Route route2 = new Route();

        Destination destination1Route2 = new Destination("Huis A", "Straat A 1", 5, 10);
        Destination destination2Route2 = new Destination("Huis B", "Straat B 2", 3, 12);
        Destination destination3Route2 = new Destination("Huis C", "Straat C 3", 7, 14);
        Destination destination4Route2 = new Destination("Huis D", "Straat D 4", 2, 16);
        Destination destination5Route2 = new Destination("Huis E", "Straat E 5", 4, 18);
        Destination destination6Route2 = new Destination("Huis F", "Straat F 6", 6, 20);
        Destination destination7Route2 = new Destination("Huis G", "Straat G 7", 8, 22);

        route2.addDestination(destination1Route2);
        route2.addDestination(destination2Route2);
        route2.addDestination(destination3Route2);
        route2.addDestination(destination4Route2);
        route2.addDestination(destination5Route2);
        route2.addDestination(destination6Route2);
        route2.addDestination(destination7Route2);
        //=======================================//

        //=======ROUTE 3======//
        Route route3 = new Route();

        Destination destination1Route3 = new Destination("Huis X", "Straat X 1", 5, 5);
        Destination destination2Route3 = new Destination("Huis Y", "Straat Y 2", 3, 6);
        Destination destination3Route3 = new Destination("Huis Z", "Straat Z 3", 7, 7);
        Destination destination4Route3 = new Destination("Huis W", "Straat W 4", 2, 8);
        Destination destination5Route3 = new Destination("Huis V", "Straat V 5", 4, 9);
        Destination destination6Route3 = new Destination("Huis U", "Straat U 6", 6, 10);
        Destination destination7Route3 = new Destination("Huis T", "Straat T 7", 8, 11);

        route3.addDestination(destination1Route3);
        route3.addDestination(destination2Route3);
        route3.addDestination(destination3Route3);
        route3.addDestination(destination4Route3);
        route3.addDestination(destination5Route3);
        route3.addDestination(destination6Route3);
        route3.addDestination(destination7Route3);
        //=======================================//

        //=======ROUTE 4======//
        Route route4 = new Route();

        Destination destination1Route4 = new Destination("Huis M", "Straat M 1", 5, 15);
        Destination destination2Route4 = new Destination("Huis N", "Straat N 2", 3, 16);
        Destination destination3Route4 = new Destination("Huis O", "Straat O 3", 7, 17);
        Destination destination4Route4 = new Destination("Huis P", "Straat P 4", 2, 18);
        Destination destination5Route4 = new Destination("Huis Q", "Straat Q 5", 4, 19);
        Destination destination6Route4 = new Destination("Huis R", "Straat R 6", 6, 20);
        Destination destination7Route4 = new Destination("Huis S", "Straat S 7", 8, 21);

        route4.addDestination(destination1Route4);
        route4.addDestination(destination2Route4);
        route4.addDestination(destination3Route4);
        route4.addDestination(destination4Route4);
        route4.addDestination(destination5Route4);
        route4.addDestination(destination6Route4);
        route4.addDestination(destination7Route4);
        //=======================================//

        //=======ROUTE 5======//
        Route route5 = new Route();

        Destination destination1Route5 = new Destination("Huis K", "Straat K 1", 5, 25);
        Destination destination2Route5 = new Destination("Huis L", "Straat L 2", 3, 26);
        Destination destination3Route5 = new Destination("Huis M", "Straat M 3", 7, 27);
        Destination destination4Route5 = new Destination("Huis N", "Straat N 4", 2, 28);
        Destination destination5Route5 = new Destination("Huis O", "Straat O 5", 4, 29);
        Destination destination6Route5 = new Destination("Huis P", "Straat P 6", 6, 30);
        Destination destination7Route5 = new Destination("Huis Q", "Straat Q 7", 8, 31);

        route5.addDestination(destination1Route5);
        route5.addDestination(destination2Route5);
        route5.addDestination(destination3Route5);
        route5.addDestination(destination4Route5);
        route5.addDestination(destination5Route5);
        route5.addDestination(destination6Route5);
        route5.addDestination(destination7Route5);
        //=======================================//

        //=======ROUTE 6======//
        Route route6 = new Route();

        Destination destination1Route6 = new Destination("Huis AA", "Straat AA 1", 5, 35);
        Destination destination2Route6 = new Destination("Huis BB", "Straat BB 2", 3, 36);
        Destination destination3Route6 = new Destination("Huis CC", "Straat CC 3", 7, 37);
        Destination destination4Route6 = new Destination("Huis DD", "Straat DD 4", 2, 38);
        Destination destination5Route6 = new Destination("Huis EE", "Straat EE 5", 4, 39);
        Destination destination6Route6 = new Destination("Huis FF", "Straat FF 6", 6, 40);
        Destination destination7Route6 = new Destination("Huis GG", "Straat GG 7", 8, 41);

        route6.addDestination(destination1Route6);
        route6.addDestination(destination2Route6);
        route6.addDestination(destination3Route6);
        route6.addDestination(destination4Route6);
        route6.addDestination(destination5Route6);
        route6.addDestination(destination6Route6);
        route6.addDestination(destination7Route6);
        //=======================================//

        //=======ROUTE 7======//
        Route route7 = new Route();

        Destination destination1Route7 = new Destination("Huis HH", "Straat HH 1", 5, 45);
        Destination destination2Route7 = new Destination("Huis II", "Straat II 2", 3, 46);
        Destination destination3Route7 = new Destination("Huis JJ", "Straat JJ 3", 7, 47);
        Destination destination4Route7 = new Destination("Huis KK", "Straat KK 4", 2, 48);
        Destination destination5Route7 = new Destination("Huis LL", "Straat LL 5", 4, 49);
        Destination destination6Route7 = new Destination("Huis MM", "Straat MM 6", 6, 50);
        Destination destination7Route7 = new Destination("Huis NN", "Straat NN 7", 8, 51);

        route7.addDestination(destination1Route7);
        route7.addDestination(destination2Route7);
        route7.addDestination(destination3Route7);
        route7.addDestination(destination4Route7);
        route7.addDestination(destination5Route7);
        route7.addDestination(destination6Route7);
        route7.addDestination(destination7Route7);
        //=======================================//


        pizzaCompany.addRoute(route1);
        pizzaCompany.addRoute(route2);
        pizzaCompany.addRoute(route3);
        pizzaCompany.addRoute(route4);
        pizzaCompany.addRoute(route5);
        pizzaCompany.addRoute(route6);
        pizzaCompany.addRoute(route7);

        System.out.println(pizzaCompany.getTop3LongestRoutesWithMostPizzas());
    }
}