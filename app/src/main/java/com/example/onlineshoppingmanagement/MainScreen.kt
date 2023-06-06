package com.example.onlineshoppingmanagement
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.onlineshoppingmanagement.databinding.ActivityMainScreenBinding
import java.sql.ResultSet
import java.sql.Statement

class MainScreen : AppCompatActivity(){
    private lateinit var binding : ActivityMainScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnTable.setOnClickListener {
            startActivity(Intent(this,Tables::class.java))
        }

        binding.btnTable2.setOnClickListener {
          val connection = ConnectToDatabaseTask().connectToServer()
          if(connection!=null){
                val query = "SELECT cartName FROM category"
                val statement: Statement = connection.createStatement()
                val result: ResultSet = statement.executeQuery(query)
                val stringBuilder = StringBuilder()
                while (result.next()) {
                    val cartName = result.getString("cartName")
                    stringBuilder.append(cartName).append("\n")
                }

                val resultText = stringBuilder.toString()
                binding.tvData.text = resultText

                // Close the database connection and statement
                result.close()
                statement.close()
                connection.close()


            }
        }
    }

    }

//    private fun establishConnection(): Connection? {
//        var connection: Connection? = null
//
//        try {
//            // Load the MySQL Connector/J driver
//            Class.forName("com.mysql.cj.jdbc.Driver")
//            //127.0.0.1 ip
//            // 3306 port
//
//            // Establish the connection
//            val url = "jdbc:mysql://192.168.100.9:3306/OnlineShoppingManagementSystem"
//            val username = "talha"
//            val password = "talha"
//            connection = DriverManager.getConnection(url, username, password)
//        } catch (e: SQLException) {
//            e.printStackTrace()
//        } catch (e: ClassNotFoundException) {
//            e.printStackTrace()
//        }
//
//        return connection
//    }

