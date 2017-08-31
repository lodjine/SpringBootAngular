(function() {
    'use strict';
    

    angular
    .module('routerApp')
    .controller('DetailProduitController', detailProductCtrl);
    
    detailProductCtrl.$inject = ['$scope', '$state', '$stateParams','Product'];
    

	    function detailProductCtrl($scope, $state, $stateParams, Product) {
	    	
	    	//$scope.test = " tester le scope"
	    		
	    	 var idProduct = $stateParams.id;	
	    	
	    	$scope.id = $stateParams.id;
	    	
	    	$scope.produit = Product.get({id:idProduct});
	    	console.log($scope.produit);
	    	 
	    	
	    	
		/*

		$scope.products = [];
		loadAll();
		function loadAll() {
			Product.query(function(result) {
				$scope.products = result;
			})
		}
		*/
	}
    
})();