package com.nhlstenden.topThreeLongestRoute;

import com.nhlstenden.route.Route;

public class TopThreeLongestRoute
{
    private Route top1;
    private Route top2;
    private Route top3;

    public TopThreeLongestRoute(Route top1, Route top2, Route top3)
    {
        this.top1 = top1;
        this.top2 = top2;
        this.top3 = top3;
    }

    public Route getTop1 ()
    {
        return this.top1;
    }

    public void setTop1 (Route top1)
    {
        this.top1 = top1;
    }

    public Route getTop2 ()
    {
        return this.top2;
    }

    public void setTop2 (Route top2)
    {
        this.top2 = top2;
    }

    public Route getTop3 ()
    {
        return this.top3;
    }

    public void setTop3 (Route top3)
    {
        this.top3 = top3;
    }

    @Override
    public String toString ()
    {
        return "TopThreeLongestRoute\n" + "top1=" + top1 + "\ntop2=" + top2 + "\ntop3=" + top3;
    }
}
