
angular.module("loginApp").controller('loginCtrl', loginCtrl);

loginCtrl.$inject= ['$scope', '$rootScope', '$state','loginService', '$stateParams', '$window' ];

		function loginCtrl($scope,$rootScope,$state, loginService, $stateParams, $window) {
			
			$scope.selectUser=function selectUser() {
				var login=$scope.login;
				var mp=$scope.password;
				var list=loginService.getAll();
				var obj=loginService.getByLogin({log:login,pw:mp});
				
				if(list.indexOf(obj) !== -1) {
					  	alert('OK');
					}
				else{
					alert('NOK');
				}
				
				
				
				
				
			}
			

			
		};
