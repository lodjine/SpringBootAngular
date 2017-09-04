angular.module("routerApp").controller('fournisseurListController', fournisseurListController);

fournisseurListController.$inject= ['$scope', 'fournisseurService'];

		function fournisseurListController($scope, fournisseurService) {
			
			$scope.fournisseurs=fournisseurService.query();
			
		};
		
		
	
		
//		
//		angular.module("app le nom donne dans fichier app.js").controller('le nom donne au controller', fournisseurListController);
//
//		fournisseurListController.$inject= ['$scope', 'service js utilise'];
//
//				function fournisseurListController($scope, service js utilise) {
//					
//					$scope.fournisseurs=fournisseurService.query();
//					
//				};