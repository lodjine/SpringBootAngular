
var loginApp = angular.module('loginApp');

loginApp.controller('loginCtrl', function($scope,$window) {
   
	$scope.loginFct=function() {
		if($scope.login=="admin"&& $scope.password=="admin"){
			$window.location.href = '/accueil.html';
		}else{
			
			$scope.message="login et/ou password erroné!";
		}
	}
	
	
});
