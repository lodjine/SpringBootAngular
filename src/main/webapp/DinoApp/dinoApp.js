var routerApp = angular.module('routerApp', [ 'ui.router', 'ngResource' ]);

routerApp.config(function($stateProvider, $urlRouterProvider) {
	$stateProvider
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

	.state('magasins', {
		url : '/magasins',
		templateUrl : 'magasins.html',
		controller : 'magasinListController'
	})

	.state('entrepots', {
		url : '/entrepots',
		templateUrl : 'entrepots.html',
		controller : 'entrepotListController'
	})
	
	.state('home', {
		url : '/home',
		templateUrl : 'home.html',
	})
	
	.state('dinoTeam', {
		url : '/dinoTeam',
		templateUrl : 'dinoTeam.html',
	})
	
	.state('template', {
		url : '/accueil',
		templateUrl : 'accueil.html',
		controller : 'templateController'
	})
});

