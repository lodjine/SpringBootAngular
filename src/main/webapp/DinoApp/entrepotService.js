(function() {
    'use strict';
    angular
        .module('routerApp')
        .factory('entrepotService', entrepotService);

    entrepotService.$inject = ['$resource'];

    function entrepotService ($resource) {
    	
    	var resourceUrl =  '/entrepot/:id';
    	return $resource(resourceUrl, {}, {});
        
    }
})();