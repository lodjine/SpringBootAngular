var routerApp = angular.module('routerApp', [ 'ui.router', 'ngResource' ]);

routerApp.config(function($stateProvider, $urlRouterProvider) {
	$stateProvider

	// Fournisseur ========================================
	.state('fournisseurs', {
		url : '/fournisseurs',
		templateUrl : 'fournisseurs.html',
		controller : 'fournisseurListController'
	})
	
	.state('produits', {
		url : '/produits',
		templateUrl : 'produits.html',
		controller : 'produitListController'
	})

});