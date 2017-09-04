angular.module('routerApp').controller('entrepotListController', entrepotListController);

entrepotListController.$inject = ['$scope','entrepotService', '$state', '$stateParams'];

	function entrepotListController($scope, entrepotService, $state, $stateParams){
	
		$scope.entrepots=entrepotService.query();
		$scope.entrepotDialog={};
		
		$scope.deleteEntrepot = function(idEntrepot) {
			entrepotService.delete({id:idEntrepot}, function(result) {
				$state.reload();
			})
		}
		
		$scope.selectEntrepot = function(entrepot){
			$scope.entrepotDialog=angular.copy(entrepot);
		}
		
		$scope.updateEntrepot = function(entrepotDialog) {
			entrepotService.save(entrepotDialog, function(result) {
				$scope.entrepots=entrepotService.query();
				$state.go('entrepots');
			});
		}
	};