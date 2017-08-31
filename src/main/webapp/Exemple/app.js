// app.js
var routerApp = angular.module('routerApp', ['ui.router','ngResource']);

routerApp.config(function($stateProvider, $urlRouterProvider) {
    
    $urlRouterProvider.otherwise('/home');
    
    $stateProvider
        
      //   HOME STATES AND NESTED VIEWS ========================================
        .state('add', {
            url: '/add',
            templateUrl: 'partial-add.html',
            controller: 'addController'
           
        })
        
        
          .state('home', {
            url: '/home',
            templateUrl: 'partial-home.html',
            controller: 'HomeController'
           
        })
        // ABOUT PAGE AND MULTIPLE NAMED VIEWS =================================
        .state('listProduct', {
        	url: '/list',
        	templateUrl:'partial-list-produit.html',
        	controller:'listController'
        	
            // we'll get to this in a bit       
        })
        
         // detail produit =================================
        .state('detailProduit', {
        	url: '/about/:id',
        	templateUrl:'detail-produit.html',
        	controller:'DetailProduitController'
        	
            // we'll get to this in a bit       
        });
        
});

