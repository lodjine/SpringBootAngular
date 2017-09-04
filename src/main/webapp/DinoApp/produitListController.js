angular.module("routerApp").controller('produitListController', produitListController);

produitListController.$inject= ['$scope', '$state','produitService'];

		function produitListController($scope,$state, produitService) {
			
			$scope.produits=produitService.query();
			$scope.produitDialog={};
			
			
			$scope.deleteProduit=function deleteProduit(id) {
				produitService.delete({id:id}, function(result){$state.reload();})
					
			}
			
			
			$scope.updateProduit = function(produitDialog) {
				produitService.save(produitDialog, function(result) {
					$scope.produits=produitService.query();
					$state.go('produits');
				});
			}
			
			$scope.getProduits=function getProduits() {
				if(produitService.query()){
					console.log("Liste des produits récupérée");
				}
				else{
					console.log("Echec de la récupération de la liste des produits");
				}
				
			}
			
			$scope.getProduit=function getProduit(id) {
				if(produitService.get({id:id}), function(result){$state.reload();}){
					console.log("Produits récupéré");
					$state.reload();	
				}
				else{
					console.log("Echec de la récupération du produit");
				}
				
			}
			
			$scope.selectProduit=function selectProduit(produit) {
				$scope.produitDialog=angular.copy(produit);
				
			}
			
		};