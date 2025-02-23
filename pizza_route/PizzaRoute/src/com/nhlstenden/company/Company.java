package com.nhlstenden.company;

import com.nhlstenden.destination.Destination;
import com.nhlstenden.person.Person;
import com.nhlstenden.route.Route;
import com.nhlstenden.topThreeLongestRoute.TopThreeLongestRoute;
import com.sun.jdi.Value;

import javax.management.ValueExp;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Formattable;
import java.util.List;
import java.util.stream.Collectors;

public class Company
{
    public static final double TRAVEL_COST_IN_1KM = 0.05;
    private List<Route> routes;

    public Company()
    {
        this.routes = new ArrayList<>();
    }

    public List<Route> getRoutes ()
    {
        return routes;
    }

    public void setRoutes (List<Route> routes)
    {
        this.routes = routes;
    }

    public void addRoute(Route route)
    {
        this.routes.add(route);
    }

    public double getTotalSalaryForAllDriver()
    {
        double totalSalaryOfAllDrivers = 0.0;

        for (Route route : this.routes)
        {
            totalSalaryOfAllDrivers += route.getSalaryPerRoute(route.getPerson());
        }

        return totalSalaryOfAllDrivers;
    }

    public double getTotalTravelCostOfAllRoutes()
    {
        double totalTravelCostOfAllRoutes = 0.0;

        for (Route route : this.routes)
        {
            for (Destination destination : route.getDestinations())
            {
                totalTravelCostOfAllRoutes += (destination.getDistanceFromTheLastDestination() * TRAVEL_COST_IN_1KM);
            }
        }

        return totalTravelCostOfAllRoutes;
    }

    public double getTotalTravelCostOfEachRoute(Route route)
    {
        double totalTravelCostOfEachRoutes = 0.0;

        for (Destination destination : route.getDestinations())
        {
            totalTravelCostOfEachRoutes += destination.getDistanceFromTheLastDestination() * TRAVEL_COST_IN_1KM;
        }

        return totalTravelCostOfEachRoutes;
    }

    public int getTotalDistanceOfEachRoute(Route route)
    {
        int totalDistance = 0;

        for (Destination destination : route.getDestinations())
        {
            totalDistance += destination.getDistanceFromTheLastDestination();
        }

        return totalDistance;
    }

    public double getSalaryPerRoute(Person person)
    {
        double totalSalaryPerRoute = 0.0;

        for (Route route : this.routes)
        {
            totalSalaryPerRoute += route.getSalaryPerRoute(person);
        }

        return totalSalaryPerRoute;
    }

    public double getTotalProfitOfEachRoute(Route route)
    {
        double totalProfit = 0.0;

        for (Destination destination : route.getDestinations())
        {
            totalProfit += (destination.getAmountOfPizzas() * 5.0);
        }

        totalProfit -= this.getTotalTravelCostOfEachRoute(route);
        totalProfit -= this.getSalaryPerRoute(route.getPerson());

        return totalProfit;
    }

    public double getTotalProfitOfAllRoutes()
    {
        double totalProfit = 0.0;

        for (Route route : this.routes)
        {
            totalProfit += getTotalProfitOfEachRoute(route);
        }

        return totalProfit;
    }

    public Route getLongestRouteWithMostPizzas()
    {
        Route longestRoute = null;
        int longestDistance = 0;
        int mostAmountOfPizzas = 0;

        if (this.routes.isEmpty())
        {
            return null;
        }

        for (Route route : this.routes)
        {
            int totalDistance = this.getTotalDistanceOfEachRoute(route);
            int totalAmountOfPizzas = 0;
            for (Destination destination : route.getDestinations())
            {
                totalAmountOfPizzas += destination.getAmountOfPizzas();
            }
            if (totalDistance > longestDistance || (totalDistance == longestDistance && totalAmountOfPizzas > mostAmountOfPizzas))
            {
                mostAmountOfPizzas = totalAmountOfPizzas;
                longestDistance = totalDistance;
                longestRoute = route;
            }
        }

        return longestRoute;
    }

    public Route getShortestRouteWithMostPizzas()
    {
        Route shortestRoute = null;
        int shortestDistance = Integer.MAX_VALUE;
        int mostAmountOfPizzas = 0;

        if (this.routes.isEmpty())
        {
            return null;
        }

        for (Route route : this.routes)
        {
            int totalDistance = this.getTotalDistanceOfEachRoute(route);
            int totalAmountOfPizzas = 0;
            for (Destination destination : route.getDestinations())
            {
                totalAmountOfPizzas += destination.getAmountOfPizzas();

            }
            if (totalDistance < shortestDistance || (totalDistance == shortestDistance && totalAmountOfPizzas > mostAmountOfPizzas))
            {
                mostAmountOfPizzas = totalAmountOfPizzas;
                shortestDistance = totalDistance;
                shortestRoute = route;
            }
        }

        return shortestRoute;
    }

    public List<Route> getTop3LongestRoutesWithMostPizzas()
    {
        if (this.routes.isEmpty())
        {
            return new ArrayList<>();
        }

        return this.routes.stream()
                .sorted((route1, route2) -> {
                    int distanceComparison = Integer.compare(getTotalDistanceOfEachRoute(route2), getTotalDistanceOfEachRoute(route1));
                    if (distanceComparison != 0) {
                        return distanceComparison;
                    }
                    int pizzas1 = route1.getDestinations().stream().mapToInt(Destination::getAmountOfPizzas).sum();
                    int pizzas2 = route2.getDestinations().stream().mapToInt(Destination::getAmountOfPizzas).sum();
                    return Integer.compare(pizzas2, pizzas1);
                })
                .limit(3)
                .collect(Collectors.toList());
    }

    public TopThreeLongestRoute getTopThreeLongestRoutesWithMostPizzas()
    {
        List<Route> sortedRoutes = this.routes.stream()
                .sorted((route1, route2) -> {
                    int distanceComparison = Integer.compare(getTotalDistanceOfEachRoute(route2), getTotalDistanceOfEachRoute(route1));
                    if (distanceComparison != 0) {
                        return distanceComparison;
                    }
                    int pizzas1 = route1.getDestinations().stream().mapToInt(Destination::getAmountOfPizzas).sum();
                    int pizzas2 = route2.getDestinations().stream().mapToInt(Destination::getAmountOfPizzas).sum();
                    return Integer.compare(pizzas2, pizzas1);
                })
                .collect(Collectors.toList());

        Route top1 = sortedRoutes.size() > 0 ? sortedRoutes.get(0) : null;
        Route top2 = sortedRoutes.size() > 1 ? sortedRoutes.get(1) : null;
        Route top3 = sortedRoutes.size() > 2 ? sortedRoutes.get(2) : null;

        return new TopThreeLongestRoute(top1, top2, top3);
    }
}














