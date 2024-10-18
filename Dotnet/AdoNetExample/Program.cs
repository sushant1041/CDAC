using System;
using System.Data.SqlClient;

namespace AdoNetExample
{
    class Program
    {
        static void Main(string[] args)
        {
            // Connection string (update with your server, database, username, and password)
            string connectionString = "Server=127.0.0.1; Database=SampleDB; User Id=root; Password=root;";

            // Create a new SqlConnection
            using (SqlConnection connection = new SqlConnection(connectionString))
            {
                try
                {
                    // Open the connection
                    connection.Open();
                    Console.WriteLine("Connection opened successfully.");

                    // Create a SQL command
                    string sqlQuery = "SELECT * FROM Users"; // Query the Users table
                    SqlCommand command = new SqlCommand(sqlQuery, connection);

                    // Execute the command and read the data
                    using (SqlDataReader reader = command.ExecuteReader())
                    {
                        while (reader.Read())
                        {
                            // Assuming the first column is Id and the second is Name
                            Console.WriteLine($"Id: {reader[0]}, Name: {reader[1]}, Email: {reader[2]}");
                        }
                    }
                }
                catch (Exception ex)
                {
                    Console.WriteLine($"An error occurred: {ex.Message}");
                }
                finally
                {
                    // Ensure the connection is closed
                    if (connection.State == System.Data.ConnectionState.Open)
                    {
                        connection.Close();
                        Console.WriteLine("Connection closed.");
                    }
                }
            }
        }
    }
}

