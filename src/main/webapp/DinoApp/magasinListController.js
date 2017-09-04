angular.module('routerApp').controller('magasinListController', magasinListController);

magasinListController.$inject = ['$scope','magasinService'];

	function magasinListController($scope, magasinService){
	
		$scope.magasins=magasinService.query();
	
		
		$scope.deleteMagasin=function deleteMagasin(id) {
			magasinService.delete({id:id}, function(result){$state.reload();})
				
		}
		
		$scope.saveMagasin=function saveMagasin(Mmagasin) {
			if(MagasinService.save(magasin)){
				console.log("Magasin enregistré");
				$state.reload();				}
			else{
				console.log("Echec de l'enregistrement du magasin");
			}
			
		}
		
		$scope.updateMagasin=function updateMagasin(magasin) {
			if(magasinService.put(magasin)){
				console.log("Magasin updaté");
				$state.reload();	
			}
			else{
				console.log("Echec de l'update du magasin");
			}
			
		}
		
		$scope.getMagasins=function getMagasins() {
			if(magasinService.query()){
				console.log("Liste des magasins récupérée");
			}
			else{
				console.log("Echec de la récupération de la liste des magasins");
			}
			
		}
		
		$scope.getMagasin=function getMagasin(id) {
			if(magasinService.get({id:id})){
				console.log("Magasins récupéré");
				$state.reload();	
			}
			else{
				console.log("Echec de la récupération du Magasin");
			}
			
		}
	};