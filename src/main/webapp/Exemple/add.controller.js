

(function() {
    'use strict';
    

    angular
    .module('routerApp')
    .controller('addController', exampleCtrl);
    
    exampleCtrl.$inject = ['$scope', '$state', 'Product'];
    
    function exampleCtrl ($scope, $state, Product) {
    	
    	$scope.product = {};
    	
    	$scope.update= function(produit){
    		
    		$scope.product= produit;
    		Product.save(produit);
    		
    		$state.go('listProduct');
    		
   		Product.query(function(result){
    			
    			$scope.products=result;
    			
   		})
    	}

    }
    
})();