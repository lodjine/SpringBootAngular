var fournisseurService = angular.module('routerApp', ['ngResource']);
	
	fournisseurService.factory('fournisseurFactory', function($resource){
		return $resource('/fournisseurs',{},{
			query: { method: 'GET', isArray: true },
	        create: { method: 'POST' },
			show: { method: 'GET' }
		})
	})
	
		fournisseurService.factory('fournisseurIdFactory', function($resource){
		return $resource('/fournisseurs/:id',{},{
	        update: { method: 'PUT', params: {id: '@id'} },
	        delete: { method: 'DELETE', params: {id: '@id'} }

		})
	})