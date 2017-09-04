(function() {
    'use strict';
    angular
        .module('routerApp')
        .factory('batimentService', batimentService);

    batimentService.$inject = ['$resource'];

    function batimentService ($resource) {
    	
    	var resourceUrl =  '/batiment/:id';
    	return $resource(resourceUrl, {}, {});
        
    }
})();