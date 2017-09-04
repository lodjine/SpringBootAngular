angular.module("routerApp").controller('fournisseurListController', fournisseurListController);

fournisseurListController.$inject= ['$scope', 'fournisseurService'];

		function fournisseurListController($scope, fournisseurService) {
			alert("00");
			$scope.fournisseurs=fournisseurService.query();
			
		};