
angular.module("loginApp").controller('loginCtrl', loginCtrl);

loginCtrl.$inject= ['$scope', '$rootScope', '$state','loginService', '$stateParams', '$window' ];

		function loginCtrl($scope,$rootScope,$state, loginService, $stateParams, $window) {
			
			$scope.selectUser=function selectUser() {
				var login=$scope.login;
				var mp=$scope.password;
				$rootScope.connectedUser=loginService.getByLogin({log:login},{pw:mp});		
				var user=$rootScope.connectedUser;
				
				if(user!=null){
					$window.location.href = '/accueil.html#/home';
				}
				else{
					$scope.message="erreur";
				}
				
			}
			

			
		};
