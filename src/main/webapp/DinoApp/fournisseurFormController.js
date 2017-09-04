angular.module("routerApp").controller('fournisseurFormController',
		fournisseurFormController);

fournisseurFormController.$inject = [ '$scope', 'fournisseurService', '$state',
		'$stateParams' ];

function fournisseurFormController($scope, fournisseurService, $state,
		$stateParams) {
	var idFournisseur = $stateParams.id;
	$scope.fournisseur = fournisseurService.get({
		id : idFournisseur
	});
	
	$scope.updateFournisseur = function(fournisseur) {
		fournisseurService.save(fournisseur);
		$state.go('fournisseurs');

	}
};