<?php

namespace Config;

use CodeIgniter\Config\BaseConfig;
use CodeIgniter\Validation\StrictRules\CreditCardRules;
use CodeIgniter\Validation\StrictRules\FileRules;
use CodeIgniter\Validation\StrictRules\FormatRules;
use CodeIgniter\Validation\StrictRules\Rules;

class Validation extends BaseConfig
{
    // --------------------------------------------------------------------
    // Setup
    // --------------------------------------------------------------------

    /**
     * Stores the classes that contain the
     * rules that are available.
     *
     * @var list<string>
     */
    public array $ruleSets = [
        Rules::class,
        FormatRules::class,
        FileRules::class,
        CreditCardRules::class,
    ];

    /**
     * Specifies the views that are used to display the
     * errors.
     *
     * @var array<string, string>
     */
    public array $templates = [
        'list' => 'CodeIgniter\Validation\Views\list',
        'single' => 'CodeIgniter\Validation\Views\single',
    ];

    // --------------------------------------------------------------------
    // Rules
    // --------------------------------------------------------------------


    public $user_validation_rules =
        ['f_name' => ['label' => 'First Name', 'rules' => 'required', 'errors' => ['required' => 'You MUST enter a {field}']],

            'l_name' => ['label' => 'Surname', 'rules' => 'required', 'errors' => ['required' => 'You MUST supply a {field}.']],


            'address' => ['label' => 'Address', 'rules' => 'required', 'errors' => ['required' => 'You MUST supply an {field}.']],

            'city' => ['label' => 'Address', 'rules' => 'required', 'errors' => ['required' => 'You MUST supply a {field}.']],

            'town' => ['label' => 'Town', 'rules' => 'required', 'errors' => ['required' => 'You MUST supply a {field}.']],


            'tel_number' => ['label' => 'Telephone Number', 'rules' => 'required', 'errors' => ['required' => 'You MUST supply a {field}.']],

            'email' => ['label' => 'Email Address ', 'rules' => 'required', 'errors' => ['required' => 'You MUST supply an {field}.']]
        ];
}

