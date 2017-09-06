








(function() {
	'use strict';
	angular.module('loginApp').factory('loginService', loginService);

	loginService.$inject = [ '$resource' ];

	function loginService($resource) {

		var resourceUrl = '/user/:id';
		return $resource(resourceUrl, {}, {
			'getAll' : {
				method : 'GET',
				isArray : true,
				url : '/user'
			},
			'getByLogin' : {
				method : 'GET',
				isArray : false,
				url : '/userByLogin/:log/:pw'
			},
		'checkLogMp' : {
			method : 'GET',
			isArray : false,
			url : '/checkLogMp/:log/:pw'
		}
			
			
			 

		

		});

	}

})();