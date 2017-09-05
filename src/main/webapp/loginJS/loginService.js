(function() {
	'use strict';
	angular.module('loginApp').factory('loginService', loginService);

	loginService.$inject = [ '$resource' ];

	function loginService($resource) {

		var resourceUrl = '/user/:id';
		return $resource(resourceUrl, {}, {

			'getByLogin' : {
				method : 'GET',
				isArray : false,
				url : '/userByLogin/:log/:pw'
			}

		});

	}

})();


