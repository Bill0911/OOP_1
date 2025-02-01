package com.nhlstenden.destination;

public class Destination
{
    private String name;
    private String address;
    private int distanceFromTheLastDestination;
    private int amountOfPizzas;

    public Destination(String name, String address, int distanceFromTheLastDestination, int amountOfPizzas)
    {
        this.name = name;
        this.address = address;
        this.distanceFromTheLastDestination = distanceFromTheLastDestination;
        this.amountOfPizzas = amountOfPizzas;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getAddress ()
    {
        return address;
    }

    public void setAddress (String address)
    {
        this.address = address;
    }

    public int getDistanceFromTheLastDestination ()
    {
        return distanceFromTheLastDestination;
    }

    public void setDistanceFromTheLastDestination (int distanceFromTheLastDestination)
    {
        this.distanceFromTheLastDestination = distanceFromTheLastDestination;
    }

    public int getAmountOfPizzas ()
    {
        return amountOfPizzas;
    }

    public void setAmountOfPizzas (int amountOfPizzas)
    {
        this.amountOfPizzas = amountOfPizzas;
    }

    @Override
    public String toString ()
    {
        return "Destination\n" + "name='" + name + '\'' + ", address='" + address + '\'' + ", distanceFromTheLastDestination=" + distanceFromTheLastDestination + ", amountOfPizzas=" + amountOfPizzas + "\n";
    }
}
