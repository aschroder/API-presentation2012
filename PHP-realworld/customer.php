<?php

$client = 
  new SoapClient('http://www.mystore.com/magento/api/soap?wsdl');
$session = $client->login('testing', 'testing123$$');

$since = date("Y-m-d", strtotime('-1 day'));

$filters = array(
    'updated_at' => array('from' => $since)
);

$result = $client->call($session, 'customer.list', array($filters));

$email = "New customers since: $since\n";

foreach ($result as $customer) {
	
	$email .= $customer["firstname"] ." ". $customer["lastname"] . " " . $customer["email"] . "\n";
}

mail("customer-manager@mystore.com", "Customer report for: $since", $email);
