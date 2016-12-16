# webservices

## JAX-WS

To generate the support files for the client from an existing WSDL file provided by the server, run in the project folder of the client:

    wsimport -p support -keep -verbose -s src -d bin <wsdl_url>

This will create a "support" package with all the needed Java classes and interfaces.