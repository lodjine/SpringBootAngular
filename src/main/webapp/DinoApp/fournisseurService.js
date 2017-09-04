	
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



//(function() {
//    'use strict';
//    angular
//        .module('routerApp')
//        .factory('fournisseurService', fournisseurService);
//
//    fournisseurService.$inject = ['$resource'];
//
//    function fournisseurService ($resource) {
//    	
//    	var resourceUrl =  'url webService;
//    	return $resource(resourceUrl, {}, {});s
//    	
//        
//    }
//})();