using Microsoft.Extensions.FileSystemGlobbing.Internal.PathSegments;

namespace DemoApp1.EndPoint;

public class Greeting
{
    public static async Task Welcome(HttpResponse response)
    {
        await response.WriteAsync(
            $"""
            <html>
                <head>
                    <title>Interest Calculator</title>
                </head>
                <body>
                    <h1>Simple interest Calculator</h1>
                    <p style="color : red;">
                        <b>Current Time: </b>{DateTime.Now}
                    </p>
                    <form method="POST" action="Intrest">
                        <label for="principal" style="color : red;">Enter Principal </label>
                        <input type="number" name="principal"/>
                        <label for="rate" style="color : green;">Enter Rate</label>
                        <input type="number" name="rate"/>
                        <label for="period" style="color : #79807b;">Enter period</label>
                        <input type="number" name="period"/>
                        <input type="submit" value="Get Intersest"/>
                    </form>
                </body>
            </html>
            """);
    }

    public static async Task GetInterest(HttpRequest request, HttpResponse response)
    {
        double p = double.Parse(request.Form["principal"]);
        double r = double.Parse(request.Form["rate"]);
        double t = double.Parse(request.Form["period"]);
        double interest = (p * r * t) / 100;
      
        await response.WriteAsync(
            $"""
            <html>
                <head>
                    <title>DemoApp</title>
                </head>
                <body>
                    <h1>principal:{p}  time:{t}  rate:{r}</h1>
                    <p>
                        <b>Simple interest is: </b>{interest}
                    </p>
                </body>
            </html> 
            """
        );
    }
}
