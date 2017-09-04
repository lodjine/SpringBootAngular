


var routerApp = angular.module('produitApp', [ 'ui.router', 'ngResource' ]);

routerApp.config(function($stateProvider, $urlRouterProvider) {
	$stateProvider
	
	.state('produits', {
		url : '/produits',
		templateUrl : 'produits.html',
		controller : 'produitListController'
	});

});
