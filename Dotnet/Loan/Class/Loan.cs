using System;
namespace Class;

public abstract class Loan
{
    private double principle;
    private float period;

    public Loan(double p, float t)
    {
        principle = p;
        period = t;
    }

    public double GetPrinciple()
    {
        return principle;
    }

    public void SetPrinciple(double p)
    {
        principle = p;
    }

    public float GetPeriod()
    {
        return period;
    }

    public void SetPeriod(float t)
    {
        period = t;
    }

    public abstract float GetRate();

    public double GetEMI()
    {
        return principle * (1 + GetRate() * period / 100) / (12 * period);
    }
}
