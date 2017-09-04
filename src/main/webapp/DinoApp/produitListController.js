angular.module("routerApp").controller('produitListController', produitListController);

produitListController.$inject= ['$scope', '$state','produitService'];

		function produitListController($scope,$state, produitService) {
			
			$scope.produits=produitService.query();
			
			
			$scope.deleteProduit=function deleteProduit(id) {
				produitService.delete({id:id}, function(result){$state.reload();})
					
			}
			
			
			$scope.saveProduit=function saveProduit(produit) {
				if(produitService.save(produit)){
					console.log("Produit enregistré");
					$state.reload();				}
				else{
					console.log("Echec de l'enregistrement du produit");
				}
				
			}
			
			$scope.updateProduit=function updateProduit(produit) {
				if(produitService.put(produit)){
					console.log("Produit updaté");
					$state.reload();	
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
				if(produitService.get({id:id})){
					console.log("Produits récupéré");
					$state.reload();	
				}
				else{
					console.log("Echec de la récupération du produit");
				}
				
			}
			
			
		};