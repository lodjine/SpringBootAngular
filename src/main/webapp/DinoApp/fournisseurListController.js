angular.module("routerApp").controller('fournisseurListController', fournisseurListController);

fournisseurListController.$inject= ['$scope', 'fournisseurService', '$state', '$stateParams'];

		function fournisseurListController($scope, fournisseurService, $state, $stateParams) {
			
			$scope.fournisseurs=fournisseurService.query();
			$scope.fournisseurDialog={};
			
			$scope.deleteFournisseur = function(idFournisseur) {
				fournisseurService.delete({id:idFournisseur}, function(result) {
					$state.reload();
				})
			}
			
			$scope.selectFournisseur = function(fournisseur){
				$scope.fournisseurDialog=angular.copy(fournisseur);
			}
			
			$scope.updateFournisseur = function(fournisseurDialog) {
				fournisseurService.save(fournisseurDialog, function(result) {
					$scope.fournisseurs=fournisseurService.query();
					$state.go('fournisseurs');
				});
			}
		};