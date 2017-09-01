var routerApp = angular.module('routerApp', [ 'ui.router', 'ngResource' ]);

routerApp.config(function($stateProvider, $urlRouterProvider) {
	$stateProvider

	// Fournisseur ========================================
	.state('fournisseurs', {
		url : '/fournisseursMenu',
		templateUrl : 'fournisseurs.html',
		controller : 'fournisseurListController'
	})

});