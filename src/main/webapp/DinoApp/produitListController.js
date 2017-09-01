angular.module("routerApp").controller('produitListController', produitListController);

produitListController.$inject= ['$scope', 'produitService'];

		function produitListController($scope, produitService) {
			
			$scope.produits=produitService.query();
			
		};