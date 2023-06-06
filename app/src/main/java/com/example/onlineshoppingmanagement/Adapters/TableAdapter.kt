package com.example.onlineshoppingmanagement.Adapters

import android.content.Context
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import com.example.onlineshoppingmanagement.R
import com.example.onlineshoppingmanagement.ShowFragments


class TableAdapter(context: Context, private val tables: Array<String>) : ArrayAdapter<String>(context, R.layout.tables, R.id.tvTableName, tables) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = super.getView(position, convertView, parent) // to create a view
        val buttonInsert = view.findViewById<Button>(R.id.buttonInsert)
        val buttonUpdate = view.findViewById<Button>(R.id.buttonUpdate)
        val buttonDelete = view.findViewById<Button>(R.id.buttonDelete)
        val buttonShow = view.findViewById<Button>(R.id.buttonShow)

        // Set click listeners for the buttons
        buttonInsert.setOnClickListener {
            // Handle insert button click
            handleInsertButtonClick(position)
        }

        buttonUpdate.setOnClickListener {
            // Handle update button click
            handleUpdateButtonClick(position)
        }

        buttonDelete.setOnClickListener {
            // Handle delete button click
            handleDeleteButtonClick(position)
        }

        buttonShow.setOnClickListener {
            // Handle show button click
            handleShowButtonClick(position)
        }

        return view
    }

    private fun handleInsertButtonClick(position: Int) {
        // Perform the necessary action when the insert button is clicked for the item at the given position
        val tableName = tables[position]
        Toast.makeText(context, "Insert button clicked for table: $tableName", Toast.LENGTH_SHORT)
            .show()



    }
    private fun handleUpdateButtonClick(position: Int) {
        // Perform the necessary action when the update button is clicked for the item at the given position
        val tableName = tables[position]
        Toast.makeText(context, "Update button clicked for table: $tableName", Toast.LENGTH_SHORT).show()
    }

    private fun handleDeleteButtonClick(position: Int) {
        // Perform the necessary action when the delete button is clicked for the item at the given position
        val tableName = tables[position]
        Toast.makeText(context, "Delete button clicked for table: $tableName", Toast.LENGTH_SHORT).show()
    }

    private fun handleShowButtonClick(position: Int) {
        // Perform the necessary action when the show button is clicked for the item at the given position
        val tableName = tables[position]
        Toast.makeText(context, "Show button clicked for table: $tableName", Toast.LENGTH_SHORT).show()
        val intent = Intent(context, ShowFragments::class.java)
        intent.putExtra("tableName","$tableName")
        context.startActivity(intent)

    }
}