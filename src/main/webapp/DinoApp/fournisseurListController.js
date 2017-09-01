angular.module("routerApp").controller('fournisseurListController',
		[ '$scope', 'fournisseurService', function($scope, fournisseurService) {
			
			var test=fournisseurService.query();
			alert(test);
		
			
		} ]);