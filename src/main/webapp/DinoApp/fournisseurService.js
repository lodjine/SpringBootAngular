(function() {
	angular.module('routerApp').factory('fournisseurService',
			fournisseurService);

	fournisseurService.$inject = [ '$resource' ];

	function fournisseurService($resource) {
		var resourceUrl = '/fournisseur/:id';
		return $resource(resourceUrl, {}, {});
	}
})();