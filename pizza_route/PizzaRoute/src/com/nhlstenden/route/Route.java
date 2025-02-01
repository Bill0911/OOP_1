package com.nhlstenden.route;

import com.nhlstenden.destination.Destination;
import com.nhlstenden.person.Person;

import java.util.ArrayList;
import java.util.List;

public class Route
{
    private List<Destination> destinations;
    private Person person;

    public Route()
    {
        this.destinations = new ArrayList<>();
    }

    public List<Destination> getDestinations ()
    {
        return destinations;
    }

    public void setDestinations (List<Destination> destinations)
    {
        this.destinations = destinations;
    }

    public Person getPerson ()
    {
        return person;
    }

    public void setPerson (Person person)
    {
        this.person = person;
    }

    public void addDestination(Destination destination)
    {
        this.destinations.add(destination);
    }

    public double getSalaryPerRoute(Person person)
    {
        if (person.getAge() >= 16 && person.getAge() < 20)
        {
            return 4.0;
        }
        else if (person.getAge() >= 20 && person.getAge() <= 22)
        {
            return 4.75;
        }
        else
        {
            return 5.25;
        }
    }

    @Override
    public String toString ()
    {
        return "Route\n" + "destinations=" + destinations + ", person=" + person;
    }
}
