<?php

namespace App\Controllers;
use App\Models\AddressBookModel;
class Home extends BaseController
{

    function __construct()
    {
        /* Loads the form and url helper */
        helper(['form', 'url']);

        /* Loads the form_validation library to validate the AddEntry view*/
        $validation = \Config\Services::validation();

        /* Create instance of the AddressBook model – now can access all its methods*/
        $this->AddressBookModel = new AddressBookModel();
    }

    public function index()
    {
        /*Render the mymenu view */
        echo view('myMenu');
    }


    function AddEntry()
    {
        /*This method calls methods to add a new contact into the master_name table, return the primary key master_id of the new contact entered and enters the relevant details
            into the various tables for this master_id (insert_id) – master_id is foreign key in 		fax, email, telephone, address table  */

        //If the Submit was selected validate the addEntry form
        if (isset($_POST['submit'])) {
            //validation rules found in app/config/validation.php
            //If validation does not pass
            if (!$this->validate('user_validation_rules')) {
                //Get validator details - error messgaes etc.
                $data['validation'] = $this->validator;

                //Load the Add entry form with the validation errors
                echo view('addEntry', $data);
            } else    //Otherwise Adds details to master_name. If successfull add to the other //tables
//Calls the model method addEntryMaster, which returns the last insert id //value
                if ($insert_id = $this->AddressBookModel->addEntryMaster()) {
                    //Add the details to the relevant tables
                    $this->AddressBookModel->addEntryAddress($insert_id);
                    $this->AddressBookModel->addEntryEmail($insert_id);
                    $this->AddressBookModel->addEntryTelephone($insert_id);
                    $this->AddressBookModel->addEntryFax($insert_id);

                    //Reload the main menu
                    echo view('myMenu');
                }
        } else {
            //Load the Add Entry form
            echo view('addEntry');
        }
    }
}




