(function() {
    'use strict';
    angular
        .module('routerApp')
        .factory('produitService', produitService);

    produitService.$inject = ['$resource'];

    function produitService ($resource) {
    	
    	var resourceUrl =  '/produits/:id';
    	return $resource(resourceUrl, {}, {});
    	
        
    }
})();