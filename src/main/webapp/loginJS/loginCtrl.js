
angular.module("loginApp").controller('loginCtrl', loginCtrl);

loginCtrl.$inject= ['$scope', '$rootScope', '$state','loginService', '$stateParams', '$window' ];

		function loginCtrl($scope,$rootScope,$state, loginService, $stateParams, $window) {
			
			$scope.selectUser=function selectUser() {
				var login=$scope.login;
				var mp=$scope.password;
				$scope.user=loginService.getByLogin({log:login,pw:mp});
				$scope.users=loginService.query();
				
				
				
				
				for(key in $scope.users) {
				    var obj = $scope.users[key];
				    alert(obj)	;			 
				}
				
				
				
			}
			

			
		};
