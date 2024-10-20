using Microsoft.EntityFrameworkCore;

namespace HotelManagement.Data
{
    public class CreaterDb : DbContext
    {
        public DbSet<Customer> Customers { get; set; }
        //public DbSet<Hotel> Hotels { get; set; } 

        public CreaterDb()
        {
            Database.EnsureCreated();
        }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseSqlite("Data Source=HotelManagement.db");
        }

    }
}
