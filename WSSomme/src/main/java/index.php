<?php
ini_set('soap.wsdl_cache_enabled', 0); // Disable WSDL cache
$wsdl = "http://localhost:8080/WSSomme/SommeWS?WSDL"; // WSDL URL
$service = new SoapClient($wsdl); // Create SOAP client
$params = array("a" => 5, "b" => 3); // Parameters to send
$result = $service->calculerSomme($params); // Call the web service
echo "La somme est : " . $result; // Output the result
?>
