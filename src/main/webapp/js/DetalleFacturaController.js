module.controller('DetalleFacturaCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    //listar
//   $scope.listaDetalles = null;
//   $scope.listaProductos=null;
//$scope.id=6;
//
//    $scope.datosDetalleFactura = {};
//    
//    $scope.getProducto=function(){
//        $http.get("./webresources/ServicioProducto",{})
//              .then(function(response) {
//                  console.log(response.data);
//                $scope.listaProductos = response.data;
//        }, function(){
//                        alert("error");
//        });
//    };
//    
//    $scope.agregar = function (data){
//        console.log("he oprimido agregar");
//        $scope.listaProductos={};
//    }
//     
//    $scope.getDetalleFactura=function(){
//        $http.get("./webresources/ServicioDetalleFactura",{})
//              .then(function(response) {
//                  console.log(response.data);
//                $scope.listaDetalles = response.data;
//        }, function(){
//                        alert("error");
//        });
//    };
//    
//    $scope.getDetalleFactura();
    
//    $scope.guardarMatricula=function(){
//        $http.post("./webresources/ServicioMatricula/nuevarMatricula",$scope.datosMatricula)
//            .then(function(response) {
//               $scope.getMatricula();
//        });
//    }
//    $scope.editarMatricula=function(){
//        $http.put("./webresources/ServicioMatricula/editarMatricula",$scope.datosMatricula)
//            .then(function(response) {
//               $scope.getMatricula(); 
//        });
//    }
//    $scope.eliminarMatricula=function(){
//        console.log("estamos borrando");
//        $http.delete("./webresources/ServicioMatricula/eliminarMatricula",$scope.datosMatricula)
//            .then(function(response) {
//               $scope.getMatricula()(); 
////       $scope.getFacultad();
//        });
//    }
//        

    
    //guardar
//    $scope.nuevo = function () {
//        $scope.panelEditar = true;
//        $scope.datosMatricula = {};
//    };
//    
//    $scope.guardar = function () {
//        $scope.errores = {};
//        console.log("voy linea 74 de controller matricula");
//        var error = false;
//        
//        if (error)
//            return;
//        
//        if (!$scope.datosMatricula.id){
//            console.log("sipiiiiiiiiiiiiiiiiiiiiii" ||$scope.datosMatricula.id);
//            $scope.datosMatricula.id = $scope.id++;
//            $scope.lista.push($scope.datosMatricula);
//             console.log("yo no estoy");
//            $scope.guardarMatricula();
//        }else{
//            $scope.editarMatricula();
//        }
//        $scope.panelEditar = false;
//    };
//    $scope.cancelar = function () {
//        $scope.panelEditar = false;
//        $scope.datosMatricula = {};
//    };
//
//    //editar
//    $scope.editar = function (data) {
//        $scope.panelEditar = true;
//        $scope.datosMatricula = data;
//    };
//    //eliminar
//    $scope.eliminar = function (data){
//        if (confirm('\xbfDesea elminar este registro?')) {    
//            for(var i=0; i<$scope.lista.length; i++){
//                if($scope.lista[i]===data){
//                    $scope.lista.splice(i,1);
//                    $scope.eliminarMatricula();
//                    break;
//                }
//            }
//        }
//    };
//       $scope.getMatricula();
//     $scope.getEstudiante();
//        $scope.getMateria();
     
 
}]);
