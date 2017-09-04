	
(function() {
    'use strict';
    angular
        .module('routerApp')
        .factory('fournisseurService', fournisseurService);

    fournisseurService.$inject = ['$resource'];

    function fournisseurService ($resource) {
    	
    	var resourceUrl =  '/fournisseurs/:id';
    	return $resource(resourceUrl, {}, {});
    	
        
    }
})();