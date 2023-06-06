package com.example.onlineshoppingmanagement
import java.sql.ResultSet
import java.sql.Statement

class DatabaseFunctions {
    // employee, customer , department, category, vendor, orders, customerPhone
    //designation, product, offer, paymentMethod, OrderProduct, ProductOffer
    fun callProductOfferDataFunction(): List<List<String>> {
        val connection = ConnectToDatabaseTask().connectToServer()
        val productOfferID: MutableList<String> = mutableListOf()
        val offerID: MutableList<String> = mutableListOf()
        val productID: MutableList<String> = mutableListOf()

        if (connection != null) {
            val query = "SELECT * FROM productOffer"
            val statement: Statement = connection.createStatement()
            val result: ResultSet = statement.executeQuery(query)

            while (result.next()) {
                val productOfferIDValue = result.getString("productofferID")
                val offerIDValue = result.getString("offerID")
                val productIDValue = result.getString("productID")

                productOfferID.add(productOfferIDValue)
                offerID.add(offerIDValue)
                productID.add(productIDValue)
            }

            // Close the database connection and statement
            result.close()
            statement.close()
            connection.close()
        }

        return listOf(productOfferID, offerID, productID)
    }

    fun callOrderedProductDataFunction(): List<List<String>> {
        val connection = ConnectToDatabaseTask().connectToServer()
        val id: MutableList<String> = mutableListOf()
        val productQuantity: MutableList<String> = mutableListOf()
        val orderID: MutableList<String> = mutableListOf()
        val productID: MutableList<String> = mutableListOf()

        if (connection != null) {
            val query = "SELECT * FROM OrderedProduct"
            val statement: Statement = connection.createStatement()
            val result: ResultSet = statement.executeQuery(query)

            while (result.next()) {
                val idValue = result.getString("ID")
                val productQuantityValue = result.getString("productQuantity")
                val orderIDValue = result.getString("orderID")
                val productIDValue = result.getString("productID")

                id.add(idValue)
                productQuantity.add(productQuantityValue)
                orderID.add(orderIDValue)
                productID.add(productIDValue)
            }

            // Close the database connection and statement
            result.close()
            statement.close()
            connection.close()
        }

        return listOf(id, productQuantity, orderID, productID)
    }


    fun callPaymentMethodDataFunction(): List<List<String>> {
        val connection = ConnectToDatabaseTask().connectToServer()
        val paymentID: MutableList<String> = mutableListOf()
        val name: MutableList<String> = mutableListOf()

        if (connection != null) {
            val query = "SELECT * FROM paymentMethod"
            val statement: Statement = connection.createStatement()
            val result: ResultSet = statement.executeQuery(query)

            while (result.next()) {
                val paymentIDValue = result.getString("paymentID")
                val nameValue = result.getString("name")

                paymentID.add(paymentIDValue)
                name.add(nameValue)
            }

            // Close the database connection and statement
            result.close()
            statement.close()
            connection.close()
        }

        return listOf(
            paymentID, name
        )
    }

    fun callOfferDataFunction(): List<List<String>> {
        val connection = ConnectToDatabaseTask().connectToServer()
        val offerID: MutableList<String> = mutableListOf()
        val offerName: MutableList<String> = mutableListOf()
        val price: MutableList<String?> = mutableListOf()
        val startDate: MutableList<String?> = mutableListOf()
        val endDate: MutableList<String?> = mutableListOf()

        if (connection != null) {
            val query = "SELECT * FROM offer"
            val statement: Statement = connection.createStatement()
            val result: ResultSet = statement.executeQuery(query)

            while (result.next()) {
                val offerIDValue = result.getString("offerID")
                val offerNameValue = result.getString("offerName")
                val priceValue = result.getString("price")
                val startDateValue = result.getString("startDate")
                val endDateValue = result.getString("EndDate")

                offerID.add(offerIDValue)
                offerName.add(offerNameValue)
                price.add(priceValue)
                startDate.add(startDateValue)
                endDate.add(endDateValue)
            }

            // Close the database connection and statement
            result.close()
            statement.close()
            connection.close()
        }

        return listOf(
            offerID, offerName, price.map{it ?: ""}, startDate.map{it ?: ""}, endDate.map{it ?: ""}
        )
    }

    fun callProductDataFunction(): List<List<String>> {
        val connection = ConnectToDatabaseTask().connectToServer()
        val productID: MutableList<String> = mutableListOf()
        val name: MutableList<String> = mutableListOf()
        val brand: MutableList<String> = mutableListOf()
        val description: MutableList<String> = mutableListOf()
        val gender: MutableList<String> = mutableListOf()
        val price: MutableList<String> = mutableListOf()
        val vendorID: MutableList<String> = mutableListOf()
        val cartID: MutableList<String> = mutableListOf()

        if (connection != null) {
            val query = "SELECT * FROM Product"
            val statement: Statement = connection.createStatement()
            val result: ResultSet = statement.executeQuery(query)

            while (result.next()) {
                val productIDValue = result.getString("productID")
                val nameValue = result.getString("Name")
                val brandValue = result.getString("brand")
                val descriptionValue = result.getString("description")
                val genderValue = result.getString("gender")
                val priceValue = result.getString("price")
                val vendorIDValue = result.getString("vendorID")
                val cartIDValue = result.getString("cartID")

                productID.add(productIDValue)
                name.add(nameValue)
                brand.add(brandValue)
                description.add(descriptionValue)
                gender.add(genderValue)
                price.add(priceValue)
                vendorID.add(vendorIDValue)
                cartID.add(cartIDValue)
            }

            // Close the database connection and statement
            result.close()
            statement.close()
            connection.close()
        }

        return listOf(
            productID, name, brand, description, gender,
            price, vendorID, cartID
        )
    }

    fun callDesignationDataFunction(): List<List<String>> {
        val connection = ConnectToDatabaseTask().connectToServer()
        val desgID: MutableList<String> = mutableListOf()
        val desgName: MutableList<String> = mutableListOf()
        val salary: MutableList<String?> = mutableListOf()

        if (connection != null) {
            val query = "SELECT * FROM designation"
            val statement: Statement = connection.createStatement()
            val result: ResultSet = statement.executeQuery(query)

            while (result.next()) {
                val desgIDValue = result.getString("desgID")
                val desgNameValue = result.getString("desgName")
                val salaryValue = result.getString("Salary")

                desgID.add(desgIDValue)
                desgName.add(desgNameValue)
                salary.add(salaryValue)
            }

            // Close the database connection and statement
            result.close()
            statement.close()
            connection.close()
        }

        return listOf(desgID, desgName, salary.map{it ?: ""})
    }

    fun callCustomerPhoneDataFunction(): List<List<String>> {
        val connection = ConnectToDatabaseTask().connectToServer()
        val phoneNumber: MutableList<String> = mutableListOf()
        val CID: MutableList<String> = mutableListOf()

        if (connection != null) {
            val query = "SELECT * FROM CustomerPhone"
            val statement: Statement = connection.createStatement()
            val result: ResultSet = statement.executeQuery(query)

            while (result.next()) {
                val phoneNumberValue = result.getString("phoneNumber")
                val CIDValue = result.getString("CID")

                phoneNumber.add(phoneNumberValue)
                CID.add(CIDValue)
            }

            // Close the database connection and statement
            result.close()
            statement.close()
            connection.close()
        }

        return listOf(phoneNumber, CID)
    }

    fun callOrdersDataFunction(): List<List<String>> {
        val connection = ConnectToDatabaseTask().connectToServer()
        val orderID: MutableList<String> = mutableListOf()
        val orderDate: MutableList<String> = mutableListOf()
        val deliveryCharges: MutableList<String> = mutableListOf()
        val orderStatus: MutableList<String> = mutableListOf()
        val discountCoupon: MutableList<String?> = mutableListOf()
        val paymentID: MutableList<String> = mutableListOf()
        val empID: MutableList<String> = mutableListOf()
        val customerID: MutableList<String> = mutableListOf()

        if (connection != null) {
            val query = "SELECT * FROM Orders"
            val statement: Statement = connection.createStatement()
            val result: ResultSet = statement.executeQuery(query)

            while (result.next()) {
                val orderIdValue = result.getString("orderID")
                val orderDateValue = result.getString("orderdate")
                val deliveryChargesValue = result.getString("deliveryCharges")
                val orderStatusValue = result.getString("orderstatus")
                val discountCouponValue = result.getString("discountCoupon")
                val paymentIdValue = result.getString("paymentID")
                val empIdValue = result.getString("EMPID")
                val customerIdValue = result.getString("CID")

                orderID.add(orderIdValue)
                orderDate.add(orderDateValue)
                deliveryCharges.add(deliveryChargesValue)
                orderStatus.add(orderStatusValue)
                discountCoupon.add(discountCouponValue)
                paymentID.add(paymentIdValue)
                empID.add(empIdValue)
                customerID.add(customerIdValue)
            }

            // Close the database connection and statement
            result.close()
            statement.close()
            connection.close()
        }

        return listOf(
            orderID, orderDate, deliveryCharges, orderStatus,
            discountCoupon.map { it ?: "" }, paymentID, empID, customerID
        )
    }

    fun callVendorDataFunction(): List<List<String>> {
        val connection = ConnectToDatabaseTask().connectToServer()
        val vendorId: MutableList<String> = mutableListOf()
        val vendorName: MutableList<String> = mutableListOf()
        val vendorPhone: MutableList<String> = mutableListOf()

        if (connection != null) {
            val query = "SELECT vendorId, vendorName, vendorPhone FROM vendor"
            val statement: Statement = connection.createStatement()
            val result: ResultSet = statement.executeQuery(query)

            while (result.next()) {
                val vendorID = result.getString("vendorId")
                val vendorNameValue = result.getString("vendorName")
                val vendorPhoneValue = result.getString("vendorPhone")

                vendorId.add(vendorID)
                vendorName.add(vendorNameValue)
                vendorPhone.add(vendorPhoneValue)
            }

            // Close the database connection and statement
            result.close()
            statement.close()
            connection.close()
        }

        return listOf(vendorId, vendorName, vendorPhone)
    }

    fun callEmployeeDataFuntion(): List<List<String>> {
        val connection = ConnectToDatabaseTask().connectToServer()
        val employeeName: MutableList<String> = mutableListOf()
        val employeeId: MutableList<String> = mutableListOf()
        val employeeDOB: MutableList<String> = mutableListOf()
        val employeeDesgId: MutableList<String> = mutableListOf()
        val employeeSVID: MutableList<String> = mutableListOf()

        if (connection != null) {
            val query = "SELECT empId,empName,DOB,desgId FROM employee"
            val statement: Statement = connection.createStatement()
            val result: ResultSet = statement.executeQuery(query)

            while (result.next()) {
                val empID  = result.getString("empID")
                val empName = result.getString("empName")
                val empDOB = result.getString("DOB")
                val desgId = result.getString("desgID")
                val superVisorId = result.getString("supervisorID")

                employeeName.add(empName)
                employeeId.add(empID)
                employeeDOB.add(empDOB)
                employeeDesgId.add(desgId)
                employeeSVID.add(superVisorId)
            }

            // Close the database connection and statement
            result.close()
            statement.close()
            connection.close()
        }

        return listOf(employeeId, employeeName,employeeDOB,employeeDesgId,employeeSVID)
    }

    fun callDepartmentDataFunction(): List<List<String>> {
        val connection = ConnectToDatabaseTask().connectToServer()
        val deptId: MutableList<String> = mutableListOf()
        val deptName: MutableList<String> = mutableListOf()
        val location: MutableList<String> = mutableListOf()

        if (connection != null) {
            val query = "SELECT deptId, deptName, location FROM department"
            val statement: Statement = connection.createStatement()
            val result: ResultSet = statement.executeQuery(query)

            while (result.next()) {
                val deptID = result.getString("deptId")
                val deptNameValue = result.getString("deptName")
                val locationValue = result.getString("location")

                deptId.add(deptID)
                deptName.add(deptNameValue)
                location.add(locationValue)
            }

            // Close the database connection and statement
            result.close()
            statement.close()
            connection.close()
        }

        return listOf(deptId, deptName, location)
    }

    fun callCustomerDataFuntion(): List<List<String>> {
        val connection = ConnectToDatabaseTask().connectToServer()
        val customerName: MutableList<String> = mutableListOf()
        val customerId: MutableList<String> = mutableListOf()
        val customerAddress: MutableList<String> = mutableListOf()
        val customerEmail: MutableList<String> = mutableListOf()

        if (connection != null) {
            val query = "SELECT CID,name,address,mail from Customer"
            val statement: Statement = connection.createStatement()
            val result: ResultSet = statement.executeQuery(query)

            while (result.next()) {
                val cid = result.getString("CID")
                val name = result.getString("name")
                val address = result.getString("address")
                val mail = result.getString("mail")

                customerId.add(cid)
                customerName.add(name)
                customerAddress.add(address)
                customerEmail.add(mail)
            }

            // Close the database connection and statement
            result.close()
            statement.close()
            connection.close()
        }

        return listOf(customerId,customerName,customerAddress,customerEmail)
    }
    fun callCategoryDataFuntion(): List<List<String>> {
        val connection = ConnectToDatabaseTask().connectToServer()
        val categoryData: MutableList<String> = mutableListOf()
        val categoryIdData: MutableList<String> = mutableListOf()

        if (connection != null) {
            val query = "SELECT cartName, cartId FROM category"
            val statement: Statement = connection.createStatement()
            val result: ResultSet = statement.executeQuery(query)

            while (result.next()) {
                val cartName = result.getString("cartName")
                val cartId = result.getString("cartId")

                categoryData.add(cartName)
                categoryIdData.add(cartId)
            }

            // Close the database connection and statement
            result.close()
            statement.close()
            connection.close()
        }

        return listOf(categoryIdData, categoryData)
    }
}
