<?php

use CodeIgniter\Router\RouteCollection;

/**
 * @var RouteCollection $routes
 */

$routes->get('/', 'Home::index');
$routes->get('/Menu', 'Home::index');
$routes->get('/Add', 'Home::AddEntry');
$routes->post('/Add', 'Home::AddEntry');

