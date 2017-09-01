angular.module('produitApp', ['produitApp.filters', 'produitApp.services', 'produitApp.directives', 'produitApp.controllers']).
    config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/produits', {templateUrl: 'produits.html', controller: 'ProduitsListCtrl'});
        $routeProvider.when('/produits/:id', {templateUrl: 'produits.html', controller: 'ProduitDetailCtrl'});
        $routeProvider.otherwise({redirectTo: '/produits'});
    }]);