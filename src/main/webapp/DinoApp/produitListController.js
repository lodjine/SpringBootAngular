var app = angular.module('produitApp.controllers', []);

app.controller('ProduitsListCtrl', ['$scope', 'ProduitsFactory', 'ProduitFactory', '$location',
    function ($scope, ProduitsFactory, ProduitFactory, $location) {

        // callback for ng-click 'editProduit':
        $scope.editProduit = function (idProduit) {
            $location.path('/produits/' + idProduit);
        };

        // callback for ng-click 'deleteProduit':
        $scope.deleteProduit = function (idProduit) {
            ProduitFactory.delete({ id: idProduit });
            $scope.produits = ProduitsFactory.query();
        };

        // callback for ng-click 'createProduit':
        $scope.createProduit = function () {
            $location.path('/produits');
        };

        $scope.produits = ProduitsFactory.query();
    }]);

app.controller('ProduitDetailCtrl', ['$scope', '$routeParams', 'ProduitFactory', '$location',
    function ($scope, $routeParams, ProduitFactory, $location) {

        // callback for ng-click 'updateProduit':
        $scope.updateProduit = function () {
            ProduitFactory.update($scope.produit);
            $location.path('/produits');
        };

        // callback for ng-click 'cancel':
        $scope.cancel = function () {
            $location.path('/produits');
        };

        $scope.produit = ProduitFactory.show({id: $routeParams.id});
    }]);