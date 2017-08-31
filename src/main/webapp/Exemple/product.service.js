(function() {
    'use strict';
    angular
        .module('routerApp')
        .factory('Product', Product);

    Product.$inject = ['$resource'];

    function Product ($resource) {
    	
    	var resourceUrl =  '/produits/:id';
    	return $resource(resourceUrl, {}, {
//    		'delete': {
//      	      method: 'DELETE',
//      	      isArray: false,
//      	      url: '/produits/delete/:idProduit'
//      	    }
    	});
    	/*
        var resourceUrl =  '/produits/:page';
        return $resource(resourceUrl, {page:'@page'}, {});
        */
        
    }
})();