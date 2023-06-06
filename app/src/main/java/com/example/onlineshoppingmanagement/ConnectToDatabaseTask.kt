package com.example.onlineshoppingmanagement

import android.util.Log
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException


// ...
import android.os.StrictMode

class ConnectToDatabaseTask {
   // private val ip ="192.168.100.9"
    private val ip ="192.168.43.157"
    private val port = 1433
    private val db = "OnlineShoppingManagementSystem"
    private val uname= "talha"
    private val pass= "talha"
    fun connectToServer() : Connection? {
        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy (policy)
        var conn: Connection? = null
        val connString: String?
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            connString= "jdbc:jtds:sqlserver://"+ ip + ":"+ port+";"+ "databasename="+ db+";user="+uname+";password="+pass+";";
            conn = DriverManager.getConnection (connString)
            Log.i( "Success: ", "passed")
        }
        catch (ex: SQLException) {
            Log.e( "Error: ", "${ex.message}")
        }
        catch (ex1: ClassNotFoundException) {
            Log.e( "Error: " , "${ex1.message}")

        } catch (ex2: Exception) {

            Log.e("Error:", "${ex2.message}")
        }
        return conn
    }
}

//    fun connectToSqlServer(callback: ConnectionCallback) {
//        val serverName = "DESKTOP-LEO5FKV"
//        val databaseName = "OnlineShoppingManagementSystem"
//        val connectionUrl = "jdbc:sqlserver://$serverName;databaseName=$databaseName;integratedSecurity=true;"
//
//        GlobalScope.launch(Dispatchers.IO) {
//            try {
//                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver")
//                val connection = DriverManager.getConnection(connectionUrl)
//                callback.onConnectionSuccess(connection)
//                Log.i("Success","Success")
//            } catch (e: SQLException) {
//                callback.onConnectionError(e)
//            } catch (e: ClassNotFoundException) {
//                callback.onConnectionError(e)
//            }
//        }
//    }

