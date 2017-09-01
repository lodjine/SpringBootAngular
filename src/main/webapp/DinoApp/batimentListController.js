angular.module('routerApp').controller('batimentListController', batimentListController);

batimentListController.$inject = ['$scope','batimentService'];

	function batimentListController($scope, batimentService){
	
		$scope.batiments=batimentService.query();
	
	};