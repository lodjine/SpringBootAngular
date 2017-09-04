(function() {
    'use strict';
    angular
        .module('routerApp')
        .factory('produitService', produitService);

    produitService.$inject = ['$resource'];

    function produitService ($resource) {
    	
    	var resourceUrl =  '/produit/:id';
    	return $resource(resourceUrl, {}, {});
    	
        
    }
})();