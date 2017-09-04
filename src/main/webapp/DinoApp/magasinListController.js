angular.module('routerApp').controller('magasinListController', magasinListController);

magasinListController.$inject = ['$scope','magasinService'];

	function magasinListController($scope, magasinService){
	
		$scope.magasins=magasinService.query();
		$scope.magasinDialog={};
			
		$scope.deleteMagasin=function deleteMagasin(id) {
			magasinService.delete({id:id}, function(result){
				$state.reload();
				})	
		}
				
		$scope.selectMagasin = function(magasin){
			$scope.magasinDialog=angular.copy(magasin);
		}
			
		$scope.updateMagasin = function(magasinDialog) {
			magasinService.save(magasinDialog, function(result) {
				$scope.magasins=magasinService.query();
				$state.go('magasins');
			});	
		}
	};