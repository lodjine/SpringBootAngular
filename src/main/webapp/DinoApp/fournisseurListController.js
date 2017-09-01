angular.module("routerApp").controller('fournisseurListController',
		[ '$scope', 'fournisseurFactory', 'fournisseurIdFactory','$location', function($scope, fournisseurFactory, fournisseurIdFactory, $location) {
			$scope.fournisseurs = fournisseurFactory.query();
		} ]);