(function() {
    angular.module('routerApp').factory('magasinService', magasinService);

    magasinService.$inject = ['$resource'];

    function magasinService ($resource) {
    	var resourceUrl =  '/magasin/:id';
    	return $resource(resourceUrl, {}, {});      
    }
})();