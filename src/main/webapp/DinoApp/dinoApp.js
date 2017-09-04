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

	.state('batiments', {
		url : '/batiments',
		templateUrl : 'batiments.html',
		controller : 'batimentListController'
	})

});
// .state('ce qui est cherche dans page html il fait le reste avec ui-sref'
// {url : 'ce qui est afficher comme url',
// templateUrl:'page charge', 
// controller: 'le controller utilise'})
