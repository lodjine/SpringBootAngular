// app.js
var loginApp = angular.module('loginApp', ['ui.router']);

loginApp.config(function($stateProvider, $urlRouterProvider) {

    

    $stateProvider.state('login', {
            url: '/login',
            templateUrl: 'index.html',
			controller: 'loginCtrl'
        }).state('accueil', {
            url: '/accueil',
            templateUrl: 'accueil.html',
			
        });

});
