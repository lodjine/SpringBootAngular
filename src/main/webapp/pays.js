// app.js
var routerApp = angular.module('routerApp', ['ui.router']);

routerApp.config(function($stateProvider, $urlRouterProvider) {

    

    $stateProvider.state('londres', {
            url: '/londres',
            templateUrl: 'londres.html',
			controller: 'londresCtrl'
        }).state('paris', {
            url: '/paris',
            templateUrl: 'paris.html',
			controller: 'parisCtrl'
        }).state('home', {
            url: '/home',
            templateUrl: 'index.html'
        });

});

routerApp.controller('londresCtrl', function($scope) {
   $scope.pays="Je suis a londres"
});

routerApp.controller('parisCtrl', function($scope) {
    $scope.pays="Je suis a paris"
});