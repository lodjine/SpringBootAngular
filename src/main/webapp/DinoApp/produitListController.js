angular.module("routerApp").controller('produitListController', produitListController);

produitListController.$inject= ['$scope', '$state','produitService'];

		function produitListController($scope,$state, produitService) {
			
			$scope.produits=produitService.query();
			
			
			$scope.deleteProduit=function deleteProduit(id) {
				produitService.delete({id:id}, function(result){$state.reload();})
					
			}
			
			
			$scope.saveProduit=function saveProduit(produit) {
				produitService.save(produit), function(result){$state.reload();}
				
			}
			
			$scope.updateProduit=function updateProduit(produit) {
				produitService.put(produit), function(result){$state.reload();}){
					console.log("Produit updaté");	
				}
				else{
					console.log("Echec de l'update du produit");
				}
				
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
				$scope.produit=produit;
				
			}
			
			$scope.createProduit=function createProduit(produit){
				$scope.produit = null;
			}
			
			
		};