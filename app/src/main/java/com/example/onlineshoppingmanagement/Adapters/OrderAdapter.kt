package com.example.onlineshoppingmanagement.Adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.onlineshoppingmanagement.R

class OrderAdapter(
    private val context: Context,
    private val orderData: List<List<String>>
) : BaseAdapter() {

    override fun getCount(): Int {
        return orderData[0].size
    }

    override fun getItem(position: Int): Any {
        return orderData[0][position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_orders, parent, false)

        val oID: TextView = view.findViewById(R.id.tvOrderID)
        val oDate: TextView = view.findViewById(R.id.tvOrderDate)
        val oDeliverCharges: TextView = view.findViewById(R.id.tvDeliveryCharges)
        val orderStatus: TextView = view.findViewById(R.id.tvOrderStatus)
        val discount : TextView = view.findViewById(R.id.tvDiscountCoupon)
        val payment : TextView = view.findViewById(R.id.tvPaymentOID)
        val eId : TextView = view.findViewById(R.id.tvEmpOID)
        val cId : TextView = view.findViewById(R.id.tvCtOID)
        oID.text = orderData[0][position]
        oDate.text = orderData[1][position]
        oDeliverCharges.text = orderData[2][position]
        orderStatus.text = orderData[3][position]
        discount.text = orderData[4][position]
        payment.text = orderData[5][position]
        eId.text = orderData[6][position]
        cId.text = orderData[7][position]

        /* Create table Orders(
orderID int primary key,
orderdate date not null,
deliveryCharges float not null,
orderstatus varchar(20)  not null,
discountCoupon varchar(10),
paymentID int not null,
EMPID int not null,
CID int not null,
foreign key(CID) references customer(CID),
foreign key (empid) references Employee(empID),
foreign key (paymentID) references paymentMethod(paymentID)
);
*/



        return view
    }
}