angular.module('routerApp').controller('magasinListController', magasinListController);

magasinListController.$inject = ['$scope','magasinService'];

	function magasinListController($scope, magasinService){
	
		$scope.magasins=magasinService.query();
	
	};