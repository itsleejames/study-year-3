<?php
namespace App\Models;
use CodeIgniter\Model;
class AddressBookModel extends Model
{
    function __construct()
    {

//Connect to the database on class creation
        $this->db = \Config\Database::connect();
    }

    function addEntryMaster()
    {
        //Adds new name to the Master table
        //Data to add to the master_name table
        $f_name = $_POST['f_name'];
        $l_name = $_POST['l_name'];

        //Call Stored Procedure to insert into the master name Table
        $this->db->query("CALL addContactDetails('$f_name', '$l_name', @master_id)");

        //Retrieve the new master_id for the new contact just added
        $master_id_Value = $this->db->query("SELECT @master_id as master_id")->getRowArray();

        $master_id = $master_id_Value['master_id'];

        //Runs the insert statement and returns whether this function ran successfully
        return $master_id;
    }


    function addEntryAddress($master_id)
    {

        //Call Stored Procedure to insert into the address Table

        $address = $_POST['address'];
        $city = $_POST['city'];
        $town = $_POST['town'];
        $type = $_POST['add_type'];

        $this->db->query("CALL addAddressDetails($master_id, '$address', '$city', '$town', 				    '$type')");
    }

//Adds new Telephone Details to the Telephone Table
    function addEntryTelephone($master_id)
    {

        //Inserts telephone details from form into associative array with keys same name as 		database fields
        $telephoneNo = $_POST['tel_number'];
        $type = $_POST['tel_type'];

        //Call Stored Procedure to insert into the Telephone Table
        $this->db->query("CALL addPhoneDetails($master_id, '$telephoneNo', '$type')");

    }

//Adds new Email details to the Email table
    function addEntryEmail($master_id)
    {

        $email = $_POST['email'];
        $type = $_POST['email_type'];

        //Call Stored Procedure to insert into the Email Table
        $this->db->query("CALL addEmailDetails($master_id, '$email', 'email_type')");
    }


//Adds new fax details to the Fax table
    function addEntryFax($master_id)
    {

        $fax_number = $_POST['fax_number'];
        $type = $_POST['email_type'];

        //Call Stored Procedure to insert into the Fax Table
        $this->db->query("CALL addFaxDetails($master_id, '$fax_number','$type')");

    }
}


