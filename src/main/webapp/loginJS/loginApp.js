// app.js
var loginApp = angular.module('loginApp', ['ui.router','ngResource']);

loginApp.config(function($stateProvider, $urlRouterProvider) {

    

    $stateProvider.state('login', {
            url: '/login',
            templateUrl: 'index.html',
			controller: 'loginCtrl'
        })

});
