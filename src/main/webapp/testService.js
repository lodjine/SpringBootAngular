/**
 * http://usejsdoc.org/
 */
(function() {
    'use strict';
    angular
        .module('routerApp')
        .factory('Personne', Personne);

    Personne.$inject = ['$resource'];

    function Personne ($resource) {
    	
    	var resourceUrl =  '/users/:id';
    	return $resource(resourceUrl, {}, {});
    	
        
    }
})();