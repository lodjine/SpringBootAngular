var services = angular.module('ngapp.services', ['ngResource']);

services.factory('ProduitsFactory', function ($resource) {
    return $resource('/produits', {}, {
        query: { method: 'GET', isArray: true },
        create: { method: 'POST' }
    })
});

services.factory('ProduitFactory', function ($resource) {
    return $resource('/produits/:id', {}, {
        show: { method: 'GET' },
        update: { method: 'PUT', params: {id: '@id'} },
        delete: { method: 'DELETE', params: {id: '@id'} }
    })
});