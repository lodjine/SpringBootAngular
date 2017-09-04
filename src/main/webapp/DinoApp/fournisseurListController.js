angular.module("routerApp").controller('fournisseurListController', fournisseurListController);

fournisseurListController.$inject= ['$scope', 'fournisseurService', '$state', '$stateParams'];

		function fournisseurListController($scope, fournisseurService, $state, $stateParams) {
			$scope.fournisseurs=fournisseurService.query();
			
			$scope.deleteFournisseur = function(idFournisseur) {
				fournisseurService.delete({id:idFournisseur}, function(result) {
					$state.reload();
				})
			}
		};