angular.module("routerApp").controller('fournisseurListController', fournisseurListController);

fournisseurListController.$inject= ['$scope', 'fournisseurService'];

		function fournisseurListController($scope, fournisseurService) {
			
			$scope.fournisseurs=fournisseurService.query();
			
		};