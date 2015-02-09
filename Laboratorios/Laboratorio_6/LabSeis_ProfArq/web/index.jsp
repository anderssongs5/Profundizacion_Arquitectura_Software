<%@page import="java.util.List"%>
<%@page import="co.edu.udea.profarq.labseis.dao.hibernate.impl.CustomerDAOImpl"%>
<%@page import="co.edu.udea.profarq.labseis.dao.ICustomerDAO"%>
<%@page import="co.edu.udea.profarq.labseis.dto.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
        <style type="text/css">
            html { height: 100% }
            body { height: 100%; margin: 0; padding: 0 }
            #googleMap { height: 100% }
        </style>
        <script type="text/javascript"
                src="http://maps.googleapis.com/maps/api/js?key=AIzaSyDa7hbMyrrW3vuVQGIAYk33ZKnoCEz27iI&sensor=false">
        </script>
        <script type="text/javascript">
            var GOOGLE_MAP_URL = 'https://maps.googleapis.com/maps/api/geocode/json?';
            var GOOGLE_NULL_RESPONSE = 'ZERO_RESULTS';

            var _fullNames = undefined;
            var _address = undefined;
            var _building = undefined;
            var _city = undefined;
            var _zip = undefined;

            function initialize() {
                createGoogleMap(6.267577, -75.568995, 16,
                        createInfoWindowContent('Universidad de Antioquia',
                                'Calle 67 #53 - 108', 'Medellín', 'Antioquia'));
            }

            function onShowGoogleMap(fullNames, address, building, city, zip) {
                _fullNames = fullNames;
                _address = address;
                _city = city;
                _building = building;
                _zip = zip;

                var xmlHTTP = new XMLHttpRequest();
                xmlHTTP.open('GET', GOOGLE_MAP_URL.concat('sensor=false&address=')
                        .concat(address).concat(', ').concat(city), true);
                xmlHTTP.onreadystatechange = function () {
                    if ((xmlHTTP.readyState === 4) && (xmlHTTP.status === 200)) {
                        var jsonResponse = JSON.parse(xmlHTTP.responseText);
                        var infoWindowContent = createInfoWindowContent(
                                _fullNames, _address, _building, _city, _zip);

                        document.getElementById('responseGoogleMapService').innerHTML
                                = xmlHTTP.responseText;

                        if (jsonResponse.status !== GOOGLE_NULL_RESPONSE) {
                            latitude = jsonResponse.results[0].geometry.location.lat;
                            longitude = jsonResponse.results[0].geometry.location.lng;

                            createGoogleMap(latitude, longitude, 17,
                                    infoWindowContent);
                        } else {
                            alert('No se ha podido obtener información desde el Servicio Web de Google.\n\n'
                                    .concat(infoWindowContent));

                            initialize();
                        }
                    }
                };
                xmlHTTP.send();
            }

            function createInfoWindowContent(data, address, building, city,
                    state) {
                var infoWindowContent = '<p><b>'.concat(data)
                        .concat('</b></p><p>').concat(address).concat(', ')
                        .concat(building).concat('</p><p><i>').concat(city)
                        .concat(', ').concat(state).concat('</i></p>');

                return (infoWindowContent);
            }

            function createGoogleMap(latitude, longitude, zoom, data) {
                var latLong = new google.maps.LatLng(latitude, longitude);
                var mapOptions = {
                    center: latLong,
                    zoom: zoom,
                    mapTypeId: google.maps.MapTypeId.ROADMAP
                };

                var map = new google.maps.Map(document
                        .getElementById('googleMap'), mapOptions);
                var marker = new google.maps.Marker({
                    position: latLong,
                    map: map
                });

                new google.maps.event.addListener(marker, 'click', function () {
                    new google.maps.InfoWindow({
                        content: data
                    }).open(map, marker);
                });
            }
        </script>
        <title>Laboratorio #6</title>
    </head>
    <body onload="initialize()" >
    <center>
        <h1>RESTful | Google Maps API</h1>
        <br />

        <%
            ICustomerDAO customerDAO = new CustomerDAOImpl();
            List<Customer> customersList = customerDAO.findAll();
        %>

        <table id="customerTable" border="1" >
            <tr>
                <th>Id</th>
                <th>Full Names</th>
                <th>Electronic Mail</th>
                <th>State</th>
                <th>City</th>
                <th>Zip</th>
                <th>Address Line #1</th>
                <th>Address Line #2</th>
                <th>Phone Number</th>
                <th>Fax</th>
                <th>Credit Limit</th>
                <th>Discount Code</th>
            </tr>
            <%
                for (Customer customer : customersList) {
            %>
            <tr>
                <td><%= customer.getCustomerId()%></td>
                <td><%= customer.getName()%></td>
                <td><%= customer.getEmail()%></td>
                <td><%= customer.getState()%></td>
                <td><%= customer.getCity()%></td>
                <td><%= customer.getZip()%></td>
                <td>
                    <input type="button" value="<%= customer.getAddressline1()%>"
                           onclick="onShowGoogleMap('<%= customer.getName()%>',
                                           '<%= customer.getAddressline1()%>',
                                           '<%= customer.getAddressline2()%>',
                                           '<%= customer.getCity()%>',
                                           '<%= customer.getZip()%>');" />
                </td>
                <td><%= customer.getAddressline2()%></td>
                <td><%= customer.getPhone()%></td>
                <td><%= customer.getFax()%></td>
                <td><%= customer.getCreditLimit()%></td>
                <td><%= customer.getDiscountCode()%></td>
            <tr>
                <%
                    }
                %>
        </table>
    </center>
    <br />

    <div id="googleMap" style="width: 100%; height: 50%"></div>
    <br />

    <div id="responseGoogleMapService" ></div>
    <br />
</body>
</html>