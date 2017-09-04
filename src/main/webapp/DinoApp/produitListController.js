angular.module("routerApp").controller('produitListController', produitListController);

produitListController.$inject= ['$scope', 'produitService'];

		function produitListController($scope, produitService) {
			
			$scope.produits=produitService.query();
			
			
			$scope.deleteProduit=function deleteProduit(id) {
				if(produitService.delete(id)){
					console.log("Produit supprimé");
					
				}
				else{
					console.log("echec de suppression");
				}
				
			}
			
			$scope.saveProduit=function saveProduit(produit) {
				if(produitService.save(produit)){
					console.log("Produit enregistré");
					
				}
				else{
					console.log("Echec de l'enregistrement du produit");
				}
				
			}
			
			$scope.updateProduit=function updateProduit(produit) {
				if(produitService.put(produit)){
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
				if(produitService.get({id:id})){
					console.log("Produits récupéré");
					
				}
				else{
					console.log("Echec de la récupération du produit");
				}
				
			}
			
			
		};