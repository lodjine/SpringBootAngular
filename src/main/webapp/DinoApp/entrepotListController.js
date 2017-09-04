angular.module('routerApp').controller('entrepotListController', entrepotListController);

entrepotListController.$inject = ['$scope','entrepotService'];

	function entrepotListController($scope, entrepotService){
	
		$scope.entrepots=entrepotService.query();
	
	};