using System;

namespace HotelManagement.Data
{
    public class Hotel
    {
        public int HotelId { get; set; } 
        public string Name { get; set; }
        public DateTime Checkin { get; set; } = DateTime.Now;

       
        public int CustomerId { get; set; } // Foreign key

         // Many-to-one relationship
        public Customer Guest { get; set; }
    }
}
