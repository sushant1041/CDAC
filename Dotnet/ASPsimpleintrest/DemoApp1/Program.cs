using DemoApp1.EndPoint;
var builder = WebApplication.CreateBuilder(args);

var app = builder.Build();
app.Map("/Home", Greeting.Welcome);
app.Map("/Intrest", Greeting.GetInterest);
app.Run();