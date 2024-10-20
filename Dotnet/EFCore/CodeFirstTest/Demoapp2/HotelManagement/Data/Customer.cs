using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;

namespace HotelManagement.Data
{
    public class Customer
    {
        //[Key] 
        public int Cid { get; set; }
        
        public string Name { get; set; }

        // One-to-many relationship (1 customer visits multiple hotels)
        public List<Hotel> Hotels { get; set; } = new List<Hotel>();
    }
}
