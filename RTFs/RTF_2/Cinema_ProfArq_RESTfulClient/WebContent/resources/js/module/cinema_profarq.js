var BILLBOARD_BY_THEATER_CITY = 'http://localhost:8080/cinema/rest/billboard/theater?';

var theaters = [ {
	theater : 'LOS MOLINOS',
	cityCode : '05001',
	cityName : 'MEDELLÍN'
}, {
	theater : 'UNICENTRO',
	cityCode : '05001',
	cityName : 'MEDELLÍN'
}, {
	theater : 'VIZCAYA',
	cityCode : '76001',
	cityName : 'CALI'
} ];

// / *** MODULES *** / //

var cinema_profarq = angular.module('cinema_profarq', [ 'ui.bootstrap' ]);

// / *** SERVICES *** / //

cinema_profarq.service('billboardByTheaterCity', function($http) {

	this.billboardsByTheatherCity = function(theaterName, cityCodeNumber) {

		return ($http({
			method : 'GET',
			url : BILLBOARD_BY_THEATER_CITY,
			params : {
				theater : theaterName,
				cityCode : cityCodeNumber
			}
		}));
	};
});

// / *** CONTROLLERS *** / //
cinema_profarq.controller('billboardController', function($scope,
		billboardByTheaterCity) {
	$scope.theaters = theaters;
	$scope.findBillboards = function() {
		if ($scope.selectedOption != '') {
			var temp = $scope.selectedOption.split(",");
			$scope.theaterName = temp[0];
			$scope.cityCodeNumber = temp[1];
		} else {
			alert('Por favor seleccione una opción');
			return;
		}

		billboardByTheaterCity.billboardsByTheatherCity($scope.theaterName,
				$scope.cityCodeNumber).success(function(data) {
			if (data != '') {
				$scope.billboards = data.billboard;
			} else {
				alert('No se han encontrado datos.');
			}
		});
	};
});
