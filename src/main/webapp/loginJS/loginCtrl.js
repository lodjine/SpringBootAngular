
angular.module("loginApp").controller('loginCtrl', loginCtrl);

loginCtrl.$inject= ['$scope', '$rootScope', '$state','loginService', '$stateParams', '$window','$http' ];




function loginCtrl($scope,$rootScope,$state, loginService, $stateParams, $window,$http) {
	
	$scope.selectUser=function selectUser() {
		
		
	  var user = {};
	  
	  
	  var login = $scope.login;
	  var mp = $scope.password;
	 
	  user=  loginService.getByLogin({log:login,pw:mp});
	  $scope.userJ=loginService.getByLogin({log:login,pw:mp});
	  
		$state.go('login');
		if(user!=null){
			$window.location.href = '/accueil.html#/home';
		}
		else{
			$scope.message="erreur";
		}
		
	}
	

	
};

