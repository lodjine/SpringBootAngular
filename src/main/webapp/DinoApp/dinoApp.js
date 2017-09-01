// app.js
var routerApp = angular.module('routerApp', [ 'ui.router', 'ngResource' ]);

routerApp.config(function($stateProvider, $urlRouterProvider) {
	$stateProvider

	// EXEMPLE !! ========================================
	.state('add', {
		url : '/add',
		templateUrl : 'partial-add.html',
		controller : 'addController'

	})

});